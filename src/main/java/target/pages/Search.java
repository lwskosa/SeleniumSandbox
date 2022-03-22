package main.java.target.pages;

import main.java.target.objects.BaseElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import main.java.BaseTest;
import java.util.List;

public class Search {


    public void searchForItem(String searchQuery) {
        BaseTest.driver.findElement(BaseElements.searchField).sendKeys(searchQuery);
        BaseTest.driver.findElement(BaseElements.searchButtonWPopup).click();
    }

    public List<WebElement> getResultsList(){
        return BaseTest.driver.findElements(BaseElements.searchResults);
    }


    public WebElement getResult(int resultNumber){
        By result = By.xpath(String.format("//*[@id=\"pageBodyContainer\"]/div[1]/div/div[4]/div/div[1]/div[2]/div/section/div/div[%d]",resultNumber));
        return BaseTest.driver.findElement(result);
    }

    public WebElement getResultTitle(int resultNumber){
        return getResult(resultNumber).findElement(BaseElements.resultTitle);
    }

    public WebElement getResultPrice(int resultNumber){
        return getResult(resultNumber).findElement(BaseElements.resultPrice);
    }


}


