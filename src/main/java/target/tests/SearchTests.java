package main.java.target.tests;

import main.java.BaseTest;
import main.java.target.data.SearchData;
import main.java.target.objects.BaseElements;
import main.java.target.pages.Search;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SearchTests extends BaseTest {
     private final Search search = new Search();
    @Test(testName = "Verify SearchField",
            description = "Verify is SearchField is present on page")
    public void verifySearchFieldPresence() {

        Assert.assertTrue(BaseTest.driver.findElement(BaseElements.searchField).isDisplayed());
    }

    @Test(testName = "Verify EbaySearch Button",
            description = "Verify is EbaySearch Button is present on page")
    public void verifySearchButtonPresence() {

        Assert.assertTrue(BaseTest.driver.findElement(BaseElements.searchButton).isDisplayed());
    }

    @Test(testName = "No EbaySearch Results",
            description = "Verify that there is no EbaySearch Results present before searching for a product")
    public void verifyResultsListPresence() {

        Assert.assertEquals(BaseTest.driver.findElements(BaseElements.searchResults).size(), 0);
    }


    @Test(testName = "Search Product",
            dataProvider = "searchProducts", dataProviderClass = SearchData.class)
    public void searchAndResultsDisplayed(String productSearch) {
        // ---- Get dynamic filename to save EbaySearch results
        String filename = BaseTest.getLogFileName("TargetSearch", productSearch);
        // ---- Initialize Classes
        BufferedWriter writer = null;
//        EbaySearch for product name
        search.searchForItem(productSearch);
//        Wait X seconds for EbaySearch Results to appear
        fluentWaitSecondsUntilLocated(10, BaseElements.searchResults);
//        Results are loaded, assign it
        List<WebElement> searchResultElements = search.getResultsList();
//        Filter sponsored links out
        // ---- Set the class for non-sponsored results
        String targetClassName = searchResultElements.get(0).getAttribute("class").split((" "))[1];

        try {
            writer = new BufferedWriter(new FileWriter(filename));
            for (int index = 0; index < searchResultElements.size(); index++) {
//                XPATH indexes are 1 based (not 0 based like Array Indexes)
                int currentResultIndex = index + 1;
//                Check if element's class name matches the non-sponsored one
                String currentClassName = search.getResult(currentResultIndex).getAttribute("class").split(" ")[1];
                if (currentClassName.equals(targetClassName)) {
//                    Get Listed product from Results
                    WebElement currentResult = search.getResult(currentResultIndex);
//                    Jump to element to force load of data
                    ((JavascriptExecutor) BaseTest.driver).executeScript("arguments[0].scrollIntoView(true);", currentResult);
//                    Only Titles load automatically, wait until Price is loaded
                    fluentWaitSecondsUntilLocated(5, BaseElements.resultPrice);
//                    Assign Title and Price to variable
                    WebElement currentTitle = search.getResultTitle(currentResultIndex);
                    WebElement currentPrice = search.getResultPrice(currentResultIndex);
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
            Assert.fail("For loop failed. Exported list is NOT complete!");
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
