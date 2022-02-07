package stepDefination;
import io.cucumber.java.en.*;

public class stepDefination {
	@Given("User is on netbanking landing page")
	public void user_is_on_netbanking_landing_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user_is_on_netbanking_landing_page");
	}

	@When("User loging into app using {string} and {string}")
	public void user_loging_into_app_using_and(String string, String string2) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user_loging_into_app_using_and");
	}

	@Then("Home is poppulated")
	public void home_is_poppulated() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("home_is_poppulated");
	}
	
	@Given("User is on facebook login page")
	public void user_is_on_facebook_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user_is_on_facebook_login_page");
	}

	@When("user providing userid and password")
	public void user_providing_userid_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user_providing_userid_and_password");
	}

	@Then("validate credentials and navigate to home page")
	public void validate_credentials_and_navigate_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("validate_credentials_and_navigate_to_home_page");
	}

	

}
