package pipelineTests;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.concurrent.TimeUnit;


public class newsSiteTest {

	@Test(invocationCount = 100
			, threadPoolSize = 1000)
	public void smoke() throws Exception {

		System.out.println("Performing Smoke Tests On Times of India Website	");

		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
       // URL u = new URL("http://10.62.234.101:30001/wd/hub");
        URL u = new URL("http://10.62.234.105:30001/wd/hub");

		RemoteWebDriver driver = new RemoteWebDriver(u, capabilities);

		/*
		String driverpath = System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		 */

		WebDriverWait wait=new WebDriverWait(driver, 60);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		driver.get("https://www.usatoday.com/news/");
		//driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		if(driver.getTitle().contains("The Latest US")) {
			System.out.println("Page loaded and title validated");
		}
		else {
			Assert.assertTrue(false);
		}
		driver.quit();
		}



}