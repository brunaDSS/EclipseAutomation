package step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import helpers.GlobalUtils;
import modules.GuestCardManagementActions;
import pageObjects.CheckOut;
import pageObjects.ContactUs;
import pageObjects.CreateAccount;
import pageObjects.Dresses;
import pageObjects.HomePage;
import pageObjects.ItemDetails;
import pageObjects.SignIn;

public class GuestCardManagement {
	
	private WebDriver driver;
	public int cardBeforeClose;
	public int cardAfterClose;
	
	
	public  GuestCardManagement() {
		
		     driver=Hooks.driver;
	        PageFactory.initElements(driver,HomePage.class);
	        PageFactory.initElements(driver,SignIn.class);
	        PageFactory.initElements(driver,ContactUs.class);
	        PageFactory.initElements(driver,CreateAccount.class);
	        PageFactory.initElements(driver, SignIn.CreateInitial.class);
	        PageFactory.initElements(driver, HomePage.HeaderPage.class);
	        PageFactory.initElements(driver, CheckOut.class);
	        PageFactory.initElements(driver, Dresses.class);
	        PageFactory.initElements(driver, ItemDetails.class);
	
	}
	

	@Given("^i click on continue shopping$")
	public void i_click_on_continue_shopping()  {
		
		GuestCardManagementActions.continueShopping(driver);
	
   
	}
	
	@Given("^i get the card quantity$")
	public void i_get_the_card_quantity()  {
		
		cardBeforeClose=GuestCardManagementActions.getCardQuantity();
		
	
	}

	@Given("^i copy the cookies$")
	public void i_copy_the_cookies() {
		
		GuestCardManagementActions.getCookies(driver);
  
	}

	@Given("^i close the browser$")
	public void i_close_the_browser() {
		
		GuestCardManagementActions.closeBrowser(driver);
    
	}
	
	@Given("^i open the browser$")
	public void i_open_the_browser() throws Exception{
		
		GuestCardManagementActions.openBrowser();

	}

	@Given("^i restore the cookies$")
	public void i_restore_the_cookies() {
		
		GuestCardManagementActions.addCookies();
  
	}

	@Then("^i should be able to see my products in the card$")
	public void i_should_be_able_to_see_my_products_in_the_card()  {
		
		
		cardAfterClose=GuestCardManagementActions.getCardQuantity();
		
		GlobalUtils.assertEquals(cardBeforeClose, cardAfterClose);
		
    
	}

	

}
