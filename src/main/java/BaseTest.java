package main.java;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class BaseTest {
    public static WebDriver driver;

    @BeforeMethod
    @Parameters({"browserName","homePageURL"})
    public void setup(@Optional ("CHROME") Browser browserName, @Optional ("https://www.ebay.com/")String homePageURL){
        driverSetup(browserName);
        driver.manage().window().maximize();
        driver.get(homePageURL);
        driverImplicitWaitSeconds(5);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    /**
     * Sets  Property for selected Driver
     * @param browserName Select desired browser driver
     */
    public void driverSetup(Browser browserName){
//        Helper variables to set up WebDriver
        String webDriver;
        String driverName;
        switch (browserName) {
            default:
            case CHROME:
                webDriver  = "webdriver.chrome.driver";
                driverName = "chromedriver";
                setSystemProperty(webDriver,driverName);
                driver = new ChromeDriver();
                break;

            case FIREFOX:
                webDriver  = "webdriver.gecko.driver";
                driverName = "geckodriver";
                setSystemProperty(webDriver, buildDriverLocation(driverName));
                driver = new FirefoxDriver();
                break;
            case EDGE:
                webDriver  = "webdriver.edge.driver";
                driverName = "msedgedriver";
                setSystemProperty(webDriver, buildDriverLocation(driverName));
                driver = new EdgeDriver();
                break;
            case OPERA:
                webDriver  = "webdriver.opera.driver";
                driverName = "operadriver";
                setSystemProperty(webDriver, buildDriverLocation(driverName));
                driver = new OperaDriver();
                break;
        }// SWITCH END
    }// METHOD END - driverSetup

    /**
     * Helper method to get location and filename for driver executable
     * @param driverName Name of the executable file
     * @return String path of Driver executable file
     */
    public static String buildDriverLocation(String driverName) {
        String dir = System.getProperty("user.dir");
        String sep = File.separator;
        return dir + sep + "drivers" + sep + driverName + ".exe";
    }
    /**
     * Click on desired element
     * @param element Perform Click on this element
     */
    public static void clickElement(WebElement element){
        element.click();
    }
    /**
     * Mimic Mouse Hover effect - hover over element without clicking it
     * @param element Hover over this element
     */
    public static void hoverElement(WebElement element){
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }
    /**
     * Scroll to an element specified
     * @param element Scroll until this element is visible
     */
    public static void scrollToElement(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    /**
     * Scroll to an element specified by Locator
     * @param withThis Scroll until this element is visible
     */
    public static void scrollToElement(By withThis){
        WebElement element = driver.findElement(withThis);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    /**
     * Implicitly wait specified amount of seconds
     * @param seconds How many seconds we should wait
     */
    public static void driverImplicitWaitSeconds(int seconds){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }

    /**
     * Wait X seconds if element is located
     * @param secondsToWait How many seconds should we wait for
     * @param locator Locator By
     */
    public static void fluentWaitSecondsUntilLocated(int secondsToWait, By locator){
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(secondsToWait))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }


    public static void fluentWaitSecondsUntilPageLoaded(int secondsToWait){
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(secondsToWait))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(TimeoutException.class);

        wait.until(driver -> String
                .valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
                .equals("complete"));
    }
    public static void fluentWaitSecondsUntilURL(int secondsToWait, String expectedURL){
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(secondsToWait))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(TimeoutException.class);

        wait.until(ExpectedConditions.urlToBe(expectedURL));
    }

    /**
     * Part of setting up WebDriver - sets system property parametrically
     * @param webDriver Webdriver type
     * @param driverName Name of driver executable without extension
     */
    public static void setSystemProperty(String webDriver, String driverName){
        System.setProperty(webDriver, buildDriverLocation(driverName));
    }
//        Yes, I know I can keep appending data/results to single file :)
    /**
     * Generates file name to store results in to prevent overwriting sensitive data
     * @param prefix Prefix for Filename
     * @param key Second part for file name before timestamp
     * @return Dynamic file name
     */
    public static String getLogFileName(String prefix, String key){
        String dir = System.getProperty("user.dir");
        String sep = File.separator;
        String folder = "logs";
        Date timeNow  = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd_HHmmss");
        return dir + sep + folder + sep + String.format("%s_%s-%s.txt",prefix,key.replaceAll(" ","-"),formatter.format(timeNow));
    }

    /**
     * PadLeft implementation. User for text formatting, clamps text to left side
     * @param padAmount  total character size
     * @param text text to be padded to the left
     * @return Left-padded text
     */
    public static String padLeft(int padAmount,String text){
        return String.format("%-" + padAmount + "s",text);
    }
    /**
     * PadLeft implementation. User for text formatting, clamps text to right side
     * @param padAmount  total character size
     * @param text text to be padded to the right
     * @return Right-padded text
     */
    public static String padRight(int padAmount,String text){
        return String.format("%" + padAmount + "s",text);
    }


//        ASSERTION METHODS

    public static void AssertEquals(String expectedText, String actualText){
        logThis(actualText,expectedText);
        Assert.assertEquals(actualText,expectedText);
    }

    public static void logThis(String actualText,String expectedText){
        System.out.printf("Test Outcome -\n\t" +
                "Expected..... %s\n\t" +
                "Actual....... %s",expectedText,actualText);
    }









}// CLASS END

