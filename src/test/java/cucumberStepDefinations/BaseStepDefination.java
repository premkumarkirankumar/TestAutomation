package cucumberStepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BaseStepDefination {


	public static WebDriver driver;
	
	@Before()
	public static WebDriver startDriver() {
		String driverpath = System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		if(driver==null)
		driver = new ChromeDriver();
		return driver;
	}
	
    
    @After("@SmokeTest,@RegressionTest")
    public void deleteCookies() {
    	driver.quit();
		driver=null;
    }

}
