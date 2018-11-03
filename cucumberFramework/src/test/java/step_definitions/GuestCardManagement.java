package step_definitions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import helpers.GlobalUtils;
import modules.AddProductToCard;
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
		
		
		GlobalUtils.assertEquals(cardBeforeClose, cardAfterClose);
		
    
	}

	@Given("^i click on Add to compare$")
	public void i_click_on_Add_to_compare() throws Exception  {
		
	
	   GuestCardManagementActions.addToCompare(driver);
	   
	
	}

	@Given("^i hover over the second product$")
	public void i_hover_over_the_second_product() {
		
		GuestCardManagementActions.hoverOnSecondProduct(driver);
		
	
	
	}

	@Given("^i click on compare$")
	public void i_click_on_compare() throws InterruptedException  {
		
		GuestCardManagementActions.goToCompare(driver);
	   
	}

	@Then("^i should see both items in the compare card$")
	public void i_should_see_both_items_in_the_compare_card()  {
		
		List<String> prodList=GuestCardManagementActions.compareCardContent(driver);
		
		Assert.assertTrue(prodList.contains(AddProductToCard.productName));
		
		Assert.assertTrue(prodList.contains(GuestCardManagementActions.secondProductName));
		
	
	
	}

	@Given("^i delete the first product from the compare card$")
	public void i_delete_the_first_product_from_the_compare_card()  {
	  
	}

	@Given("^i delete the second product from the card$")
	public void i_delete_the_second_product_from_the_card()  {
	   
	}

	@Then("^i should see the compare card empty$")
	public void i_should_see_the_compare_card_empty()  {

	}
	
	
	

@Given("^i get the \"([^\"]*)\" of all dresses$")
public void i_get_the_of_all_dresses(String info)  {
	
	System.out.println("info value from step definition "+info);
	GuestCardManagementActions.i_get_the_of_all_dresses(info, driver);

}

@Given("^i sort the \"([^\"]*)\" by \"([^\"]*)\"$")
public void i_sort_the_by(String info, String condition)  {
 
}

@Given("^i sort the dresses page by \"([^\"]*)\"$")
public void i_sort_the_dresses_page_by(String condition)  {
    
}

@Then("^i shouldn see the products sorted in the right order$")
public void i_shouldn_see_the_products_sorted_in_the_right_order()  {

}



}
	
