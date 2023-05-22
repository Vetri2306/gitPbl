package bind;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pack1.bird;
import pack1.fishproduct;
import pack1.petstorelogin;

public class petstorebinding {

	@Given("I launch the PetStore application")
	public void i_launch_the_pet_store_application() {
		System.out.println("launch successfully");

	}

	@When("I click signin to launch signin page")
	public void i_click_signin_to_launch_signin_page() throws InterruptedException {
		petstorelogin.signin();
	}

	@When("I enter the UserName {string}")
	public void i_enter_the_user_name(String string) {
		petstorelogin.loginusername(string);
	}

	@When("I enter the password")
	public void i_enter_the_password() {

	}

	@When("I click the login button")
	public void i_click_the_login_button() {
		// Write code here that turns the phrase above into concrete actions
		petstorelogin.loginbtn();
	}

	@Then("I see the PetStore HomePage")
	public void i_see_the_pet_store_home_page() {
		System.out.println("successfully");
	}

	@Given("I am on the PetStore Homepage")
	public void i_am_on_the_pet_store_homepage() {

	}

	@When("I search for F1-SE")
	public void i_search_for_f1_se() throws InterruptedException {
		fishproduct.click();
	}

	@When("I add it to cart")
	public void i_add_it_to_cart() {
		fishproduct.proceed();
	}

	@When("I proceed to checkout")
	public void i_proceed_to_checkout() {
		fishproduct.selctest();
	}

	@When("I continue to confirm the order")
	public void i_continue_to_confirm_the_order() {
		fishproduct.cont();
	}

	@Then("I see confirm order message")
	public void i_see_confirm_order_message() {
		fishproduct.confirm();
	}

	@When("I search for AV-CB")
	public void i_search_for_av_cb() {
		bird.click();
	}

	@When("I add it to cart1")
	public void i_add_it_to_cart1() {
		bird.selctest();
	}

	@When("I proceed to checkout1")
	public void i_proceed_to_checkout1() {
		bird.proceed();
	}

	@When("I continue to confirm the order1")
	public void i_continue_to_confirm_the_order1() {
		bird.cont();
	}

	@Then("I see confirm order message1")
	public void i_see_confirm_order_message1() {
		bird.confirm();
	}
}