package cucumberStepDefinations;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class HomePageStepDefination {
	
	public WebDriver driver;
	
    @And("^Service Now Home Page is validated$")
    public void service_now_home_page_is_validated() throws Throwable {
		String driverpath = System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'Request Something')]")).isDisplayed();
		driver.findElement(By.xpath("//*[contains(text(),'Get Help')]")).isDisplayed();
		driver.findElement(By.xpath("//*[contains(text(),'Knowledge Base')]")).isDisplayed();
		driver.findElement(By.xpath("//*[contains(text(),'Password Reset')]")).isDisplayed();
		driver.findElement(By.xpath("//input[@name='q']")).isDisplayed();
		driver.findElement(By.xpath("button[name='search']")).isDisplayed();
    }
}
