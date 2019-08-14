package cucumberStepDefinations;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import cucumberPageObjects.HomePage;

@RunWith(Cucumber.class)
public class HomePageStepDefination {
	
	WebDriver driver;
	HomePage hp;
	
	public HomePageStepDefination(){
		driver=BaseStepDefination.startDriver();
	}
	
	
    @And("^Service Now Home Page is validated$")
    public void service_now_home_page_is_validated() throws Throwable {
    	
    	hp= new HomePage(driver);
    	hp.checkTitle();
    	hp.checkHompage();
    }
}
