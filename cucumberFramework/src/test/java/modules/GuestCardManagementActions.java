package modules;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

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
		
		
		log.info("getting card quantity before closing the browser : "+cardQuantityBeforeClose);
		
	   return cardQuantity;
	   
	   
		
	}
	
	public static Set<Cookie> getCookies(WebDriver driver) {
		
		
		log.info("getting all cookies");
		Set<Cookie> allCookies=driver.manage().getCookies();
		
		
		return allCookies;
		
	}

	
	public static void closeBrowser(WebDriver driver) {
		
		
		log.info("closing the driver");
		
		driver.close();
			
			
		}
	
	
	
	public static WebDriver newDriver;
	
	public static void openBrowser() throws IOException{
		
		
		 if(GlobalUtils.getProperties("browser").equals("local")) {
			 
			 log.info("opening the browser");
			 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			 
			 newDriver=new ChromeDriver();
			 
			 newDriver.get("http://automationpractice.com/index.php?");
			 
			 newDriver.manage().window().maximize();
			 
			 
		 }else if(GlobalUtils.getProperties("browser").equals("chrome")) {
			 log.info("opening the browser");
             System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			 
             newDriver=new ChromeDriver();
			 
             newDriver.get("http://automationpractice.com/index.php?");
		
		 } else if(GlobalUtils.getProperties("browser").equals("firefox")) {
			   
			 log.info("opening the browser");
		    	 
	    	 
		 }else if(GlobalUtils.getProperties("browser").equals("ie")) {
	
	
			 log.info("opening the browser");
		
		
	}
		 
	}
	
	
	public static void addCookies() {
		
		log.info("adding cookies");
		
		Set<Cookie> cookies=getCookies(newDriver);
		
		
		for(Cookie cookie: cookies) {
			
			newDriver.manage().addCookie(cookie);
			
		}
		
		
	}
	
	
		public static int  getCardQuantityAfterClose() {
			
			
			
		
			
			cardQuantityAfterClose=Integer.parseInt(newDriver.findElement(By.xpath("//a[@title='View my shopping cart']/span[1]")).getText());
		

			log.info("getting card quantity after closing the browser : "+cardQuantityAfterClose);
			
		
		   return cardQuantityAfterClose;
		   
			
		}
		
		
	

	
	
	

}
