package pipelineTests;

import static org.testng.Assert.assertTrue;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;


public class automationPractice2 {


	WebDriver driver = null;

	@Test(invocationCount =100, threadPoolSize = 100)
	public void testCase1() throws Exception {
		///*
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		//URL u = new URL("http://10.62.234.22:4444/wd/hub");
		URL u = new URL("http://10.68.36.99:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(u,capabilities);
		//*/
		/*
		System.out.println("Performing Smoke Tests	");
		String driverpath = System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		*/
		WebDriverWait wait=new WebDriverWait(driver, 20);

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		driver.get("http://automationpractice.com/index.php");
		
		WebElement logo= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//img[@alt='My Store']")));
		if(logo.isDisplayed()) {
			System.out.println("logo is displayed and page loaded");
		}
		
		WebElement contactus= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//a[@title='Contact us']")));
		contactus.click();
		
		WebElement navigation= driver.findElement(By.xpath("//span[@class='navigation_page']"));
		
		Assert.assertEquals(navigation.getText(),"Contact", "Navigation to contact us page validation" +navigation.getText());
		
		WebElement signin= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//a[@title='Log in to your customer account']")));
		signin.click();

		WebElement navigation2= driver.findElement(By.xpath("//span[@class='navigation_page']"));
		
		Assert.assertEquals(navigation2.getText(),"Authentication", "Navigation to Sign in page validation" +navigation2.getText());
		
		 driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		 
			WebElement alert= driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
		
			if(alert.isDisplayed()) {
				System.out.println("Alert message displayed on sign in");
			}
			else {
				Assert.assertTrue(false);
			}
			

		driver.quit();
		
	}

}