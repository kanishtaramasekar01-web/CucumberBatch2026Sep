package com.step;

import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionDataTable {
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		
	 
	    
	}

	@When("user enters login details")
	public void user_enters_login_details(io.cucumber.datatable.DataTable dataTable) {
	   
		
		 Map<String, String> data = dataTable.asMap();

		    String username = data.get("username");
		    String password = data.get("password");

		    System.out.println("Username: " + username);
		    System.out.println("Password: " + password);
	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user should see home page")
	public void user_should_see_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
