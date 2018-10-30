package modules;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import helpers.GlobalUtils;
import helpers.log;
import pageObjects.CheckOut;
import pageObjects.Dresses;

public class GuestCardManagementActions {
	
	
	public static int cardQuantityBeforeClose;
	
	public static int cardQuantityAfterClose;
	
	public static void continueShopping(WebDriver driver) {
		
		
		driver.switchTo().defaultContent();

        GlobalUtils.explicitWait(Dresses.continue_shopping, driver, 10);

        log.info("Switching to popup window of The  product");

        Dresses.continue_shopping.click();

        log.info("Clicking on continue shopping of the  product");
	}
	
	
	public static int  getCardQuantity() {
		
		
		int cardQuantity=Integer.parseInt(GlobalUtils.getElementText(CheckOut.shopping_card_quantity));
		
	   return cardQuantity;
	   
	   
		
	}
	
	public static Set getCookies(WebDriver driver) {
		
		Set<Cookie> allCookies=driver.manage().getCookies();
		
		
		return allCookies;
		
	}

	
	public static void closeBrowser(WebDriver driver) {
		
		
		driver.close();
			
			
		}
	
	public static void openBrowser(WebDriver driver) throws IOException{
		
		
		 if(GlobalUtils.getProperties("browser").equals("local")) {
			 
			 
			 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			 
			 driver=new ChromeDriver();
			 
			   driver.get("http://automationpractice.com/index.php?");
			 
			 
		 }else if(GlobalUtils.getProperties("browser").equals("chrome")) {
			 
             System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			 
			 driver=new ChromeDriver();
			 
			   driver.get("http://automationpractice.com/index.php?");
		
		 } else if(GlobalUtils.getProperties("browser").equals("firefox")) {
			   
	    	 
		    	 
	    	 
		 }else if(GlobalUtils.getProperties("browser").equals("ie")) {
	
	
		   
		
		
	}
		 
	}
	
	
	public static void addCookies(WebDriver driver) {
		
		Set<Cookie> cookies=getCookies(driver);
		
		
		for(Cookie cookie: cookies) {
			
			driver.manage().addCookie(cookie);
			
		}
		
		
		
		
	}

	
	
	

}
