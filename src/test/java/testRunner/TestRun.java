package testRunner;

import org.junit.runner.RunWith;
import org.junit.runner.RunWith;
import org.testng.annotations.Test;
 
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features=".//Features/Button.feature",
		glue="stepDefinitions",
		dryRun=false,
		monochrome=true,
		//plugin= {"pretty","html:test-output"}
		// Corrected plugin configuration
		plugin = {"pretty", "html:C:\\Users\\megal\\eclipse-workspace\\Cucumber_Framework\\TestOutput"}		
		)
 
@Test

public class TestRun {

}
