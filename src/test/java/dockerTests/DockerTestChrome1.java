package dockerTests;

import java.io.IOException;
import java.net.URL;
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
		driver.get("https://myit.allegistest.com/sp");		
		System.out.println(driver.getTitle());
		}



}