package cucumber.mavenCucuProto1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	@Given("^This is my dummy$")
	public void this_is_my_dummy() throws Throwable {
	 System.out.println("This is Test One");
	}

	@When("^This is my dummy2$")
	public void this_is_my_dummy2() throws Throwable {
		 System.out.println("This is Test Two");
	}

	@Then("^This is my dummy3$")
	public void this_is_my_dummy3() throws Throwable {
		 System.out.println("This is Test Three");
	}
}
