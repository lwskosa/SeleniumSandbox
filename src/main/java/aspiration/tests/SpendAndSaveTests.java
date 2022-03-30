package main.java.aspiration.tests;

import main.java.BaseTest;
import main.java.aspiration.data.SpendAndSaveData;
import main.java.aspiration.objects.SpendAndSaveElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SpendAndSaveTests extends BaseTest {

    @Test(testName = "Plan Perk", dataProvider = "verifyPerkLabels", dataProviderClass = SpendAndSaveData.class)
    public void verifyAspirePerkLabels(int row, int col, String expectedText, boolean isImage, boolean isCovered) {
        String xp = String.format(SpendAndSaveElements.perkFormat, row, col);
        By perk = By.xpath(xp);
        String perkText = null;
        // Fixes base64 issue, loads elements properly
        scrollToElement(perk);
        if (isImage) {
            if (BaseTest.driver.findElement(perk).findElements(By.xpath(".//img")).size() > 0) {
                perkText = BaseTest.driver.findElement(perk).findElement(By.xpath(".//img")).getAttribute("SRC");
            }
            if (!isCovered) {
                Assert.assertNull(perkText);
                return;
            }
        } else {
            perkText = BaseTest.driver.findElement(perk).getText();
        }
        Assert.assertEquals(perkText, expectedText);
    }

    @Test(testName = "Base Plan Present")
    public void getBaseLabel(){
        WebElement element = driver.findElement(SpendAndSaveElements.planBaseLocator);
        String actualText  = element.getText().toUpperCase();

        AssertEquals(SpendAndSaveElements.planBaseLabelText,actualText);
    }

    @Test(testName = "Plus Plan Present")
    public void getPlusLabel(){
        WebElement element = driver.findElement(SpendAndSaveElements.planPlusLocator);
        String actualText  = element.getText().toUpperCase();

        AssertEquals(SpendAndSaveElements.planPlusLabelText,actualText);
    }

    @Test(testName = "Plus Monthly Price")
    public void getPlusMonthlyLabel(){
        WebElement element = driver.findElement(SpendAndSaveElements.planPlusMonthlyfeeLocator);
        String actualText  = element.getText();

        AssertEquals(SpendAndSaveElements.planPlusMonthlyFeeLabelText,actualText);
    }

    @Test(testName = "Plus Annual Price")
    public void getPlusAnnualLabel(){
        WebElement element = driver.findElement(SpendAndSaveElements.planPlusAnnualfeeLocator);
        String[] actualText = element.getText().split(" ");

        AssertEquals(SpendAndSaveElements.planPlusAnnualFeeLabelText,actualText[0]);
    }

}
