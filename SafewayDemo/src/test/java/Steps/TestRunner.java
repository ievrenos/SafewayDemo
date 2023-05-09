package Steps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    plugin = {
	      "pretty",
	      "html:target/cucumber-reports/cucumber.html",
	      "json:target/cucumber-reports/cucumber.json"
	    },
	    monochrome=true,
	    features = {"src/test/resources/Features"},
	    glue = {"Steps"})	
public class TestRunner extends AbstractTestNGCucumberTests {}

