package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckOut {


    public static String cardTablePath="//table[@id='cart_summary']/tbody/tr";
    public static String ordersRefPath="//table[@id='order-list']/tbody/tr/td[1]/a";

    @FindBy(how = How.XPATH, using = "//*[@id='cart_summary']/tbody/tr[1]/td[2]/p/a")
    public static WebElement checkout_product_name_getText;

    @FindBy(how = How.XPATH, using = "//*[text()='Proceed to checkout']")
    public static WebElement proceed_to_checkOut;

    @FindBy(how = How.XPATH, using = "//*[text()='Proceed to checkout']")
    public static WebElement proceed_to_checkOut2;

    @FindBy(how = How.XPATH, using = "//input[@id='cgv']")
    public static WebElement terms_and_conditions;

    @FindBy(how = How.XPATH, using = "//*[@id=\"form\"]/p/button/span")
    public static WebElement proceed_to_checkOut3;

    @FindBy(how = How.XPATH, using = "//a[@title='Pay by bank wire']")
    public static WebElement payByBank;

    @FindBy(how = How.XPATH, using = "//a[@title='Pay by check.']")
    public static WebElement payByCheck;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']//*[text()='I confirm my order']")
    public static WebElement confirmOrder;

    @FindBy(how = How.XPATH, using = "//*[text()='Your order on My Store is complete.']")
    public static WebElement order_confirmation;

    @FindBy(how = How.XPATH, using = "//*[@id='cart_summary']/tbody/tr[1]/td[5]/input[2]")
    public static WebElement change_quanity_onCard;

    @FindBy(how = How.XPATH, using = "//*[@id='cart_summary']/tbody/tr[1]/td[5]//*[@class='icon-minus']")
    public static WebElement decrease_quanity_onCard;

    @FindBy(how = How.XPATH, using = "//*[@id='cart_summary']/tbody/tr[1]/td[5]//*[@class='icon-plus']")
    public static WebElement increase_quanity_onCard;

    @FindBy(how = How.XPATH, using = "//*[@id='cart_summary']/tbody/tr[1]/td[7]//*[@class='icon-trash']")
    public static WebElement delete_item;

    @FindBy(how = How.XPATH, using = "//div[@class='box']")
    public static WebElement order_ref;

    @FindBy(how = How.XPATH, using = "//*[@title='Back to orders']")
    public static WebElement back_to_orders;

    @FindBy(how = How.XPATH, using = "//a[@title='View my shopping cart']/span[1]")
    public static WebElement shopping_card_quantity;


  //*[@id="center_column"]/div/br[5]

}
