package main.java.ebay.pages;

import main.java.BaseTest;
import main.java.ebay.objects.SearchElements;
import org.openqa.selenium.Keys;

public class EbaySearch {

    public void searchForItem(String searchQuery) {
        BaseTest.driver.findElement(SearchElements.searchField).sendKeys(searchQuery);
        BaseTest.driver.findElement(SearchElements.searchButton).click();
    }

    public void searchForProductEnter(String searchQuery){
        BaseTest.driver.findElement(SearchElements.searchField).sendKeys(searchQuery, Keys.RETURN);
    }

}
