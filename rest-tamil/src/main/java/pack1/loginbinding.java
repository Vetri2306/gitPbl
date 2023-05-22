package pack1;

import org.junit.runner.RunWith;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

public class loginbinding {

	@RunWith(Cucumber.class)
	public class MyStepDefinitions {

	    @Given("^I am reading a name$")
	    public void i_am_reading_a_name() throws Throwable {
	        throw new PendingException();
	    }

	    @When("^I enter the above provider name$")
	    public void i_enter_the_above_provider_name() throws Throwable {
	        throw new PendingException();
	    }

	    @Then("^i go to C$")
	    public void i_go_to_c() throws Throwable {
	        throw new PendingException();
	    }
	}
}
