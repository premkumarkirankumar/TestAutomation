package pipelineTests;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.concurrent.TimeUnit;


public class populusTest {

	@Test(invocationCount =200
			, threadPoolSize =500)
	public void smoke() throws Exception {

		System.out.println("Performing Smoke Tests On Times of Populus site	");


		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
       // URL u = new URL("http://10.62.234.101:30001/wd/hub");
       // URL u = new URL("http://10.62.234.105:30001/wd/hub");
      //  URL u = new URL("http://10.62.234.105:30755/wd/hub");
       // URL u = new URL("http://lb.zalenium-ns.10.62.234.105.xip.io//wd/hub");
      //  URL u = new URL("http://cosld-sysapp18.allegistest.com/wd/hub"); 
       
       //URL u = new URL("http://10.62.234.41/wd/hub"); 
      // URL u = new URL("http://localhost:4444/wd/hub"); 
		//URL u = new URL("http://10.68.36.99:4444/wd/hub");
		URL u = new URL("http://10.62.234.41:4444/wd/hub"); 
        
  

		RemoteWebDriver driver = new RemoteWebDriver(u, capabilities);

		/*
		String driverpath = System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		 */

		WebDriverWait wait=new WebDriverWait(driver, 120);
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);

		//driver.get("https://www.populusgroup.com.stage.allegisgroup.com/en");
		driver.get("https://www.populusgroup.com/");
		//driver.manage().window().maximize();
		//Thread.sleep(5000);
		System.out.println(driver.getTitle());
		if(driver.getTitle().contains("People")) {
			System.out.println("Page loaded and title validated");
		}
		else {
			Assert.assertTrue(false);
		}

		driver.findElement(By.xpath("//a[@href='/en/workforce-solutions'][contains(text(),'Employers')]")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		if(driver.getTitle().contains("Workforce")) {
			System.out.println("Page loaded for employers and title validated");
		}
		else {
			Assert.assertTrue(false);
		}
		driver.quit();
		}



}