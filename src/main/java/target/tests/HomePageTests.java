package main.java.target.tests;

import main.java.target.objects.HomePageElements;
import main.java.target.pages.HomePage;
import org.openqa.selenium.JavascriptExecutor;
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
     private HomePage homePage = new HomePage();
    @Test(testName = "Verify SearchField",
            description = "Verify is SearchField is present on page")
    public void verifySearchFieldPresence() {
        ElementFinder fetch = new ElementFinder();
        Assert.assertTrue(fetch.getElement(HomePageElements.searchField).isDisplayed());
    }

    @Test(testName = "Verify Search Button",
            description = "Verify is Search Button is present on page")
    public void verifySearchButtonPresence() {
        ElementFinder fetch = new ElementFinder();
        Assert.assertTrue(fetch.getElement(HomePageElements.searchButton).isDisplayed());
    }

    @Test(testName = "Can Search for Product",
            description = "Can the user search for a desired item?")
    @Parameters({"productSearch"})
    public void searchForItem(String productSearch) {
        HomePage homePage = new HomePage();
        homePage.searchForItem(productSearch);
    }

    @Test(testName = "No Search Results",
            description = "Verify that there is no Search Results present before searching for a product")
    public void verifyResultsListPresence() {
        ElementFinder fetch = new ElementFinder();
        Assert.assertTrue(fetch.getElements(HomePageElements.searchResults).size() == 0);
    }


    @Test(testName = "Search and display Results",
            description = "Verify that Search Results are displayed after a search")
    @Parameters({"productSearch"})
    public void searchAndResultsDisplayed(String productSearch) {
//        Initialize Local Variables
        // ---- Title of Product
        String title = "";
        // ---- Price of Product
        String price = "";
        // ---- Get dynamic filename to save Search results
        String filename = Base.getFileName("TargetSearch", productSearch);
        // ---- Initialize Classes
        BufferedWriter writer = null;
        ElementFinder fetch = new ElementFinder();
        StringBuilder sb = new StringBuilder();

//        Search for product name
        homePage.searchForItem(productSearch);
//        Wait X seconds for Search Results to appear
        fluentWaitSecondsUntilLocated(10, HomePageElements.searchResults);
//        Results are loaded, assign it
        List<WebElement> searchResultElements = homePage.getResultsList();
//        Filter sponsored links out
        // ---- Set the class for non-sponsored results
        String targetClassName = searchResultElements.get(0).getAttribute("class").split((" "))[1];

        try {
            writer = new BufferedWriter(new FileWriter(filename));
            for (int index = 0; index < searchResultElements.size(); index++) {
//                XPATH indexes are 1 based (not 0 based like Array Indexes)
                int currentResultIndex = index + 1;
//                Check if element's class name matches the non-sponsored one
                String currentClassName = homePage.getResult(currentResultIndex).getAttribute("class").split(" ")[1];
                if (currentClassName.equals(targetClassName)) {
//                    Get Listed product from Results
                    WebElement currentResult = homePage.getResult(currentResultIndex);
//                    Jump to element to force load of data
                    ((JavascriptExecutor) Base.driver).executeScript("arguments[0].scrollIntoView(true);", currentResult);
//                    Only Titles load automatically, wait until Price is loaded
                    fluentWaitSecondsUntilLocated(5, HomePageElements.resultPrice);
//                    Assign Title and Price to variable
                    WebElement currentTitle = homePage.getResultTitle(currentResultIndex);
                    WebElement currentPrice = homePage.getResultPrice(currentResultIndex);
                    if (!(currentPrice.getText().startsWith("$") || currentPrice.getText().contains("Price"))) {
                        Assert.fail("Test failed - no valid price found for product!");
                    }
                    // ---- Original method
//                    writer.append(String.format("%s - %s\n", currentTitle.getText(), currentPrice.getText()));

//                    Better formatting for text output
                    // ---- Dynamically set pad amount
                    int padAmount = (currentPrice.getText().length() <= "Price Varies".length()) ? 13 : "$xxx.yy - $xxx.yy".length();
                    //            Save result to file
                    writer.append(String.format("%s - %s\n", padLeft(padAmount,currentPrice.getText()),currentTitle.getText()));

                } else {
//                    Skip sponsored results
                    continue;
                }

            }

        } catch (Exception e) {

            e.printStackTrace();
            Assert.fail(String.format("For loop failed. Exported list is NOT complete!"));
        } finally {
//            Gracefully close file and release handles
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    // ---- Unable to release handles
                    System.out.println("Unable to close file!");
                    e.printStackTrace();
                }

            }
//            At least 1 result is needed
            Assert.assertTrue(searchResultElements.size() > 0);
        }

    }// END OF searchAndResultsDisplayed METHOD
}// END OF CLASS
