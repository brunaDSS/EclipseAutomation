package helpers;

import com.cucumber.listener.Reporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;


public class TakeScreenShots {

    public static String capture(WebDriver driver) throws IOException{

       File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       String screenShot="Screenshot_"+System.currentTimeMillis();
       String screenshotPath=System.getProperty("user.dir")+"\\ExecutionReports" + "\\"+screenShot+".png";
       File destination=new File(screenshotPath);

        FileUtils.copyFile(source,destination);

     //   Reporter.addScreenCaptureFromPath("./ExecutionReports/FailedScreenshots/"+screenShot+".png");

        return screenshotPath;
    }
}
