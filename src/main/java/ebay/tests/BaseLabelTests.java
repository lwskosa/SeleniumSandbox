package main.java.ebay.tests;

import main.java.BaseTest;
import main.java.ebay.data.BaseData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseLabelTests  extends BaseTest {
    @Test(testName = "Verify Label Text",
            dataProvider = "verifyBaseLabelTexts", dataProviderClass = BaseData.class)
    public void verifyElement(By mainBy, String expectedResult, boolean isHidden, boolean clickToShow, By parentBy){

        if(isHidden){
            WebElement parent = driver.findElement(parentBy);
            if (clickToShow) {
                parent.click();
            }
            else{
                hoverElement(parent);
            }
        }
        WebElement element =  driver.findElement(mainBy);
        String actualResult = element.getText();
        if(actualResult == null || actualResult.equals("")){
            Assert.fail(String.format("Error - element does not have Text value.\n\t Should the inner text be empty?\nLocator String:\n\t%s", mainBy));
        }
        else{
            AssertEquals(expectedResult, actualResult);
        }
    }
}
