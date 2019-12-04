package pipelineTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.URL;


public class snowLoginTest {

	@Test(invocationCount = 1, threadPoolSize = 1000)
	public void smoke() throws Exception {

		System.out.println("Performing Smoke Tests	");
/*
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		URL u = new URL("http://10.62.234.105:30001/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(u, capabilities);
*/
//      /*
		String driverpath = System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
//		 */


		driver.get("https://myit.allegistest.com/sp");
		//driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='username']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("@NA End User");
		
		driver.findElement(By.xpath("//input[@id='password']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SNOW1234");
		
		driver.findElement(By.xpath("//input[@name='c.remember_me']")).click();
	
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		if(driver.getTitle().contentEquals("Service Portal - Service Portal")) {
			System.out.println("Page loaded and title validated");
		}
		else {
			Assert.assertTrue(false);
		}
		driver.quit();
		}



}