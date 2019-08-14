package cucumberStepDefinations;

import java.util.List;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import cucumberPageObjects.HomePage;
import cucumberPageObjects.LoginPage;

@RunWith(Cucumber.class)
public class LoginPageStepDefination {
	
	WebDriver driver;
	LoginPage lp;
	HomePage hp;
	
	public LoginPageStepDefination(){
		driver=BaseStepDefination.startDriver();
	}
	
	
    @Given("^User is on Service Now login page$")
    public void user_is_on_service_now_login_page() throws Throwable {
      	lp= new LoginPage(driver);
      	lp.getUrl("snow");
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
    	lp= new LoginPage(driver);
		lp.login("NA End User", "SNOW1234");
    }
    

    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_and(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	lp= new LoginPage(driver);
		lp.login(arg1, arg2);
    }
    
    @When("^User login into application with following details$")
    public void user_login_into_application_with_following_details(DataTable data) throws Throwable {
    	List<List<String>> obj= data.raw(); 
    	lp= new LoginPage(driver);
		lp.login(obj.get(0).get(0), obj.get(0).get(1));
    }
    
    @When("^User logging to application with (.+) and (.+)$")
    public void user_logging_to_application_with_and(String username, String password) throws Throwable {
      	lp= new LoginPage(driver);
    	lp.login(username, password);
    }
    
    
    @Then("^Service Now Home Page is displayed$")
    public void service_now_home_page_is_displayed() throws Throwable {
    	hp= new HomePage(driver);
    	hp.checkTitle();
    }
    
  
    @Then("^Service Now Home Page displayed is \"([^\"]*)\"$")
    public void service_now_home_page_displayed_is_something(String condition) throws Throwable {
    	hp= new HomePage(driver);
    	if(condition.contentEquals("true")) {
    		hp.checkTitle();
    	}
    	else if(condition.contentEquals("false")) {	
    		lp.checkLoginFailure();
    	}
    }
     
    @And("^Logo is displayed$")
    public void logo_is_displayed() throws Throwable {
    	hp= new HomePage(driver);
    	hp.checkLogo();

    }
    
    @Given("^Validate the browser$")
    public void validate_the_browser() throws Throwable {
    	System.out.println("validating the browser");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
    	System.out.println("Broswer is opened");
    }

    @And("^close browser$")
    public void close_browser() throws Throwable {
    	driver.close();
    }
    
}
