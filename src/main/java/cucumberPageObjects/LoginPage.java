package cucumberPageObjects;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	     PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement txtUserName;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement txtPassword;
	@FindBy(xpath = "//input[@id='remember_me']")
	private WebElement chkRememberMe;
	@FindBy(css = "button[type='submit']")
	private WebElement btnLogin;
	@FindBy(xpath = "//div[@ng-if='c.message']")
	private WebElement loginErrorMessage;
	
	
	/**
	 * method to load url
	 * 
	 * @param url
	 * @throws IOException
	 * @throws Exception
	 */
	public void getUrl(String url) throws IOException, Exception {
	   	Properties prop= new Properties();
    	FileInputStream fis= new FileInputStream("C:\\Users\\kpremkumar\\Documents\\TestAutomation\\src\\test\\java\\cucumberBase\\globalCucumber.properties");
    	prop.load(fis);
		driver.get(prop.getProperty(url));
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	
	/**
	 * Login based on the role.
	 * 
	 * @param role
	 *            User's username and password.
	 * @return None
	 * @throws Exception 
	 */
	public void login(String userName, String password) throws Exception {
		txtUserName.click();
		txtUserName.sendKeys(userName);
		txtPassword.click();
		txtPassword.sendKeys(password);
		chkRememberMe.click();
		btnLogin.click();
		Thread.sleep(3000);

	}
	
	/**
	 * Method to check login failure
	 * 
	 */
	public void checkLoginFailure( ) {
		
		Assert.assertTrue(loginErrorMessage.isDisplayed(),"Login Failure Message is Displayed");
		
	}
}
