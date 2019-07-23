package runner;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SecondStep extends FunctionModel
{
	//@Test (dependsOnMethods = { "open_browser" })
	@Given("^click on new account link$")
	public void click_on_new_account_link() throws Throwable 
	{
		driver.findElement(By.xpath("//a[contains(text(),'Create a new account')]")).click();
		
	  
	}

	@When("^enter the first name$")
	public void enter_the_first_name() throws Throwable {
		driver.findElement(By.xpath("//input[@name='name31a62a4d']")).sendKeys("valyeadas as");;
	   
	}

	@Then("^enter the last name$")
	public void enter_the_last_name() throws Throwable {
		driver.findElement(By.xpath("//input[@name='passwd31a62a4d']")).sendKeys("akshdkakd");;
	    
	}

	@Then("^enter the email id$")
	public void enter_the_email_id() throws Throwable {
		driver.findElement(By.xpath("//input[@name='altemail31a62a4d']")).sendKeys("asdbmasbd");;
	    
	}

	

}
