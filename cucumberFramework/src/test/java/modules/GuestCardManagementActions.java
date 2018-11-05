package modules;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Currency;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import helpers.GlobalUtils;
import helpers.log;
import pageObjects.CheckOut;
import pageObjects.Dresses;

public class GuestCardManagementActions {
	
	
	public static int cardQuantityBeforeClose;
	
	public static int cardQuantityAfterClose;
	
	public static String secondProductName;
	
	public static List<String> prices;
	
	public static List<Double> pricesDouble;
	
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
		
		public static void addToCompare(WebDriver driver) throws Exception {
	
			
			
			
		    GlobalUtils.explicitWait(Dresses.add_to_compare, driver, 10);
			
			GlobalUtils.hoverAndClickElement(driver,Dresses.add_to_compare);
			
			log.info("adding the product to the compare card");
			
			Thread.sleep(5);
		}
		
		
		public static void hoverOnSecondProduct(WebDriver driver) {

	        GlobalUtils.hoverOverElement(driver,Dresses.second_item_ho0ver);
	        
	        log.info("hovering over the product");
	        
	        secondProductName=GlobalUtils.getElementText(Dresses.get_second_product_name);
	      
	        
	        log.info("getting the seconds product name"+secondProductName);

	    }
		
		public static void goToCompare(WebDriver driver) {
			
			GlobalUtils.waitForPageToLoad(driver);
			
			GlobalUtils.clickOnEelement(Dresses.go_to_compare);
			
			
			
		}
		
		public static ArrayList<String> compareCardContent(WebDriver driver) {
			
			List<WebElement> productNames=driver.findElements(By.xpath("//table[@id='product_comparison']/tbody/tr/td/h5/a"));
			List<String> prodNames=new ArrayList<String>();
			
			for( WebElement element:productNames) {
				
				prodNames.add(GlobalUtils.getElementText(element));
		
			}
			
			return (ArrayList<String>) prodNames;
			
			
		}
		
		
		
		



    public static void i_get_the_of_all_dresses(String info,WebDriver driver)  {
	
    	System.out.println("info value in Action method "+info);
    	if(info.equalsIgnoreCase("prices22"))
    	{
    		
    	System.out.println("inside if body");
    	log.info("getting prices");
		List<WebElement> pricesElement = driver.findElements(By.xpath("//*[@id='center_column']//span[@class='price product-price']"));
		prices=new ArrayList<String>();
		 
		for(WebElement element: pricesElement) {
			
			 String price=element.getText().replaceAll(" ","");
			
		//price=price.replaceAll("[^\\d.]+", "");
			
			if(!price.equals(""))
			{
			prices.add(price);
			
			log.info("price : "+ price);
			
		  }
	}
		
		

		log.info(Arrays.deepToString(prices.toArray()));

		for(String pr:prices  ) {
			
			String priceD=pr.replaceAll("$".toString(), "");			
			priceD=priceD.replaceAll(" ","");			
			log.info("price without space and $ "+priceD);
			
			pricesDouble.add(Double.parseDouble(priceD));			
			log.info("double Price"+Double.parseDouble(priceD));
			
		}
		
		log.info(Arrays.deepToString(pricesDouble.toArray()));
	
    	}
        System.out.println("outside if body");
		
    	}
    
    
    
    
 

   public void i_sort_the_by(String info, String condition)  {
	   
	   
	   
	
	
 
   }


   public void i_sort_the_dresses_page_by(String condition)  {
	
	
    
   }

   public void i_shouldn_see_the_products_sorted_in_the_right_order()  {
	
	

   }


		
		
		
		
		
		
		


	
	
	

}
