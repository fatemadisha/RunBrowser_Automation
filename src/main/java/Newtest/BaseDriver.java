package Newtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {

	WebDriver driver = null;

	@BeforeSuite
	public void start() {
		String browser = System.getProperty("browser", "chrome");

		if (browser.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			//ChromeOptions options = new ChromeOptions();
			//options.setAcceptInsecureCerts(true);
			//options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver();

		}

		else if (browser.contains("firefox")) {
			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();
		} else {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}
	}

	@AfterSuite
// this method will closed by this annotation
	public void close() {
		driver.close();
	}

}
