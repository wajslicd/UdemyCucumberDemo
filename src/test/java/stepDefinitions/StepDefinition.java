package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.util.List;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinition {
    @Given("^validate the browser$")
    public void validate_the_browser() throws Throwable {
    	System.out.println("Select browser");
    }

    @When("^browser is triggered$")
    public void browser_is_triggered() throws Throwable {
    	System.out.println("Browser is triggered");
    }

    @Then("^check if browser is displayed$")
    public void check_if_browser_is_displayed() throws Throwable {
    	System.out.println("Browser is displayed");
    }

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        //code to navigate to login url
    	System.out.println("Navigated to login URL");
    }

    @When("^User logs into application with username and password$")
    public void user_logs_into_application_with_username_and_password() throws Throwable {
        //code to login
    	System.out.println("Logged in successfully");
    }
    
    @When("^User logs into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_logs_into_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println(strArg1);
    	System.out.println(strArg2);
    }
    
    @When("^User signs up with following details$")
    public void user_signs_up_with_following_details(DataTable data) throws Throwable {
    	List<List<String>> obj = data.raw();
    	System.out.println(obj.get(0).get(0));
    	System.out.println(obj.get(0).get(1));
    	System.out.println(obj.get(0).get(2));
    	System.out.println(obj.get(0).get(3));
    	System.out.println(obj.get(0).get(4));
    }
    
    @When("^User logs in to application with username (.+) and password (.+)$")
    public void user_logs_into_application_with_username_and_password(String username, String password) throws Throwable {
    	System.out.println(username);
    	System.out.println(password);
    }

    @Then("^Homepage is populated$")
    public void homepage_is_populated() throws Throwable {
        //home page validation
    	System.out.println("Populated home page");
    	System.out.println("Validated home page");
    }
    
    @And("^cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println(arg1);
    }

}