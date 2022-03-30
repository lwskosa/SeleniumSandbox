package main.java.aspiration.pages;

import main.java.BaseTest;
import main.java.aspiration.objects.SpendAndSaveElements;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SpendAndSavePage {

    public List<WebElement> getActualPerk(){
        return BaseTest.driver.findElements(SpendAndSaveElements.planPerksListLocator);
    }



}
