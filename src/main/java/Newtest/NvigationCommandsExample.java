package Newtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NvigationCommandsExample extends BaseDriver {
	
	String url = "https://www.daraz.com.bd/";
	
	@Test
	public void nevigateTest() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement signUp = driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]"));
		signUp.click();
		Thread.sleep(3000);
		
		//navigate backward
		driver.navigate().back();
		Thread.sleep(3000);
		
		//navigate forward
		driver.navigate().forward();
		Thread.sleep(3000);
		
		//page refresh
		driver.navigate().refresh();
		Thread.sleep(3000);
		
	}

}
