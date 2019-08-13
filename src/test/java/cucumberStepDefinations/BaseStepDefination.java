package cucumberStepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BaseStepDefination {


	public WebDriver driver;
	@Before()
	public WebDriver startBrowser() {
		String driverpath = System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		if(driver==null)
		driver = new ChromeDriver();
		return driver;
	}
	

    @Given("^Validate the browser$")
    public void validate_the_browser() throws Throwable {
    	System.out.println("validating the browser");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
    	System.out.println("Broswer is opened");
    }

    @Then("^Check if browser is opened$")
    public void check_if_browser_is_opened() throws Throwable {

    }

    @And("^close browser$")
    public void close_browser() throws Throwable {
    	driver.close();
	
    }
    
    @After("@SmokeTest,@RegressionTest")
    public void deleteCookies() {
    	driver.quit();
		driver=null;
    }

}
