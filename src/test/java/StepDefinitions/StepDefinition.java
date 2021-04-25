package StepDefinitions;

import org.junit.runner.RunWith;

//import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
	public class StepDefinition {

	   @Given("^User is on Netbanking landing page$")
	    public void user_is_on_netbanking_landing_page() throws Throwable {
	        //throw new PendingException();
	    	System.out.println("Landing page");
	    }

	   @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
	       
		   System.out.println(strArg1);
		   System.out.println(strArg2);
		   //throw new PendingException();
	    }
	   
	    @Then("^Home page is populated$")
	    public void home_page_is_populated() throws Throwable {
	       // throw new PendingException();
	    	System.out.println("Home page");
	    }

	    @And("^Cards displayed are \"([^\"]*)\"$")
	    public void cards_displayed_are_something(String strArg1) throws Throwable {
	    	 System.out.println(strArg1);
	        //throw new PendingException();
	    }

	}

