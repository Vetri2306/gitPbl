package pack1;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ABCbinding {



	@Given("^I am A$")
	public void i_am_a() {
		System.out.println("s");
	}

	@When("^I do B$")
	public void i_do_b() {
		System.out.println("i go b");
	}

	@Then("^I go C$")
	public void i_go_c() throws Throwable {
		System.out.println("i go C");
	}
}
