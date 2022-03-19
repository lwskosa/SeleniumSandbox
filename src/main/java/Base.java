package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.*;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;


public class Base {
    public static WebDriver driver;
//    public static FluentWait fluentWait = new FluentWait<>(driver);

    @BeforeMethod
    @Parameters({"browserName","homePageURL"})
    public void setup(Browser browserName, String homePageURL){
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
        String webDriver;
        String driverName;
        switch (browserName) {
            default:
            case CHROME:
                webDriver  = "webdriver.chrome.driver";
                driverName = "chromedriver";
                setSystemProperty(webDriver,driverName);
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--no-sandbox");
                driver = new ChromeDriver();
                break;

            case FIREFOX:
                webDriver  = "webdriver.gecko.driver";
                driverName = " geckodriver";
                setSystemProperty(webDriver, getLocation(driverName));
                driver = new FirefoxDriver();
                break;
            case EDGE:
                webDriver  = "webdriver.edge.driver";
                driverName = " msedgedriver";
                setSystemProperty(webDriver, getLocation(driverName));
                driver = new EdgeDriver();
                break;
            case OPERA:
                webDriver  = "webdriver.opera.driver";
                driverName = " operadriver";
                setSystemProperty(webDriver, getLocation(driverName));
                driver = new OperaDriver();
                break;
            case SAFARI:
                //TODO: Implement SAFARI driver
                break;
        }// SWITCH END
    }// METHOD END

    /**
     * Helper method to get location and filename for driver executable
     * @param driverName Name of the executable file
     * @return String path of Driver executable file
     */
    public String getLocation(String driverName) {
        String dir = System.getProperty("user.dir");
        String sep = File.separator;
        return dir + sep + "drivers" + sep + driverName + ".exe";
    }

    public static void driverImplicitWaitSeconds(int seconds){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }

    public static void fluentWaitSecondsUntilLocated(int secondsToWait, Type type, String locator){
        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(secondsToWait))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(NoSuchElementException.class);

        ElementFinder finder = new ElementFinder();
       wait.until(ExpectedConditions.visibilityOf(finder.getElement(type,locator)));
    }

    public static void fluentWaitSecondsUntilLocated(int secondsToWait, By locator){
        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(secondsToWait))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(NoSuchElementException.class);

        ElementFinder finder = new ElementFinder();
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
    public static void fluentWaitSecondsUntilLocated(int secondsToWait, WebElement element, Type type, String locator){
        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(secondsToWait))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(NoSuchElementException.class);


        switch(type){
            default:
            case ID:
                wait.until(ExpectedConditions.visibilityOf(element.findElement(By.id(locator))));
                break;
            case XPATH:
                wait.until(ExpectedConditions.visibilityOf(element.findElement(By.xpath(locator))));
                break;
            case CLASS:
                wait.until(ExpectedConditions.visibilityOf(element.findElement(By.className(locator))));
                break;
            case CSS:
                wait.until(ExpectedConditions.visibilityOf(element.findElement(By.cssSelector(locator))));
                break;
            case TAG:
                wait.until(ExpectedConditions.visibilityOf(element.findElement(By.tagName(locator))));
                break;
        }
    }

    public void setSystemProperty(String webDriver, String driverName){
        System.setProperty(webDriver, getLocation(driverName));
    }

    public static String getFileName(String prefix,String key){
        String dir = System.getProperty("user.dir");
        String sep = File.separator;
        String folder = "logs";
        Date timeNow = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd_HHmmss");
        return dir + sep + folder + sep + String.format("%s_%s-%s.txt",prefix,key,formatter.format(timeNow));
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

}

