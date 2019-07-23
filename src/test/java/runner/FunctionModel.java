package runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FunctionModel 
{
	WebDriver driver;
	String rediff_url = "https://mail.rediff.com/cgi-bin/login.cgi";
	
	@Given("^open the browser$")
	public void open_browser()
	{
		System.setProperty("webdriver.chrome.driver", "/home/bhushank/Downloads/chrome/chromedriver");
		driver = new ChromeDriver();
		driver.get(rediff_url);
		driver.manage().window().maximize();
		
	}
	
	@When("^enter the email$")
	public void enter_the_email() throws Throwable 
	{
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("bhushank@rediffmail.com");
		   
	    
	}

	@Then("^enter the password$")
	public void enter_the_password() throws Throwable 
	{
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("asdaqweqw");
	    
		
	}

	@Then("^click$")
	public void click() throws Throwable {
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
	}

}
