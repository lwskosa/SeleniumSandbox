package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;


public class ElementFinder {

    public WebElement getElement(By byThis) {
        return Base.driver.findElement(byThis);
    }

    public List<WebElement> getElements(By byThis){
        return Base.driver.findElements(byThis);
    }


    public WebElement getElement(Type type, String locatorString) {
        switch (type) {
            default:
            case ID:
                return Base.driver.findElement(By.id(locatorString));
            case XPATH:
                return Base.driver.findElement(By.xpath(locatorString));
            case CSS:
                return Base.driver.findElement(By.cssSelector(locatorString));
            case CLASS:
                return Base.driver.findElement(By.className(locatorString));
            case TAG:
                return Base.driver.findElement(By.tagName(locatorString));
        }
    }

    public List<WebElement> getElements(Type type, String locatorString){
        switch(type) {
            default:
            case CLASS:
                return Base.driver.findElements(By.className("." + locatorString.replaceAll(" ",".")));
            case TAG:
                return Base.driver.findElements(By.tagName(locatorString));
            case CSS:
                return Base.driver.findElements(By.cssSelector(locatorString));
            case ID:
                return Base.driver.findElements(By.id(locatorString));
            case XPATH:
                return Base.driver.findElements(By.xpath(locatorString));
        }
    }
}
