package pnew_functionalities;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import POM.find_suite;
import Utilitty.suite_base;

public class findsuite_testclass extends suite_base{
static WebDriver driver;

 static find_suite suite;
 
 
	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandeep.mandhala\\Downloads\\All Jar files selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.findmysuite.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public static void excuteTest1() throws Exception {
		
		suite = new find_suite(driver);
		suite.locationSearch("CA-1, Morro Bay, CA, USA");
		Thread.sleep(4000);
		driver.findElement(By.name("CheckInRange")).click();	
		
		driver.findElement(By.xpath("//input[@name='daterangepicker_start']")).sendKeys("04/23/2019");
		
		driver.findElement(By.xpath("//input[@name='daterangepicker_end']")).sendKeys("05/31/2019");
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		
		
	}
  

@Test(enabled=false)
public static void excuteTest() throws Exception {

	suite = new find_suite(driver);
//	driver.manage().window().maximize();
	suite.locationSearch("CA-1, Morro Bay, CA, USA");
	Thread.sleep(4000);
	

driver.findElement(By.id("CheckInRange")).click();

WebElement month= driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/table/thead/tr[1]/th[2]/select[1]"));
Select sele=new Select(month);
sele.selectByVisibleText("Aug");

			
List<WebElement> allDates=driver.findElements(By.xpath("/html/body/div[6]/div[1]/div[2]/table/tbody/tr/td"));

//driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/table/tbody/tr[3]/td[5]")).click();


for(WebElement ele:allDates)
{
	
	String date=ele.getText();
	System.out.println("all dates "+date);

	
	
	if(date.equalsIgnoreCase("10"))
	{
		Thread.sleep(4000);
		ele.click();
		break;
	}
}

WebElement get= driver.findElement(By.xpath("//*[@id='root']/div/div/div/div[3]/div/form/div[2]/input"));

String take=get.getAttribute("value");

System.out.println("date   "+take);





driver.findElement(By.id("CheckOutRange")).click();
Thread.sleep(3000);	


/*((JavascriptExecutor) driver).executeScript("arguments[0].click()", java);
System.out.println("clicked");*/

List<WebElement> scrool = driver.findElements(By.xpath("//div[@class=\"calendar-table\"]/table/thead/tr/th/i"));

for (WebElement display:scrool) {
	if (display.isDisplayed()) {
		display.click();
		break;
	}
}


System.out.println("clicked");

Thread.sleep(4000);

//List<WebElement> checkout = driver.findElements(By.xpath("//div[@class='calendar left single'][@style='display: block;']//div[@class='calendar-table']/table/tbody/tr/td"));//"/html/body/div[6]/div[1]/div[2]/table/tbody/tr"));
List<WebElement> checkout = driver.findElements(By.xpath("//div[@class='calendar-table']/table/tbody/tr/td"));

for (WebElement check:checkout) {
	if(check.isDisplayed())
	{
		
		
		String date1=check.getText();
		System.out.println("all checkout dates "+date1);
		
		if (date1.equalsIgnoreCase("25")) {
			
			check.click();
			break;
			
		}
	}
	
}
	//driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/table/tbody/tr[4]/td[5]")).click();

WebElement getcheck=driver.findElement(By.xpath("//*[@id='root']/div/div/div/div[3]/div/form/div[3]/input"));
String out=	getcheck.getAttribute("value");
System.out.println("check out date  "+out);


Thread.sleep(4000);
WebElement dimen= driver.findElement(By.xpath("//button[text()='Search' and @type='button']"));



dimen.click();
Thread.sleep(3000);

}}









