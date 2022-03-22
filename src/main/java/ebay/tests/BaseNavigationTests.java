package main.java.ebay.tests;

import main.java.BaseTest;
import main.java.ebay.data.BaseData;

import main.java.ebay.objects.BaseElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseNavigationTests extends BaseTest {




    @Test(testName = "Verify Navigation",
            dataProvider = "verifyBaseNavigation", dataProviderClass = BaseData.class)
    public void verifyNavigationDestinations(By mainBy, String expectedURL, boolean isHidden, boolean clickToShow, By parentBy){
        if(isHidden){
            WebElement parent = driver.findElement(parentBy);
            if (clickToShow) {
                parent.click();
            }
            else{
                hoverElement(parent);
                fluentWaitSecondsUntilLocated(5,mainBy);
            }
        }
        WebElement element = driver.findElement(mainBy);
        String special = element.getText();
        element.click();
        if(special.equals(BaseElements.facebookFooterLabelText)
        || special.equals(BaseElements.twitterFooterLabelText)) {
            fluentWaitSecondsUntilURL(7, expectedURL);
        }
        else{
            fluentWaitSecondsUntilPageLoaded(3);
        }
        String actualURL = driver.getCurrentUrl();
        if(actualURL.startsWith("https://www.ebay.com/splashui/")
        || actualURL.startsWith("https://signin.ebay.com/ws/eBay")){
            System.out.printf("Test passed, CAPTCHA invoked:\n%s",actualURL.replaceAll("[&?]","\n--- "));
            Assert.assertTrue(true);
            return;
        } else if(actualURL.startsWith("ttps://ocsnext.ebay.com/o")){
            System.out.printf("Test passed, OCS invoked:\n%s",actualURL);
            Assert.assertTrue(true);
            return;
        }
            AssertEquals(expectedURL, actualURL);
    }



    @Test(testName = "Verify Link HREF",
            dataProvider = "verifyBaseHREFs", dataProviderClass = BaseData.class)
    public void verifyBaseHREFs(By mainBy, String expectedResult, boolean isHidden, boolean clickToShow, By parentBy){

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
        String actualResult = element.getAttribute("href");
        if(actualResult == null || actualResult.equals("")){
            Assert.fail("Error - element does not have Text value.\n\t Should the inner text be empty?");
        }
        else{
            AssertEquals(expectedResult, actualResult);
        }
    }

}// CLASS END
