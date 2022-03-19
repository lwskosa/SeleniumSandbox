package main.java.target.pages;

import main.java.target.objects.HomePageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import main.java.Base;
import main.java.ElementFinder;

import java.util.List;

public class HomePage {


    ElementFinder fetch = new ElementFinder();

    public void searchForItem(String searchQuery) {
        fetch.getElement(HomePageElements.searchField).sendKeys(searchQuery);
        fetch.getElement(HomePageElements.searchButtonWPopup).click();
    }

    public List<WebElement> getResultsList(){
        return fetch.getElements(HomePageElements.searchResults);
    }


    public WebElement getResult(int resultNumber){
        By result = By.xpath(String.format("//*[@id=\"pageBodyContainer\"]/div[1]/div/div[4]/div/div[1]/div[2]/div/section/div/div[%d]",resultNumber));
        return Base.driver.findElement(result);
    }

    public WebElement getResultTitle(int resultNumber){
        return getResult(resultNumber).findElement(HomePageElements.resultTitle);
    }

    public WebElement getResultPrice(int resultNumber){
        return getResult(resultNumber).findElement(HomePageElements.resultPrice);
    }


}


