package stepDefinitions;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Utils.DriverFactory;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends DriverFactory  {
	
	@Before
	public void BeforeSteps() {	
		
		System.out.println("starting browser");

	}
	
	@After
	public void AfterSteps(Scenario scenario) {
		//driver.close();
		
		if (driver != null && scenario.isFailed()) {

			scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
			 driver.manage().deleteAllCookies(); 
			 driver.quit(); 
			 driver= null;
		}
		if (driver != null) {

			driver.manage().deleteAllCookies();
			driver.quit();
			driver = null;
		}

	}
}
