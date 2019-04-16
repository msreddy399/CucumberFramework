package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;

import Utils.DriverFactory;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Common_SD extends DriverFactory {	

	@Given("^User access home page$")
	public void user_access_home_page() throws Throwable {

		initializeBrowser();
	}
	
	@Then("^verify the page title$")
	public void verify_the_page_title() throws Throwable {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Award Winning Cooking Tools & Housewares | OXO | The OXO Better Guarantees");
	}
	
	@Given("^user clicks on Sign In link in the header$")
	public void user_clicks_on_Sign_In_link_in_the_header() throws Throwable {
		driver.findElement(By.xpath("(//*[@class='link wishlist'])[1]")).click();
		
	}

	@Given("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
		driver.findElement(By.xpath("//*[@id='email-social']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='pass-social']")).sendKeys(password);
		
	}

	@Given("^Clicks on login button$")
	public void clicks_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//*[@id='send2']")).click();
		
	}
	
	@Given("^User enters credentials$")
	public void user_enters_credentials(DataTable arg1) throws Throwable {
		
		List<List<String>> raw = arg1.raw();
		driver.findElement(By.xpath("//*[@id='email-social']")).sendKeys(raw.get(0).get(0));
		driver.findElement(By.xpath("//*[@id='pass-social']")).sendKeys(raw.get(1).get(1));
		
	}
	
	@Given("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String username, String password) throws Throwable {
		driver.findElement(By.xpath("//*[@id='email-social']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='pass-social']")).sendKeys(password);
		
	}


}
