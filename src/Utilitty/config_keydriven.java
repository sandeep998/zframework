package Utilitty;

import java.io.File;
import java.io.FileInputStream;


import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class config_keydriven {
	WebDriver driver;
	File file;
	FileInputStream input;
	Properties prm;
	
	public  config_keydriven() throws Exception  {
	file = new File("C:\\Users\\sandeep.mandhala\\eclipse-workspace\\Z-Framework_practice\\src\\Utilitty\\properties");
	
	input = new FileInputStream(file);
	
	prm = new Properties();
	
	prm.load(input);
	}	
	
	public String getUrl() {
		
		String url = prm.getProperty("URL");
		return url;
	
		
	}
	public String getUser() {
		
		String username = prm.getProperty("username");
		return username;
		
		
	}
public String getPassword() {
	
	String password = prm.getProperty("password");
	return password;
}
	
	
	public String userLocator() {
		
		String userLoca= prm.getProperty("usernamelocator");
		return userLoca;
		
	}
	
public String passLocator() {
	
	String passLoc= prm.getProperty("passlocator");
	return passLoc;
	
	
}
}












