package cucumberStepDefinations;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {
	
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

    @Then("^Service Now Home Page is displayed$")
    public void service_now_home_page_is_displayed() throws Throwable {
		String title=driver.findElement(By.xpath("//h2[@ng-bind='options.title']")).getText();
		System.out.println(title);
    }

    @And("^Logo is displayed$")
    public void logo_is_displayed() throws Throwable {
		
		driver.findElement(By.xpath("//img[@title='ServiceNow']")).isDisplayed();
    }

}
