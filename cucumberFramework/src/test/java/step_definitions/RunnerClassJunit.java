package step_definitions;


import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features=".",
        plugin = {"pretty","html:target3/cucumber-html-report",
                "json:target3/cucumber.json",
                "com.cucumber.listener.ExtentCucumberFormatter:output/report.html"},
        tags = {"@CreateAccount"},
        strict=true,
        dryRun = false

)

public class RunnerClassJunit {

    @AfterClass
    public static void tearDown(){


        Reporter.loadXMLConfig(System.getProperty("user.dir")+"/scr/main/resources/extent-config.xml");
        Reporter.setSystemInfo("user id",System.getProperty("user.name"));
        Reporter.setSystemInfo("operating system","windows");




    }
}



