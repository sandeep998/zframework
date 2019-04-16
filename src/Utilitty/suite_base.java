package Utilitty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class suite_base {
	
	public static WebDriver driver;


	public static  WebElement visibilityOfElement(WebDriver driver,By locator) {
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	

}
