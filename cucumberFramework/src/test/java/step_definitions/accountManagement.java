package step_definitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.DataHelper;
import helpers.GlobalUtils;
import modules.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.*;
import java.util.HashMap;
import java.util.List;




public class accountManagement {

    private WebDriver driver;

    List<HashMap<String,String>> dataMap=DataHelper.data("SignInSignOut");
    List<HashMap<String,String>> dataMap2=DataHelper.data("CreateAccount");

    public accountManagement(){

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


    @Given("^i open the automationPractice website$")
    public void i_open_the_automationPractice_website()  {

        driver.get("http://automationpractice.com/index.php?");

    }



    @When("^i sign in$")
    public void i_sign_in()  {

        // how to run the test for all the data

        SignInAction.Execute(dataMap.get(0));


    }

    @Then("^i sign out$")
    public void i_sign_out()  {

        SignOutAction.execute();



    }


    @Given("^i choose a \"([^\"]*)\" , enter the \"([^\"]*)\" ,\"([^\"]*)\",\"([^\"]*)\",upload the \"([^\"]*)\"$")
    public void i_choose_a_enter_the_upload_the(String header, String email, String orderNumber, String message, String file) {

        ContactUsActions.ExecuteContactUs(header,email,orderNumber,message,file);

    }

    @Then("^i should be able to submit the contact form$")
    public void i_should_be_able_to_submit_the_contact_form()  {

        GlobalUtils.assertThat(ContactUs.successful_message.isDisplayed());

    }


    @Given("^i enter my details$")
    public void i_enter_my_details() throws Exception {

        CreateAccountActions.executeCreateAccount(driver, dataMap2.get(0));

    }

    @Then("^is should be able to sign up and validate \"([^\"]*)\"$")
    public void is_should_be_able_to_sign_up_and_validate(String url)  {

        GlobalUtils.assertEquals(url,driver.getCurrentUrl());

    }


    @Given("^i enter my customers details$")
    public void i_enter_my_customers_details() throws Exception {

        for(int i=0;i<dataMap2.size();i++) {
            System.out.println("driver=" + driver);


            CreateNumerousAccounts.executeCreateAccount(driver, dataMap2.get(i));

        }


    }

    @Then("^is should be able to add all customers  and validate \"([^\"]*)\"$")
    public void is_should_be_able_to_add_all_customers_and_validate(String url)  {

        GlobalUtils.assertEquals(url,driver.getCurrentUrl());

    }




}



