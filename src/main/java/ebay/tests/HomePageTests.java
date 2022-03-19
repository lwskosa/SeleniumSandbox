package main.java.ebay.tests;

import main.java.ebay.objects.HomePageElements;
import main.java.ebay.pages.HomePage;
import main.java.ebay.utils.Product;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import main.java.Base;
import main.java.ElementFinder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class HomePageTests extends Base {

    @Test(testName    = "Verify SearchField",
          description = "Verify is SearchField is present on page")
    public void verifySearchFieldPresence(){
        ElementFinder fetch = new ElementFinder();
        Assert.assertTrue(fetch.getElement(HomePageElements.searchField).isDisplayed());
    }

    @Test(testName    = "Verify Search Button",
          description = "Verify is Search Button is present on page")
    public void verifySearchButtonPresence(){
        ElementFinder fetch = new ElementFinder();
        Assert.assertTrue(fetch.getElement(HomePageElements.searchButton).isDisplayed());
    }

    @Test(testName    = "Search Item",
          description = "Can the user search for a desired item?")
    @Parameters({"productSearch"})
    public void searchForItem(String productSearch){
        HomePage homePage = new HomePage();
        homePage.searchForItem(productSearch);
    }

    @Test(testName    = "No Search Results",
          description = "Verify that there is no Search Results present before searching for a product")
    public void verifyResultsListPresence(){
        ElementFinder fetch = new ElementFinder();
        Assert.assertTrue(fetch.getElements(HomePageElements.searchResults).size() == 0);
    }


    @Test(testName    = "Search and Results",
          description = "Verify that Search Results are displayed after a search")
    @Parameters({"productSearch"})
    public void searchAndResultsDisplayed(String productSearch){
//        Initialize Local Variables
        // ---- Title of Product
        String title = "";
        // ---- Price of Product
        String price = "";
        // Helper String to tell old or new listings apart
        final String newListingLabel = "NEW LISTING";
        // ---- Get dynamic filename to save Search results
        String filename = Base.getFileName("EbaySearch",productSearch);
        BufferedWriter writer = null;
        // ---- Initialize Classes
        HomePage homePage   = new HomePage();
        ElementFinder fetch = new ElementFinder();
//        Search for product name
        homePage.searchForItem(productSearch);
//        Wait X seconds for Search Results to appear
        fluentWaitSecondsUntilLocated(10,HomePageElements.searchResults);
//        Get list of Elements of Search Results
        List<WebElement> result = fetch.getElements(HomePageElements.searchResults);
        try {
            writer = new BufferedWriter(new FileWriter(filename));
            for (WebElement element : result) {
                // ---- Convert Element contents to Array for easier data handling
                String[] productList = element.getText().split("\n");
//                StringBuilder sb = new StringBuilder();
//                for(int i=0; i<productList.length;i++){
//                    sb.append(String.format("\t[%d] - %s\n",i,productList[i]));
//                }

//                Multiple formats are used - Depending on listing's type, there are different order for elements'
                // ---- Initialize Index helper variable
                int priceIndex = 0;
                // ---- Detemine the location of the Listing's Price
                for (int i = 1; i < productList.length ;i++){
                    if (productList[i].startsWith("$")){
                        // ---- Save Index value for Price
                        priceIndex = i;
                        break;
                    }
                }

                // ---- Get PRICE for Product
                price = productList[priceIndex];
                // ---- Get TITLE for Product
                title = productList[Product.TITLE];
                // ---- Set proper Label for Listing's type
                title = (title.startsWith(newListingLabel)) ?
                        title.replaceFirst(newListingLabel, newListingLabel + " - ") : "OLD LISTING - " + title;
                // ---- Write results to TXT file in required format
                writer.append(String.format("%s - %s\n", title, price));
            }
        }catch(Exception e) {
            e.printStackTrace();
            Assert.fail(String.format("For loop failed. Exported list is NOT complete!"));
        }finally {
//            Gracefully close file and release handles
                if (writer != null) {
                    try {
                        writer.close();
                    }
                    catch (IOException e) {
                        // ---- Unable to release handles
                        System.out.println("Unable to close file!");
                        e.printStackTrace();
                    }
                }
            }
//        At least ONE result must be found for search
        Assert.assertTrue(result.size() > 0);
    }// METHOD END
}// CLASS END
