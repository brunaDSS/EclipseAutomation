package helpers;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.print.attribute.standard.RequestingUserName;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.cucumber.listener.Reporter;

import step_definitions.Hooks;

public class ListenerClass implements ITestListener{

	public void onTestStart(ITestResult result) {
	
		// will run before the main test start
		
		log.info("onTestStart listener - test started "+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		
	// will run when if the test is passed
		log.info("OnTestSuccess listener");
		
		
		/*if(result.isSuccess()) {
			
			
			Calendar calendar=Calendar.getInstance();
			SimpleDateFormat formater =new SimpleDateFormat("dd-MM-yyyy_hh_mm_ss");
			
			String methodName=result.getName();
			
			File scrFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
			
				String reportDirectory=new File(System.getProperty("user.dir")).getAbsolutePath()+"\\"+"\\ExecutionReports\\testEnginePassedScreenshots\\";
			
				File destFile=new File(reportDirectory +methodName+"_"+formater.format(calendar.getTime())+".png");
				
				FileUtils.copyFile(scrFile, destFile);
				
			
			
			}catch (IOException e){
				
				e.printStackTrace();
			}finally {
				
	
				
			}
		}*/
		
		
	}

	public void onTestFailure(ITestResult result) {
		
		log.error("OnTestFailure listener ");
		
	/*	if(!result.isSuccess()) {	
			
			Calendar calendar=Calendar.getInstance();
			SimpleDateFormat formater =new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
			
			String methodName=result.getName();
			
			log.info("failed listener " +methodName);
			
			File scrFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
			
				String reportDirectory=new File(System.getProperty("user.dir")).getAbsolutePath()+"\\"+"\\ExecutionReports\\testEngineFailedScreenshots\\";
			
				File destFile=new File(reportDirectory +methodName+"_"+formater.format(calendar.getTime())+".png");
				
				FileUtils.copyFile(scrFile, destFile);
					
			
			}catch (IOException e){
				
				e.printStackTrace();
				
			}finally {
						
				driver.quit();
			}
		
		}
		
		*/
	}

	public void onTestSkipped(ITestResult result) {
		
		String methodName=result.getName();
		log.info(methodName + " was skipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
		
	}

	public void onStart(ITestContext context) {
		// context -the host where this test was run , this will run before the test/batch starts running 
	log.info(" Test  Started- onStart Listener: "+ context.getName());
		
	}

	public void onFinish(ITestContext context) {
		//this will run after the test/batch has finished running
		log.info(" Test  ended- onFinish Listener: "+ context.getName());
	
		
	}

	
	
	
	
	// capture the event 

}
