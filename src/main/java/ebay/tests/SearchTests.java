package main.java.ebay.tests;

import main.java.BaseTest;
import main.java.ebay.data.SearchData;
import main.java.ebay.objects.SearchElements;
import main.java.ebay.pages.EbaySearch;
import main.java.ebay.utils.Product;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SearchTests extends BaseTest {

    @Test(testName    = "Verify SearchField",
          description = "Verify is SearchField is present on page")
    public void verifySearchFieldPresence(){
        Assert.assertTrue(BaseTest.driver.findElement(SearchElements.searchField).isDisplayed());
    }

    @Test(testName    = "Verify EbaySearch Button",
          description = "Verify is EbaySearch Button is present on page")
    public void verifySearchButtonPresence(){
        Assert.assertTrue(BaseTest.driver.findElement(SearchElements.searchButton).isDisplayed());
    }

    @Test(testName     = "EbaySearch Item",
          description  = "Can the user search for a desired item?",
          dataProvider = "searchProducts", dataProviderClass = SearchData.class)
    public void searchForItem(String productSearch){
        EbaySearch ebaySearch = new EbaySearch();
        ebaySearch.searchForItem(productSearch);
    }

    @Test(testName    = "No EbaySearch Results",
          description = "Verify that there is no EbaySearch Results present before searching for a product")
    public void verifyResultsListPresence(){
        Assert.assertEquals(BaseTest.driver.findElements(SearchElements.searchResults).size(), 0);
    }


    @Test(testName    = "EbaySearch and Results",
          description = "Verify that EbaySearch Results are displayed after a search",
          dataProvider = "searchProducts", dataProviderClass = SearchData.class)
    public void searchAndResultsDisplayed(String productSearch){
//        Initialize Local Variables
        // ---- Title of Product
        String title;
        // ---- Price of Product
        String price;
        // Helper String to tell old or new listings apart
        final String newListingLabel = "NEW LISTING";
        // ---- Get dynamic filename to save EbaySearch results
        String filename = BaseTest.getLogFileName("EbaySearch",productSearch);
        BufferedWriter writer = null;
        // ---- Initialize Classes
        EbaySearch ebaySearch = new EbaySearch();
//        EbaySearch for product name
        ebaySearch.searchForItem(productSearch);
//        Wait X seconds for EbaySearch Results to appear
        fluentWaitSecondsUntilLocated(10, SearchElements.searchResults);
//        Get list of Elements of EbaySearch Results
        List<WebElement> result = BaseTest.driver.findElements(SearchElements.searchResults);
        try {
            writer = new BufferedWriter(new FileWriter(filename));
            for (WebElement element : result) {
                // ---- Convert Element contents to Array for easier data handling
                String[] productList = element.getText().split("\n");

//                Multiple formats are used - Depending on listing's type, there are different order for elements'
                // ---- Initialize Index helper variable
                int priceIndex = 0;
                // ---- Determine the location of the Listing's Price
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
            Assert.fail("For loop failed. Exported list is NOT complete!");
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
//        At least ONE result must be found for ebaySearch
        Assert.assertTrue(result.size() > 0);
    }// METHOD END
}// CLASS END
