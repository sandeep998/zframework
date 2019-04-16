package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class find_suite {

	
	static WebDriver driver;
	
	//WebDriverWait wait;
	
	
	public find_suite(WebDriver driver) {
	
		find_suite.driver=driver;
		PageFactory.initElements(driver, this);
		//wait=new WebDriverWait(driver, 30);
			
		}
	
	@FindBy(xpath="//input[@id='travel-booking']")
	@CacheLookup
	WebElement location;
	
	public  void locationSearch(String user1) {
		//wait.until(ExpectedConditions.presenceOfElementLocated((By) Tuser));
		//visibilityOfElement(driver,(By) Tuser);
		location.sendKeys(user1);
	}
}
