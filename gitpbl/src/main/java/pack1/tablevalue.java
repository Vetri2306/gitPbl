package pack1;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class tablevalue {

	@Given("I am reading a name")
	public void i_am_reading_a_name(DataTable dataTable) {

		List<List<String>> data = dataTable.asLists(String.class);
		System.out.println(data.get(0).get(0));
		System.out.println(data.get(1).get(0));
	}

	@When("I enter the above provider name")
	public void i_enter_the_above_provider_name() {

	}
}
