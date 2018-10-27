package modules;

import helpers.log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pageObjects.CreateAccount;
import pageObjects.HomePage;
import pageObjects.SignIn;

import java.util.HashMap;

public class CreateNumerousAccounts {


    public static void executeCreateAccount (WebDriver driver, HashMap<String, String> map) throws InterruptedException {


        HomePage.sign_in.click();
        log.info("clicked on sign in");

        SignIn.CreateInitial.email_create.sendKeys(map.get("email"));
        log.info("entered email");

        SignIn.CreateInitial.SubmitCreate.click();
        log.info("clicked initial submit");

        CreateAccount.id_gender2.click();
        log.info("gender chosen");

        CreateAccount.customer_firstname.sendKeys(map.get("firstName"));
        log.info("first name entered");

        CreateAccount.customer_lastname.sendKeys(map.get("lastName"));
        log.info("last name entered");

        //CreateAccount.email.sendKeys(map.get("email"));
        CreateAccount.passwd.sendKeys(map.get("password"));
        log.info("password entered");

        CreateAccount.days.click();
        new Select(CreateAccount.days).selectByValue(map.get("day"));
        log.info("day chosen");

        CreateAccount.months.click();
        new Select(CreateAccount.months).selectByValue(map.get("month"));
        log.info("month chosen");

        CreateAccount.years.click();
        new Select(CreateAccount.years).selectByValue(map.get("year"));
        log.info("year chosen");

        //CreateAccount.firstname.sendKeys(map.get("firstName"));
        //CreateAccount.lastname.sendKeys(map.get("lastName"));
        CreateAccount.company.sendKeys(map.get("company"));
        log.info("entered company");

        CreateAccount.address1.sendKeys(map.get("address"));
        log.info("entered first line of address");

        CreateAccount.address2.sendKeys(map.get("address2"));
        log.info("entered the second line of address");

        CreateAccount.city.sendKeys(map.get("city"));
        new Select(CreateAccount.id_state).selectByVisibleText(map.get("state"));
        log.info("state selected");

        CreateAccount.postcode.sendKeys(map.get("postCode"));
        log.info("postcode entered");

        new Select(CreateAccount.id_country).selectByVisibleText(map.get("country"));
        log.info("country chosen");

        CreateAccount.info.sendKeys(map.get("info"));
        log.info("information entered");

        CreateAccount.phone.sendKeys(map.get("phone"));
        log.info("phone entered");

        CreateAccount.phone_mobile.sendKeys(map.get("mobile"));
        log.info("mobile entered");

        CreateAccount.alias.clear();
        CreateAccount.alias.sendKeys(map.get("alias"));
        log.info("alias entered");


        CreateAccount.submitAccount.click();
        log.info("submit clicked");
        SignOutAction.execute();

        Thread.sleep(5000);

        // driver.get("http://automationpractice.com/index.php?");
    }

}
