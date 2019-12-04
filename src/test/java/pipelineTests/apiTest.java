package pipelineTests;

import static org.testng.Assert.assertTrue;


import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class apiTest {

	WebDriver driver = null;

	@Test(invocationCount = 1000
			, threadPoolSize = 1000)
	public void testCase1() throws Exception {
	//	/*
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		URL u = new URL("http://10.68.36.99:4444/wd/hub");
		//URL u = new URL("http://10.62.234.105:30001/wd/hub");
		//URL u = new URL("http://10.62.234.101:30001/wd/hub");
		// URL u = new URL("http://10.62.234.140:4444/wd/hub");
		// URL u = new URL("http://10.62.234.118:4444/wd/hub");
		// URL u = new URL("http://10.62.234.20:4444/wd/hub");
		// URL u = new URL("http://10.62.234.23:4444/wd/hub");
		// URL u = new URL("http://10.62.234.21:4444/wd/hub");
		 //URL u = new URL("http://10.68.36.99:4444/wd/hub");
		// URL u = new
		// URL("http://dockerselenium.eastus2.cloudapp.azure.com:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(u, capabilities);
	//	*/
	
		/*
		System.out.println("Performing Smoke Tests	");
		String driverpath = System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		*/
		WebDriverWait wait = new WebDriverWait(driver, 20);

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		driver.get("http://dummy.restapiexample.com/api/v1/employees");
		//driver.get("http://162.241.24.128/api/v1/employees");
		
		
		//System.out.println(driver.getPageSource().contains("id"));;
		//System.out.println(driver.getPageSource());
		


		//driver.manage().window().maximize();

		Thread.sleep(2000);
		
		WebElement body= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//body")));
		if(body.isDisplayed()) {
			System.out.println("Page loaded");
		}
		else {
			Assert.assertTrue(false);
		}
		

		driver.quit();

	}

}