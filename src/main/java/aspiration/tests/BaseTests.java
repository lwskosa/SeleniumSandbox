package main.java.aspiration.tests;

import main.java.BaseTest;
import main.java.aspiration.data.BaseData;
import main.java.aspiration.objects.BaseElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseTests extends BaseTest {
    @Test(testName = "Navigate",
            dataProvider = "verifyNavigation",dataProviderClass = BaseData.class)
    public void navigateToPage(int item, String expectedURL ){
        String xp = String.format(BaseElements.headerLinksFormat, item);
        By link = By.xpath(xp);
        WebElement element = BaseTest.driver.findElement(link);

        element.click();
        fluentWaitSecondsUntilURL(5,expectedURL);
    }

    @Test(testName = "Get Started Modal",
    dataProvider = "getStarted",dataProviderClass = BaseData.class)
    public void verifyGetStartedModal(By withThis, String expectedText, boolean isAllCaps){
        openModal();
        WebElement element = driver.findElement(withThis);
        String actualText = (isAllCaps) ? element.getText().toUpperCase() : element.getText();
        AssertEquals(actualText,expectedText);
    }

    @Test(testName = "Verify Input",
            dataProvider = "verifyInput",dataProviderClass = BaseData.class)
    public void verifyInputForm(By withThis, String userInput, String expectedPlaceholder){
        openModal();
        WebElement element = driver.findElement(withThis);
        boolean hasPlaceholder = element.getAttribute("placeholder") != null;
        String placeholder;
        if(hasPlaceholder){
            placeholder = element.getAttribute("placeholder");
            Assert.assertEquals(placeholder,expectedPlaceholder);
        }
        element.sendKeys(userInput);
        String enteredText = element.getAttribute("value");
        AssertEquals(enteredText,userInput);
    }






    public void openModal(){
        driver.findElement(BaseElements.openAccountButtonLocator).click();
    }


}
