package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class GlobalUtils {


    public static void explicitWait(WebElement element, WebDriver driver, int sec) {


        WebDriverWait wait = new WebDriverWait(driver, sec);

        wait.until(ExpectedConditions.visibilityOf(element));


    }


    public static void waitForPageToLoad(WebDriver driver) {


        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {

            public Boolean apply(WebDriver driver) {

                return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
            }
        };

        try {

            Thread.sleep(1000);

            WebDriverWait wait = new WebDriverWait(driver, 30);

            wait.until(expectation);

        } catch (Throwable error) {

            Assert.fail("timeout waiting for Page Load Request to complete");
        }

    }


    public static void clickOnEelement(WebElement element) {
        element.click();
    }

    public static void sendKeysOnEelement(WebElement element,String string) {
        element.sendKeys(string);
    }

    public static String getElementText(WebElement element) {
        return element.getText();
    }

    public static String getElementAttribute(WebElement element) {
        return element.getAttribute("value");
    }

    public static void hoverOverElement(WebDriver driver,WebElement element) {

       Actions actions=new Actions(driver);

       actions.moveToElement(element).build().perform();
    }

    public static void hoverAndClickElement(WebDriver driver,WebElement element) {

        Actions actions=new Actions(driver);

        actions.moveToElement(element).click().build().perform();
    }

    public static int getTableSize(String xPath,WebDriver driver){

        return driver.findElements(By.xpath(xPath)).size();
    }



    public static void assertEquals (String expected,String actual){

        Assert.assertEquals(expected,actual);

    }

    public static void assertEquals (int expected,int actual){

        Assert.assertEquals(expected,actual);

    }

    public static void assertThat(Boolean condition){

        Assert.assertTrue(condition);

    }


    public static void softAssertEquals (String expected,String actual){


        SoftAssert softAssert=new SoftAssert();

        softAssert.assertEquals(expected,actual);

    }

    public static void softAssertEquals (int expected,int actual){

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(expected,actual);

    }

    public static void SoftAssertThat(Boolean condition){

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(condition);

    }
    public static WebElement findElementByXpath(WebDriver driver,String xPath){

        return driver.findElement(By.xpath(xPath));

    }





}