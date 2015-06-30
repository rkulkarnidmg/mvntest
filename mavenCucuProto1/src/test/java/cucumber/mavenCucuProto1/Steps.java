package cucumber.mavenCucuProto1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	@Given("^I am on SFServiceCloud$")
	public void i_am_on_SFServiceCloud() throws Throwable {
		System.out.println("I am on SFServiceCloud");
	}

	@When("^I use valid credentials$")
	public void i_use_valid_credentials() throws Throwable {
		System.out.println("I use valid credentials");
	}

	@Then("^I am logged in$")
	public void i_am_logged_in() throws Throwable {
		System.out.println("I am logged in");
	}

	@Given("^I am logged in as OP(\\d+)TSS$")
	public void i_am_logged_in_as_OP_TSS(int arg1) throws Throwable {
		System.out.println("I am logged in as OP");
	}

	@When("^I enter valid information$")
	public void i_enter_valid_information() throws Throwable {
		System.out.println("I enter valid information");
	}

	@When("^I click on ProcessMe$")
	public void i_click_on_ProcessMe() throws Throwable {
		System.out.println("I click on ProcessMe");
	}

	@Then("^I can create an invoice$")
	public void i_can_create_an_invoice() throws Throwable {
		System.out.println("I can create an invoice");
	}

	@Given("^I am logged in a OP(\\d+)TSS$")
	public void i_am_logged_in_a_OP_TSS(int arg1) throws Throwable {
		System.out.println("I logged in as OP2");
	}

	@When("^I enter invalid iformation$")
	public void i_enter_invalid_iformation() throws Throwable {
		System.out.println("I Enter invalid information");
	}
	
}
