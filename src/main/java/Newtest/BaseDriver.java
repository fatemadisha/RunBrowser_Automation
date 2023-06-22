package Newtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {
	
	WebDriver driver = null;
	//ei variabler through connect korbo
	
	@BeforeSuite
	// this annotation will be called first.
	public void start() {
		String browser = System.getProperty("browser", "chrome");
		
		if(browser.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			
		}
		
		else if(browser.contains("firefox")){
			WebDriverManager.firefoxdriver().setup();
			
			driver = new FirefoxDriver();
	}
		else {

	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();

	}
	}

@AfterSuite
// this method will closed by this annotation
 public void close() {
	 driver.close();
	 
	 //for closing a specific tab we use close() method.
	 //for closing the whole browser we use quit() method. 
 }
}


