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
import org.testng.annotations.Test;


public class automationPractice4 {

	WebDriver driver = null;

	@Test(invocationCount = 200, threadPoolSize = 200)
	public void testCase1() throws Exception {
		/// *
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		// URL u = new URL("http://10.62.234.22:4444/wd/hub");
		 URL u = new URL("http://10.62.234.20:4444/wd/hub");
		 //URL u = new URL("http://10.68.36.99:4444/wd/hub");
		// URL u = new
		// URL("http://dockerselenium.eastus2.cloudapp.azure.com:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(u, capabilities);
		// */
		
		
		/*
		 * System.out.println("Performing Smoke Tests	"); String driverpath =
		 * System.getProperty("user.dir") +
		 * "\\src\\test\\resources\\drivers\\chromedriver.exe";
		 * System.setProperty("webdriver.chrome.driver", driverpath); WebDriver driver =
		 * new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		driver.get("https://www.mlaglobal.com/en");

		driver.manage().window().maximize();

		Thread.sleep(2000);
		
		WebElement gotit= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//button[@title='Got It!']")));
		gotit.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//header//a[text()='Locations']")).click();
		List<String> locationNames = new ArrayList<>();
		List<WebElement> AllTilesTitles = driver
				.findElements(By.xpath("//*[@class='acs-location-title acs-location-title-link']"));
		for (int i = 0; i < AllTilesTitles.size(); i++) {
			String location;
			location = AllTilesTitles.get(i).getText();
			locationNames.add(location);
		}

		assertTrue(locationNames.size() > 0);
		for (int i = 0; i < 8; i++) {
			String loca = locationNames.get(i);
			driver.findElement(By.xpath(
					"//div[@class='acs-location-title acs-location-title-link']/a[contains(text(),'" + loca + "')]"))
					.click();
			Thread.sleep(1000);
			String h1 = driver.findElement(By.xpath("//h1")).getText();
			assertTrue(h1.length() > 3);
			assertFalse(driver.getTitle().isEmpty());
			driver.findElement(By.xpath("//header//a[text()='Locations']")).click();

		}

		driver.quit();
 */
	}

}