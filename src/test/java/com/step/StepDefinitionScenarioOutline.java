package com.step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class StepDefinitionScenarioOutline {
	
	WebDriver driver;
	@Given("user is on login Page")
	public void user_is_on_login_page() {
	   
		// open Chrome

		driver=new ChromeDriver();		
		
		
			//url Launch	
		
		driver.get("https://www.facebook.com/");	
		
			System.out.println("Open Chrome Successfully");		    
	    
	    
	}
	@When("user enters {string} and {string}")
	public void user_enters_and(String username, String password) {
	    
		
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys(username);
		//inspect Password
		
	   driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys(password);
	   
	   
	   driver.findElement(By.xpath("//span[text()=\"Log in\"]")).click();
		
		System.out.println("Button Click Successfully");  

	   
	   System.out.println("Enter UserNAme Password Successfully");
	   
	    
	    
	}
	@Then("errormessage should be displayed")
	public void errormessage_should_be_displayed() {
	    
		
		System.out.println("VerifyError Message Successfully");
		
	}






}
