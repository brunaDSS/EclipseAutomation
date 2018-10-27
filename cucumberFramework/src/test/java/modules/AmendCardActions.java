package modules;

import helpers.GlobalUtils;
import helpers.log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.cucumber.listener.Reporter;
import pageObjects.CheckOut;
import pageObjects.Dresses;

public class AmendCardActions {

    public static int size;

    public static int cardSize;

    public static int initialQuantity;

    public static int amendedQuantity;

    public static int decreasedQuantity;

    public static int increasedQuantity;

    public static int deletedCardSize;

    public static int zeroCardSize;

    public static int cardQuanity;

    public static int deletedCardSizeInitial;

    public static int increasedCardQuanity;

    public static int decreasedCardQuanity;

    public static int zeroCardSizeInitial;

    public static int initialQuantityD;

    public static int initialQuantityI;



    public static void addMultipleProductsToCard(WebDriver driver) {


        size = GlobalUtils.getTableSize("//*[@id='center_column']/ul/li", driver);

        if (size==0){
            log.info("theres no products in this category is empty");

            throw new IllegalArgumentException("There is no products in this category");

        }


            GlobalUtils.explicitWait(driver.findElement(By.xpath("//*[@id='center_column']/ul/li[" + (size - 1) + "]")), driver, 10);

            for (int i = 1; i < size + 1; i++) {




                GlobalUtils.hoverOverElement(driver, GlobalUtils.findElementByXpath(driver, "//*[@id=\"center_column\"]/ul/li[" + i + "]/div/div[1]/div/a[1]/img"));

                log.info("Hovering Over The " + i + " product");

                GlobalUtils.explicitWait(GlobalUtils.findElementByXpath(driver, "//*[@id='center_column']/ul/li[" + i + "]/div/div[2]/div[2]/a[1]"), driver, 10);



                GlobalUtils.hoverAndClickElement(driver, GlobalUtils.findElementByXpath(driver, "//*[@id='center_column']/ul/li[" + i + "]/div/div[2]/div[2]/a[1]"));

                log.info("Clicking on Add to card The " + i + " product");



                driver.switchTo().defaultContent();

                GlobalUtils.explicitWait(Dresses.continue_shopping, driver, 10);

                log.info("Switching to popup window of The " + i + " product");

                Dresses.continue_shopping.click();

                log.info("Clicking on continue shopping of the " + i + " product");
            }



    }




    public static void executeGoToCard(){

        GlobalUtils.clickOnEelement(Dresses.go_to_card);
        log.info("going to the card");
    }



        public static void getCardQuantity() {


        cardQuanity=Integer.parseInt(GlobalUtils.getElementText(CheckOut.shopping_card_quantity));

            log.info("getting the quantity of the first product "+cardQuanity);


    }

    public static void getCardSize(WebDriver driver) {



            cardSize=GlobalUtils.getTableSize(CheckOut.cardTablePath,driver);

        log.info("getting the shopping card table size "+cardSize);


            if (cardSize==0){
                log.info("shopping card is empty");

                throw new IllegalArgumentException("There is no products in this card");

            }
    }


    public static void amendQuantity() {

        initialQuantity=Integer.parseInt(GlobalUtils.getElementAttribute(CheckOut.change_quanity_onCard));

        log.info("getting the initial quantity on card "+initialQuantity);

        CheckOut.change_quanity_onCard.clear();

        log.info("clearing the product quantity");

        GlobalUtils.sendKeysOnEelement(CheckOut.change_quanity_onCard,"2");

        log.info("changing the product quantity to two");

        amendedQuantity=Integer.parseInt(GlobalUtils.getElementAttribute(CheckOut.change_quanity_onCard));

        log.info("getting the amended quantity "+amendedQuantity);
    }



    public static void decreaseQuantity(WebDriver driver) {


        initialQuantityD=Integer.parseInt(GlobalUtils.getElementAttribute(CheckOut.change_quanity_onCard));

        log.info("getting initial quantity before decrease "+initialQuantityD);

        GlobalUtils.clickOnEelement(CheckOut.decrease_quanity_onCard);

        log.info("clicking on decrease ");


        decreasedQuantity=Integer.parseInt(GlobalUtils.getElementAttribute(CheckOut.change_quanity_onCard));

        log.info("getting quantity after decrease "+decreasedQuantity);

    }

    public static void increaseQuantity(WebDriver driver) {



        initialQuantityI=Integer.parseInt(GlobalUtils.getElementAttribute(CheckOut.change_quanity_onCard));
        log.info("getting initial quantity before increase "+initialQuantityI);

        GlobalUtils.clickOnEelement(CheckOut.increase_quanity_onCard);

        log.info("clicking on increase ");

        increasedQuantity=Integer.parseInt(GlobalUtils.getElementAttribute(CheckOut.change_quanity_onCard));

        log.info("getting quantity after increase "+increasedQuantity);

    }



    public static void deleteProduct(WebDriver driver) {

        deletedCardSizeInitial=GlobalUtils.getTableSize(CheckOut.cardTablePath,driver);

        log.info("getting card size before deleting  "+deletedCardSizeInitial);

        GlobalUtils.clickOnEelement(CheckOut.delete_item);

        log.info("deleting item");

        GlobalUtils.waitForPageToLoad(driver);

       deletedCardSize=GlobalUtils.getTableSize(CheckOut.cardTablePath,driver);

        log.info("getting card size after deleting  "+deletedCardSize);


    }


    public static void makeProductQuantityZero(WebDriver driver) {

        zeroCardSizeInitial=GlobalUtils.getTableSize(CheckOut.cardTablePath,driver);

        log.info("getting card size before zeroing the item  "+zeroCardSizeInitial);

        CheckOut.change_quanity_onCard.clear();

        log.info("clearing quantity");

        GlobalUtils.sendKeysOnEelement(CheckOut.change_quanity_onCard,"0");

        log.info("making the quantity 0");

        GlobalUtils.waitForPageToLoad(driver);

        zeroCardSize=GlobalUtils.getTableSize(CheckOut.cardTablePath,driver);

        log.info("getting card quantity after zeriong the product quantity "+zeroCardSize);


    }


}




