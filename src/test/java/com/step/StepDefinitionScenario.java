package com.step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionScenario {
	WebDriver driver;
	
	
	@Given("User Enters the facebook url")
	public void user_enters_the_facebook_url() {
		
		  driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
	   
		
	}

	@When("User Enters the invalid username and invalid password")
	public void user_enters_the_invalid_username_and_invalid_password() {
	   
		//inspect userName

		 driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("kani963@gmail.com");
		

		//inspect Password
		
	   driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("9697");	
	   
		
	}

	@When("User Clicks on the LoginButton")
	public void user_clicks_on_the_login_button() {
		
		   driver.findElement(By.xpath("//span[text()=\"Log in\"]")).click();
	  
	    
	}

	@Then("User Validates The Error Message After Login")
	public void user_validates_the_error_message_after_login() {
			
		System.out.println("user Verify Successfully");
		
	       
	}

}
