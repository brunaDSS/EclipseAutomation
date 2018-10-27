package step_definitions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(features=".",
tags = {"@AddToCard"},

plugin = {"pretty","html:target2/cucumber-html-report",
        "json:target2/cucumber.json",
        "com.cucumber.listener.ExtentCucumberFormatter:output/report.html"},

strict = true,
dryRun = false
)

public class TestNgFeatureRunner {
	
	private TestNGCucumberRunner testNGCucumberRunner;
	
	@BeforeClass(alwaysRun=true)
	public void setUpClass() throws Exception {
		testNGCucumberRunner=new TestNGCucumberRunner(this.getClass());
	
	}
	
	@Test(groups="cucumber scenarios",description="runs Cucumber Features",dataProvider="features")
	public void feature(CucumberFeatureWrapper cucumberFeature) throws Throwable {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
		
	}
	
	@DataProvider
	public Object[][] features(){
		
		return testNGCucumberRunner.provideFeatures();
	}
	
	@AfterClass
	public void tearDownClass() throws Exception{
		
		testNGCucumberRunner.finish();
	}
	
	
	

}
