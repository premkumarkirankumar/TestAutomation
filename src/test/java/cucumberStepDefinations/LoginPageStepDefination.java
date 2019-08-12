package cucumberStepDefinations;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class LoginPageStepDefination {
	
	public WebDriver driver;
	
    @Given("^User is on Service Now login page$")
    public void user_is_on_service_now_login_page() throws Throwable {
		String driverpath = System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.get("https://myit.allegistest.com/sp");
		driver.manage().window().maximize();
		Thread.sleep(3000);
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
		
		driver.findElement(By.xpath("//input[@id='username']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("NA End User");
		driver.findElement(By.xpath("//input[@id='password']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SNOW1234");	
		driver.findElement(By.xpath("//input[@name='c.remember_me']")).click();
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(3000);
    }
    

    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_and(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='username']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(arg1);
		driver.findElement(By.xpath("//input[@id='password']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(arg2);	
		driver.findElement(By.xpath("//input[@name='c.remember_me']")).click();
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(3000);
    }
    
    @When("^User login into application with following details$")
    public void user_login_into_application_with_following_details(DataTable data) throws Throwable {
    	List<List<String>> obj= data.raw();   	
		driver.findElement(By.xpath("//input[@id='username']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(obj.get(0).get(0));
		driver.findElement(By.xpath("//input[@id='password']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(obj.get(0).get(1));	
		driver.findElement(By.xpath("//input[@name='c.remember_me']")).click();
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(3000);

    }
    
    @When("^User logging to application with (.+) and (.+)$")
    public void user_logging_to_application_with_and(String username, String password) throws Throwable {
		driver.findElement(By.xpath("//input[@id='username']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);	
		driver.findElement(By.xpath("//input[@name='c.remember_me']")).click();
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(3000);
    }
    
    
    @Then("^Service Now Home Page is displayed$")
    public void service_now_home_page_is_displayed() throws Throwable {
		String title=driver.findElement(By.xpath("//h2[@ng-bind='options.title']")).getText();
		System.out.println(title);
    }
    
  
    @Then("^Service Now Home Page displayed is \"([^\"]*)\"$")
    public void service_now_home_page_displayed_is_something(String condition) throws Throwable {
    	if(condition.contentEquals("true")) {
    		String title=driver.findElement(By.xpath("//h2[@ng-bind='options.title']")).getText();
    		System.out.println(title);
    	}
    	else if(condition.contentEquals("false")) {
        	driver.findElement(By.xpath("//div[@ng-if='c.message']")).isDisplayed();
    	}
    }
    
   
    @And("^Logo is displayed$")
    public void logo_is_displayed() throws Throwable {
		
		driver.findElement(By.xpath("//img[@title='ServiceNow']")).isDisplayed();
    }
    
    @And("^close browser$")
    public void close_browser() throws Throwable {
    	driver.close();
    }

}
