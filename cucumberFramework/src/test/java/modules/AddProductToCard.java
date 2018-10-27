package modules;


import com.cucumber.listener.Reporter;
import helpers.GlobalUtils;
import helpers.log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pageObjects.CheckOut;
import pageObjects.Dresses;
import pageObjects.HomePage;
import pageObjects.ItemDetails;

public class AddProductToCard {

    public static String productName;
    public static String checkOutProductName;



    public static void clickOnDresses(WebDriver driver){



        GlobalUtils.clickOnEelement(HomePage.HeaderPage.menu_dresses);

        log.info("going to the dresses page");

        GlobalUtils.waitForPageToLoad(driver);

    }

    public static void hoverOnFirstProduct(WebDriver driver) {



        GlobalUtils.hoverOverElement(driver,Dresses.first_item_ho0ver);
        log.info("hovering over the product");
        productName=GlobalUtils.getElementText(Dresses.get_product_name);
        log.info("product name : "+productName);

    }

    public static void addToCardFirstProduct(WebDriver driver) {



        GlobalUtils.explicitWait(Dresses.add_Top_Card_click,driver,10);
        GlobalUtils.hoverAndClickElement(driver,Dresses.add_Top_Card_click);
        log.info("adding product to card");

    }


    public static void proceedToCheckOut(WebDriver driver)throws Exception{

        driver.switchTo().defaultContent();

        GlobalUtils.explicitWait(Dresses.proceed_checkout_click,driver,10);

        GlobalUtils.clickOnEelement(Dresses.proceed_checkout_click);

        log.info("proceeding to check out");

       checkOutProductName= GlobalUtils.getElementText(CheckOut.checkout_product_name_getText);

        log.info("card product name : "+checkOutProductName);

    }


    public static void clickOnMore(WebDriver driver) {


        GlobalUtils.clickOnEelement(Dresses.click_onMore);
        log.info("click on more");
        GlobalUtils.waitForPageToLoad(driver);

    }

    public static void addToCardFromProductPage(WebDriver driver) {


       GlobalUtils.clickOnEelement(ItemDetails.add_to_card_product_Page);
        log.info("adding product to card from the products details page");
    }



}
