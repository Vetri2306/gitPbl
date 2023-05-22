package pack1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class signinbinding {

	@Given("Launch the application")
	public void launch_the_application() {
	    
	}

	@When("I enter the Email in the field")
	public void i_enter_the_emailid_in_the_field() {
		
	}

	@When("I enter the password in the field")
	public void i_enter_the_password_in_the_field() {

	}

	@When("I click the signin button")
	public void i_click_the_signin_button() {
	  
	}

	@Then("Verified that user signin succesfully")
	public void verified_that_user_signin_succesfully() {
	   
		 System.out.println("launch success");
	}
}
