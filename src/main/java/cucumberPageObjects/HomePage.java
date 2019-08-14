package cucumberPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class HomePage {
	
	public WebDriver driver;
	
	public  HomePage(WebDriver driver) {
		this.driver=driver;
	    PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h2[@ng-bind='options.title']")
	private WebElement pageTitle;
	@FindBy(xpath = "//img[@title='ServiceNow']")
	private WebElement pageLogo;
	@FindBy(xpath = "//*[contains(text(),'Request Something')]")
	private WebElement wbeRequestSomething;
	@FindBy(xpath = "//*[contains(text(),'Get Help')]")
	private WebElement wbeGetHelp;
	@FindBy(xpath = "//*[contains(text(),'Knowledge Base')]")
	private WebElement wbeKnowledgeBase;
	@FindBy(xpath = "//*[contains(text(),'Password Reset')]")
	private WebElement wbePasswordReset;
	@FindBy(xpath = "//input[@name='q']")
	private WebElement txtSearch;
	@FindBy(css = "button[name='search']")
	private WebElement btnSearch;
	
	
	/**
	 * method to check title
	 * @throws Exception 
	 */
	public void checkTitle() throws Exception {
		Thread.sleep(2000);
		String title=pageTitle.getText();
		System.out.println(title);
	}
	
	
	/**
	 * Method to check Logo
	 */
	public void checkLogo( ) {	
		Assert.assertTrue(pageLogo.isDisplayed(),"Page Logo is Displayed");
		
	}
	
	/**
	 * Method to verify Homepage
	 */
	public void checkHompage() {
		Assert.assertTrue(wbeRequestSomething.isDisplayed(), "Request Something widget exists");
		Assert.assertTrue(wbeGetHelp.isDisplayed(), "Get Help widget exists");
		Assert.assertTrue(wbeKnowledgeBase.isDisplayed(), "Knowledge Base widget exists");
		Assert.assertTrue(wbePasswordReset.isDisplayed(), "Password Reset widget exists");
		Assert.assertTrue(txtSearch.isDisplayed(), "Search area  exists");
		Assert.assertTrue(btnSearch.isDisplayed(), "Search Button exists");
			
	}



}
