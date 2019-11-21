package pipelineTests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task_7 {

	public WebDriver driver;

	//@BeforeTest

	public void chromesetup() {
	String driverpath = System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverpath);

	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	}

	//@Test(priority = 1)

	public void login() throws InterruptedException {

	driver.get("https://allegisgrouptest.service-now.com/sp");
	System.out.println(driver.getTitle());
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("@NA User");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("training2019");
	driver.findElement(By.xpath("//input[@name='c.remember_me']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();

	Assert.assertEquals(driver.getTitle(), "Service Portal - Service Portal");
	
	
	driver.findElement(By.xpath("//h2[contains(text(),'Request Catalog')]")).click();
	
	Thread.sleep(3000);
	List<WebElement> items = driver.findElements(By.xpath("//div[@class='overflow-100']"));
	for (int i = 0; i < items.size(); i++) {
	String item = items.get(i).getText();
	System.out.println("Amount of links found: " + item);

	}
	/*
	Thread.sleep(3000);

	driver.findElement(By.xpath("//h2[@class='ng-binding'][contains(text(),'Request Catalog')]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//h2[@title='General Request']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//span[@id='select2-chosen-1']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//ul[@class='select2-results']/li[3]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//textarea[@id='sp_formfield_request_details']"))
	.sendKeys("This is a hardware request for selenium training");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block ng-binding ng-scope']")).click();
	Thread.sleep(3000);
*/
	}
	
	
	@Test
	public void test1() {
		forloop(10);
	}
	
	public void forloop(int num) {
		
		for(int i=1;i<num;i++ )

			System.out.println(i);
	}


}