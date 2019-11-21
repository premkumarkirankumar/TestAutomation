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


public class bbcTest {


	WebDriver driver = null;

	@Test(invocationCount =500, threadPoolSize = 1000)
	public void testCase1() throws Exception {
		///*
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		URL u = new URL("http://10.62.234.100:30001/wd/hub");
		//URL u = new URL("http://10.62.234.22:4444/wd/hub");
		//URL u = new URL("http://10.62.234.20:4444/wd/hub");
		//URL u = new URL("http://10.68.36.99:4444/wd/hub");
		//URL u = new URL("http://dockerselenium.eastus2.cloudapp.azure.com:4444/wd/hub");

		RemoteWebDriver driver = new RemoteWebDriver(u,capabilities);
		//*/
		/*
		System.out.println("Performing Smoke Tests	");
		String driverpath = System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		*/
		WebDriverWait wait=new WebDriverWait(driver, 60);

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		driver.get("https://www.bbc.com");
		
		
		WebElement logo= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//a[contains(text(),'Homepage')]")));
		if(logo.isDisplayed()) {
			System.out.println("logo is displayed and page loaded");
		}
		
		WebElement sign= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//a[@id='idcta-link']")));
		
		sign.click();
		 
		 
			WebElement signin= driver.findElement(By.xpath("//h1/span[contains(text(),'Sign in')]"));
			
			if(signin.isDisplayed()) {
				System.out.println("sign in page displayed");
			}

			 driver.findElement(By.xpath("//span[contains(text(),'Register now')]")).click();
			 
				WebElement registerwithBBC= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//span[contains(text(),'Register with the BBC')]")));
			 
			 
				if(registerwithBBC.isDisplayed()) {
					System.out.println("Register pagedisplayed");
				}


		driver.quit();
		
	}

}