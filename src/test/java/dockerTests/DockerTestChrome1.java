package dockerTests;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dockerUtils.startDocker;
import dockerUtils.stopDocker;


public class DockerTestChrome1 {

	
	
	@BeforeTest
	public void startDockerService() throws IOException, InterruptedException {
		
		startDocker s= new startDocker();
		s.startFile();
		
	}
	
	@AfterTest
	public void stopDockerService() throws IOException, InterruptedException {
		
		stopDocker d= new stopDocker();
		d.stopFile();
		
	}
	
	@Test
	public void dockerTest() throws Exception {
	
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		URL u = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(u,capabilities);
		driver.get("https://allegisgrouptest.service-now.com/sp");		
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='username']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("NA User");
		
		driver.findElement(By.xpath("//input[@id='password']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Snow2019");
		
		driver.findElement(By.xpath("//input[@name='c.remember_me']")).click();
	
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(3000);
		}



}