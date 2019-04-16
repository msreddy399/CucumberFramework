package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = { "src/test/java/resources/features/Sample1.feature" }, 
        glue = {"stepDefinitions" }, 
        monochrome=true, 
        dryRun=true,
        tags = {}, 
        plugin={ "html:target/cucumber-html-reports", "json:target/cucumber.json",
      		          "pretty:target/cucumber-pretty.txt", "junit:target/cucumber-results.xml" }
        )

public class MainRunner {
	
	
}