package step_definitions;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;

import java.io.File;
import java.io.IOException;


@CucumberOptions(features=".",
        tags = {"@ShoppingAsGuest"},
        plugin = {"pretty","html:target2/cucumber-html-report",
                "json:target2/cucumber.json",
                "com.cucumber.listener.ExtentCucumberFormatter:output/report.html"},

        strict = false,
        dryRun = true
        )


public class RunnerClass4 extends AbstractTestNGCucumberTests {


    @AfterClass
    public static void tearDown () throws IOException{

       Reporter.loadXMLConfig(new File("src/main/resources/extent-config.xml"));
       Reporter.setSystemInfo("user", System.getProperty("user.name"));
       Reporter.setSystemInfo("os", "Windows");
       Reporter.setTestRunnerOutput("Sample test runner output message");



    }


}