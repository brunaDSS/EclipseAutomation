package step_definitions;

import com.cucumber.listener.Reporter;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import helpers.GlobalUtils;
import modules.AddProductToCard;
import modules.AmendCardActions;
import modules.CheckOutActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pageObjects.*;


public class DressesShopping {

    private WebDriver driver;

    public DressesShopping(){

        driver=Hooks.driver;

        PageFactory.initElements(driver, HomePage.class);
        PageFactory.initElements(driver, SignIn.class);
        PageFactory.initElements(driver, ContactUs.class);
        PageFactory.initElements(driver, CreateAccount.class);
        PageFactory.initElements(driver, SignIn.CreateInitial.class);
        PageFactory.initElements(driver, HomePage.HeaderPage.class);
        PageFactory.initElements(driver, CheckOut.class);
        PageFactory.initElements(driver, Dresses.class);
        PageFactory.initElements(driver, ItemDetails.class);



    }




    @Given("^i add a product to the card$")
    public void i_add_a_product_to_the_card()  throws Exception{

        AddProductToCard.clickOnDresses(driver);
        AddProductToCard.hoverOnFirstProduct(driver);
        AddProductToCard.addToCardFirstProduct(driver);
        AddProductToCard.proceedToCheckOut(driver);

    }

    @Then("^i should be able to see my item in the shooping card$")
    public void i_should_be_able_to_see_my_item_in_the_shooping_card() {

        GlobalUtils.assertEquals(AddProductToCard.productName,AddProductToCard.checkOutProductName);

    }
    @Given("^i  proceed to check out$")
    public void i_proceed_to_check_out() throws Throwable {

        CheckOutActions.proceedToCheckOut(driver);
    }

    @Given("^i confirm the address$")
    public void i_confirm_the_address() throws Throwable {
        CheckOutActions.confirmTheAddress();
    }

    @Given("^i confirm the shipping information$")
    public void i_confirm_the_shipping_information()  {
        CheckOutActions.confirmTheShipping();
    }

    @Given("^i checkout by bank wire$")
    public void i_checkout_by_bank_wire()  {
        CheckOutActions.checkOutByBankWire();

    }

    @Given("^i confirm my order$")
    public void i_confirm_my_order()  {
        CheckOutActions.confirmTheOrder();

    }

    @Given("^i checkout by check$")
    public void i_checkout_by_check()  {
        CheckOutActions.checkOutByCheck();

    }



    @Then("^i should be able to place an order and confirm the \"([^\"]*)\"$")
    public void i_should_be_able_to_place_an_order_and_confirm_the(String message)  {

        Assert.assertEquals(message,CheckOutActions.confirmationText);
    }




    @Given("^i add products to the card$")
    public void i_add_products_to_the_card()  {


        AddProductToCard.clickOnDresses(driver);

        AmendCardActions.addMultipleProductsToCard(driver);


    }

    @Given("^i go to the card$")
    public void i_go_to_the_card() throws Throwable {

        AmendCardActions.executeGoToCard();

    }

    @Given("^i amend product quanity on the card$")
    public void i_amend_product_quanity_on_the_card() throws Exception {

        AmendCardActions.getCardQuantity();
        AmendCardActions.getCardSize(driver);
        Thread.sleep(3000);
        AmendCardActions.amendQuantity();
        Thread.sleep(3000);
        AmendCardActions.increaseQuantity(driver);
        Thread.sleep(3000);
        AmendCardActions.decreaseQuantity(driver);
        Thread.sleep(3000);
    }


    @Given("^i delete a product from the card$")
    public void i_delete_a_product_from_the_card() throws Exception{

        AmendCardActions.deleteProduct(driver);
        Thread.sleep(3000);

    }

    @Given("^i make zero the product quantity on the card$")
    public void i_make_zero_the_product_quantity_on_the_card() throws Exception{

        AmendCardActions.makeProductQuantityZero(driver);
        Thread.sleep(3000);

    }



    @Then("^i should be able to verify the changes$")
    public void i_should_be_able_to_verify_the_changes()  {



        GlobalUtils.softAssertEquals((AmendCardActions.initialQuantity+1),AmendCardActions.amendedQuantity);

        Reporter.addStepLog("Asserting: "+(AmendCardActions.initialQuantity+1)+" - "+AmendCardActions.amendedQuantity);

        GlobalUtils.softAssertEquals((AmendCardActions.initialQuantityI+1),AmendCardActions.increasedQuantity);

        Reporter.addStepLog("Asserting: "+(AmendCardActions.initialQuantityI+2)+" - "+AmendCardActions.increasedQuantity);

        GlobalUtils.softAssertEquals((AmendCardActions.initialQuantityD-1),AmendCardActions.decreasedCardQuanity);

        Reporter.addStepLog("Asserting: "+(AmendCardActions.initialQuantityD-1)+" - "+AmendCardActions.decreasedCardQuanity);

        GlobalUtils.softAssertEquals((AmendCardActions.initialQuantityD-1),AmendCardActions.decreasedQuantity);

        Reporter.addStepLog("Asserting: "+(AmendCardActions.initialQuantityD-1)+" - "+AmendCardActions.decreasedQuantity);

        GlobalUtils.softAssertEquals((AmendCardActions.cardSize-1),AmendCardActions.deletedCardSize);

        Reporter.addStepLog("Asserting: "+(AmendCardActions.cardSize-1)+" - "+AmendCardActions.deletedCardSize);

        GlobalUtils.softAssertEquals((AmendCardActions.zeroCardSizeInitial-1),AmendCardActions.zeroCardSize);

        Reporter.addStepLog("Asserting: "+(AmendCardActions.zeroCardSizeInitial-1)+" - "+AmendCardActions.zeroCardSize);

    }

    @Given("^i click on Dresses$")
    public void i_click_on_Dresses()  {

        AddProductToCard.clickOnDresses(driver);

    }

    @Given("^i hover the first product$")
    public void i_hover_the_first_product() throws Throwable {
        AddProductToCard.hoverOnFirstProduct(driver);
    }

    @Given("^i click on add to card$")
    public void i_click_on_add_to_card() throws Throwable {
        AddProductToCard.addToCardFirstProduct(driver);
    }

    @Given("^i continue to Check out$")
    public void i_continue_to_Check_out() throws Throwable {

        AddProductToCard.proceedToCheckOut(driver);
    }

    @Given("^i click on More$")
    public void i_click_on_More() throws Throwable {
        AddProductToCard.clickOnMore(driver);
    }

    @Given("^i click on add to card from the product page$")
    public void i_click_on_add_to_card_from_the_product_page()  {

        AddProductToCard.addToCardFromProductPage(driver);
    }

    @Then("^i should be able to see my order in the order history$")
    public void i_should_be_able_to_see_my_order_in_the_order_history()  {

        CheckOutActions.getOrderRef();
        CheckOutActions.goToOrdersPage();
        Assert.assertTrue(CheckOutActions.findOrderRef(driver));



    }
}
