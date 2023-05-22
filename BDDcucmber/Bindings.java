package Bindingspet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.jpethomepage;

public class Bindings {
	@When("I click on the Sign Inlink")
	public void i_click_on_the_sign_inlink() {
	 jpethomepage.home();
	    
	}
	@When("I enter the username {string}")
	public void i_enter_the_username(String string) {
		jpethomepage.user();
	}
	
	    
	@When("I enter the password")
	public void i_enter_the_password() {
		jpethomepage.pass();
	}
	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		jpethomepage.login();
	}
	@Then("I should be logged in with my account")
	public void i_should_be_logged_in_with_my_account() {
		
	}
	@Given("Iam a user who launched a jpetsore to sign up a account")
	public void iam_a_user_who_launched_a_jpetsore_to_sign_up_a_account() {
	  
	}
	@Then("Hit enter key to sign up")
	public void hit_enter_key_to_sign_up() {
	 
	    
	}
	@Then("I click fish")
	public void i_click_fish() {
	  jpethomepage.Fish();
	}
	@Then("I click F1-SW-{int}")
	public void i_click_f1_sw(Integer int1) {
		 jpethomepage.F1();
	    
	}
	@Then("I click EST-{int}")
	public void i_click_est(Integer int1) {
	    jpethomepage.adds();
	}
	@Then("I click add to cart")
	public void i_click_add_to_cart() {
		
	}
	@Then("I click proceed to checkout")
	public void i_click_proceed_to_checkout() {
	    jpethomepage.Proceed();
	}
	@Then("I click continue")
	public void i_click_continue() {
	   jpethomepage.conti();
	}
	@Then("I click confirm")
	public void i_click_confirm() {
	    jpethomepage.confirm();
	}
	@Then("I click Birds")
	public void i_click_birds() {
		jpethomepage.Birds();
	   
	}
	@Then("I click Av-cb-{int}")
	public void i_click_av_cb(Integer int1) {
	  jpethomepage.Av();
	}









	
}

