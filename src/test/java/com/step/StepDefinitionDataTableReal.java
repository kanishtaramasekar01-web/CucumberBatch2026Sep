package com.step;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class StepDefinitionDataTableReal {
	
	WebDriver driver;
	
	@Given("User enters login credentials")
	public void user_enters_login_credentials(io.cucumber.datatable.DataTable dataTable) {
	    
		
		
//		List<Map<String, String>> data = 
//                dataTable.asMaps(String.class, String.class);
//
//        for(Map<String, String> row : data) {
//
//            String username = row.get("username");
//            String password = row.get("password");
//
//            System.out.println("Username: " + username);
//            System.out.println("Password: " + password);
		
		
		
		  List<Map<String,String>> data =
	                dataTable.asMaps(String.class, String.class);

	        driver = new ChromeDriver();

	        driver.get("https://www.facebook.com");

	        for(Map<String,String> row : data) {

	            String username = row.get("username");
	            String password = row.get("password");

	            driver.findElement(By.xpath("//input[@name=\"email\"]")).clear();
	            driver.findElement(By.xpath("//input[@name=\"email\"]"))
	                    .sendKeys(username);

	            driver.findElement(By.xpath("//input[@name=\"pass\"]")).clear();
	            driver.findElement(By.xpath("//input[@name=\"pass\"]"))
	                    .sendKeys(password);

	            System.out.println(username);
	            System.out.println(password);
	        }
		
		
		
		
		
		
	}



}
	

