package dockerTests;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class DockerTestChrome2 {

	@Test
	public void dockerTest() throws Exception {
	
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		URL u = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(u,capabilities);
		driver.get("https://myit.allegistest.com/sp");
		
		System.out.println(driver.getTitle());
		}



}