package cucumberStepDefinations;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class HomePageStepDefination {
	
	WebDriver driver;
	
	public HomePageStepDefination(BaseStepDefination bs){
		driver=bs.startBrowser();
	}
	
	
    @And("^Service Now Home Page is validated$")
    public void service_now_home_page_is_validated() throws Throwable {
		Thread.sleep(3000);
		String title=driver.findElement(By.xpath("//h2[@ng-bind='options.title']")).getText();
		System.out.println(title);
		driver.findElement(By.xpath("//img[@title='ServiceNow']")).isDisplayed();
		driver.findElement(By.xpath("//*[contains(text(),'Request Something')]")).isDisplayed();
		driver.findElement(By.xpath("//*[contains(text(),'Get Help')]")).isDisplayed();
		driver.findElement(By.xpath("//*[contains(text(),'Knowledge Base')]")).isDisplayed();
		driver.findElement(By.xpath("//*[contains(text(),'Password Reset')]")).isDisplayed();
		driver.findElement(By.xpath("//input[@name='q']")).isDisplayed();
		driver.findElement(By.xpath("//button[@name='search']")).isDisplayed();
    }
}
