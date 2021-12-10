package com.travel.file;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDDLoginRunner {
		
			 @Given("^user is on the login page$")
			 public void user_is_on_the_login_page()
			 {
				 System.out.println("Login page");
			 }
			 
			  @When("^enters correct username and password$")
				 public void enters_correct_username_and_password()
				 {
					 System.out.println("correct username and password");
				 }
			    @Then("^user gets confirmation$")
				 public void user_gets_confirmation()
				 {
					 System.out.println("Success");
				 }
			
		
	
}
