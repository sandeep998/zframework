package pnew_functionalities;





import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utilitty.config_keydriven;

public class practice_1 {
	
	static WebDriver driver;
	
	config_keydriven congg;
	
	@BeforeClass
	
	public void launchBrowser() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandeep.mandhala\\Downloads\\All Jar files selenium\\chromedriver.exe");
		driver =new ChromeDriver();
		
		congg =new config_keydriven();
		driver.manage().window().maximize();
		
		driver.get(congg.getUrl());
		
	}
	
	
	@Test(dataProvider = "Authentication")
	public void testCase1(String user1,String pass1) {
		
		WebElement user= driver.findElement(By.xpath(congg.userLocator()));
		
		//user.sendKeys(congg.getUser());
		user.sendKeys(user1);
		
		String struser= user.getAttribute("value");
		
		System.out.println("Entered username value  "+struser);
		
		WebElement pass= driver.findElement(By.xpath(congg.passLocator()));
	//	pass.sendKeys(congg.getPassword());
		
		pass.sendKeys(pass1);
		
		String strpass= pass.getAttribute("value");
		
		System.out.println("Entered passowrd value  "+strpass);
		
		pass.sendKeys(congg.getPassword());
		
		WebElement subm= driver.findElement(By.xpath("//button[text()='Submit']"));
		
		subm.click();
		
		
	}
	  @DataProvider(name = "Authentication")
	  
	  public static Object[][] credentials() {
	 
	        return new Object[][] { { "testuser_1", "Test@123" }, { "testuser_1", "Test@123" }};
	 
	  }
	  
		@AfterTest
		public static void tearDown() {
		//reports.flush();	
		//	reports.endTest(logger);
		driver.close();
			
		}
}
