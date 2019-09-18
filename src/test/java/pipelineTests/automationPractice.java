package pipelineTests;

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


public class automationPractice {


	WebDriver driver = null;

	@Test(invocationCount =100, threadPoolSize = 100)
	public void testCase1() throws Exception {
		///*
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		URL u = new URL("http://10.62.234.22:4444/wd/hub");
		//URL u = new URL("http://10.68.36.99:4444/wd/hub");
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

		driver.get("http://www.practiceselenium.com");
		Thread.sleep(5000);
		WebElement lettalkTea= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//a[@data-title=\"Let's Talk Tea\"]")));
		lettalkTea.click();
		WebElement name= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//input[@name='name']")));
		name.click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Test");
		
		driver.findElement(By.xpath("//input[@name='email']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Test@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='subject']")).click();
		driver.findElement(By.xpath("//input[@name='subject']")).sendKeys("TestSubject");
			
		driver.findElement(By.xpath("//textarea[@name='message']")).click();
		driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("Test Message Entered");	
		driver.findElement(By.xpath("//a[@data-title='Check Out']")).click();
		
		//driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		WebElement placeOrder= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//button[contains(text(),'Place Order')]")));
		placeOrder.click();

		if(driver.findElement(By.xpath("//h1[contains(text(),'Menu')]")).isDisplayed()) {
			System.out.println("Test Completed");
		}
		else {
			Assert.assertTrue(false);
		}
		driver.quit();
		
	}

}