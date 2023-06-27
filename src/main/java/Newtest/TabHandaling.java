package Newtest;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class TabHandaling extends BaseDriver{
	
	String url1 = "https://demoqa.com/";
	String url2 = "https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html";
	
	@Test
	
	public void tab() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get(url1);
		String originalTab = driver.getWindowHandle();
		Thread.sleep(3000);
		
		//open a new tab/Window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get(url2);
		String secondTab = driver.getWindowHandle();
		Thread.sleep(3000);
		
		//where wants to stay
		driver.switchTo().window(originalTab);
		Thread.sleep(3000);
		
		
		driver.switchTo().window(secondTab);
		Thread.sleep(3000);
	}

}
