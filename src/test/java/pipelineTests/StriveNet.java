package pipelineTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.concurrent.TimeUnit;


public class StriveNet {


	WebDriver driver = null;

	@Test(invocationCount =1, threadPoolSize = 500)
	public void snowTestCase2() throws Exception {
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		//URL u = new URL("http://10.62.234.22:4444/wd/hub");
		//URL u = new URL("http://10.68.36.99:4444/wd/hub");
		//URL u = new URL("http://dockerselenium.eastus2.cloudapp.azure.com:4444/wd/hub");
		URL u = new URL("http://10.62.234.105:30001/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(u,capabilities);
	/*
		String driverpath = System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
	*/


		WebDriverWait wait=new WebDriverWait(driver, 120);
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);



		driver.get("https://allegiscloud.sharepoint.com/sites/strivenet/Pages/Home.aspx");
		//driver.manage().window().maximize();
		Thread.sleep(3000);
		Assert.assertEquals("Sign in to your account",driver.getTitle());
		driver.findElement(By.xpath("//span[@class='menu-item-text'][contains(text(),'Code of Conduct')]")).click();
		System.out.println(driver.getTitle());



		
	}

}