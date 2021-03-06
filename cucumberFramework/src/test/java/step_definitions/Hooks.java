package step_definitions;


import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import helpers.GlobalUtils;
import helpers.log;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * blocks of code that will run before of after each scenario
 */
public class Hooks {


 public static WebDriver driver;

 DesiredCapabilities capabilities=null;

 public static final String USERNAME = "bdush1";
 public static final String AUTOMATE_KEY = "UsUi6p9mozFw2mpqjefz";
 public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

 @Before
 public void openBrowser() throws MalformedURLException,IOException{
	 
	 

     log.info("************************Hooks @Before Test Scenarios started********************");

     log.info("Hooks @Before( Cucumber annotation , run before the scenario) Opening Chrome Browser------------------------------");
     
   if(GlobalUtils.getProperties("browser").equals("local")) {

     System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");

     // Class to manage options specific to ChromeDriver.
     ChromeOptions options = new ChromeOptions();
     options.addArguments("start-maximized");
     options.addArguments("--disable-extensions");
     options.addArguments("--disable-infobars");
     //this will collect the preferences
     Map<String,Object>prefs=new HashMap<String, Object>();
     // this will stop chrome asking if you want to save password
     prefs.put("credentials_enable_service",false);
     prefs.put("profile.password_manager_enabled",false);
     // this is doing the same as disable inforbars above , do we need it ?
     prefs.put("excludeSwitches", "enable-automation");
     // will this read all the preferences from the hashmap ?
     options.setExperimentalOption("prefs",prefs);
     capabilities=DesiredCapabilities.chrome();
     //capabilities.setVersion("latest");
     capabilities.setCapability("version","latest");
     //capabilities.setBrowserName("chrome");
     capabilities.setCapability("browserName","chrome");
     capabilities.setCapability(ChromeOptions.CAPABILITY,options);
     driver=new ChromeDriver(options);
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     driver.manage().deleteAllCookies();

   }else if(GlobalUtils.getProperties("browser").equals("chrome")) {
	   
	   DesiredCapabilities caps = new DesiredCapabilities();
	   caps.setCapability("browser", "Chrome");
	    caps.setCapability("browser_version", "62.0");
	    caps.setCapability("os", "Windows");
	    caps.setCapability("os_version", "10");
	    caps.setCapability("resolution", "1024x768");
	    caps.setCapability("acceptSslCerts", "true");
	    caps.setCapability("project", "CucumberFrameworkChrome");
	    caps.setCapability("built", "Version1");
	   
	    
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("start-maximized");
	    options.addArguments("--disable-extensions");
	    options.addArguments("--disable-infobars");
	    
	    Map<String,Object> prefs=new HashMap<String, Object>();
	    prefs.put("credentials_enable_service",false);
	    prefs.put("profile.password_manager_enabled",false);
	    prefs.put("excludeSwitches", "enable-automation");
	    prefs.put("excludeSwitches", "disable-popup-blocking");
	    options.setExperimentalOption("prefs",prefs);
	    caps.setCapability(ChromeOptions.CAPABILITY,options);
	    
	    
	    driver = new RemoteWebDriver(new URL(URL), caps);
	    driver.manage().deleteAllCookies();
    	 
	   log.info(((RemoteWebDriver) driver).getSessionId().toString());
	   
	   
	   
    	 
   }else if(GlobalUtils.getProperties("browser").equals("firefox")) {
	   
    	 
    	 
    	 
    	 
    	 
   }else if(GlobalUtils.getProperties("browser").equals("ie")) {
	   
	   
	   DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("browser", "IE");
	    caps.setCapability("browser_version", "11.0");
	    caps.setCapability("os", "Windows");
	    caps.setCapability("os_version", "10");
	    caps.setCapability("resolution", "1024x768");
	    caps.setCapability("project", "CucumberFrameworkFirefox");
	    caps.setCapability("built", "Version1");
	    caps.setCapability("browserstack.ie.enablePopups", "true");
	
	    caps.setCapability("acceptSslCerts", "true");
	    
	    driver = new RemoteWebDriver(new URL(URL), caps);
	    driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	   
    	 
    	 
    	 
    	 
    	 
    	 
     }
 }


    /**
     * will run after every scenario
     * will take screenshot at the last screen where test case failed.
     * attach the screenshot to the report output
     * close the chrome browser session
     *
     * @param scenario
     * @throws IOException
     */
    @After

    public void embedScreenshot(Scenario scenario) throws IOException {

        log.info("Hooks: @After ( cucumber annotation)  test actions- run after each scenario");

        if(scenario.isFailed()){

            log.error("Hooks: @ After -Test Scenarios Failed");
            try {
                
                
                scenario.write("Current Page URL is " + driver.getCurrentUrl());
                
                log.info("Current Page URL is " + driver.getCurrentUrl());

                File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                
                String screenShot="Screenshot_"+System.currentTimeMillis();
                
                String screenshotPath=System.getProperty("user.dir")+"\\ExecutionReports\\FailedScreenshots" + "\\"+screenShot+".png";
                
                File destination=new File(screenshotPath);

                FileUtils.copyFile(source,destination);

                Reporter.addScreenCaptureFromPath("\\ExecutionReports\\\\FailedScreenshots" + "\\"+screenShot+".png");
                
                log.info("path "+destination.getAbsolutePath());


/*
                String scFileName = "ScreenShot_" + System.currentTimeMillis();
                String screenshotFilePath = System.getProperty("user.dir")+"\\ExecutionReports\\FailedScreenshots" + "\\" + scFileName + ".png";
                byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
                FileOutputStream fileOuputStream = new FileOutputStream(screenshotFilePath);
                fileOuputStream.write(screenshot);
                scenario.embed(screenshot, "image/png");

*/
            }catch(WebDriverException somePlatformsDontSupportScreenshots){

                System.err.println(somePlatformsDontSupportScreenshots.getMessage());
            }


        }
        log.info("**********Hooks :@After  Test Scenarios END********************");
      driver.quit();
    }

}
