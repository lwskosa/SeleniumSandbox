package main.java.ebay.pages;

import main.java.ebay.objects.HomePageElements;
import org.openqa.selenium.Keys;
import main.java.ElementFinder;


public class HomePage {
    ElementFinder fetch = new ElementFinder();


    public void searchForItem(String searchQuery) {
        fetch.getElement(HomePageElements.searchField).sendKeys(searchQuery);
        fetch.getElement(HomePageElements.searchButton).click();
    }

    public void searchForProductEnter(String searchQuery){
        fetch.getElement(HomePageElements.searchField).sendKeys(searchQuery, Keys.RETURN);
    }

}
