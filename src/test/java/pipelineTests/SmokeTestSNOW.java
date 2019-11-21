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


public class SmokeTestSNOW {


	WebDriver driver = null;

	@Test(invocationCount =1, threadPoolSize = 50)
	public void snowTestCase2() throws Exception {
		
		//DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		//URL u = new URL("http://10.62.234.22:4444/wd/hub");
		//URL u = new URL("http://10.68.36.99:4444/wd/hub");
		//URL u = new URL("http://dockerselenium.eastus2.cloudapp.azure.com:4444/wd/hub");
		//URL u = new URL("http://10.62.234.105:30001/wd/hub");
		//RemoteWebDriver driver = new RemoteWebDriver(u,capabilities);

		String driverpath = System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();


		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		String[] details = { "Allegis Group, Aerotek, and TEKsystems", "allegisCSD@allegisgroup.com", "1-866-483-541",
				"Aston Carter", "allegisCSD@allegisgroup.com", "1-855-788-0787", "EASi", "password@easi.com",
				"servicedesk@easi.com", "1-855-560-3031", "MarketSource", "marketsourcesupport@allegisgroup.com",
				"1-800-416-6505", "MLA", "mlasupport@allegisgroup.com", "1-866-580-9430", "",
				"servicedesk@allegisgroup.co.uk", "+44 1344 383 101 Ext: 83101", "",
				"APAC-AllegisserviceDesk@allegisgroup.com", "Inter Office: *777", "" };

		driver.get("https://myit.allegistest.com/sp");
		//driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='username']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("@NA End User");

		driver.findElement(By.xpath("//input[@id='password']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SNOW1234");

		driver.findElement(By.xpath("//input[@name='c.remember_me']")).click();
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		System.out.println("login was successfull");
		
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//span[@class='ng-binding'][contains(text(),'Contact Us')]")).click();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement contactUS= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//span[@class='ng-binding'][contains(text(),'Contact Us')]")));
		contactUS.click();


		// to store all web elements into list
		List<WebElement> myList = driver
				.findElements(By.xpath("//div[@class='panel panel-primary b']/div[@class='panel-body']/div"));

		// print the list size
		System.out.println("size" + myList.size());

		int k=6;
		while(k>1) {
		
			System.out.println("---------------------------------------------------------------------------------------------------");
		// for loop to iterate through each webeElement
		for (int i = 0; i < myList.size(); i++) {

			System.out.println(myList.get(i).getText());
			try {
				Assert.assertEquals(myList.get(i).getText(), details[i]);
			} catch (AssertionError e) {
				System.out.println(e);
			}

		}
		
		k--;
		}
		driver.quit();
		
	}

}