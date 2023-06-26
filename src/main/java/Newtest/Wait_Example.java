package Newtest;

import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Example extends BaseDriver {
	String url = "https://www.selenium.dev/";	
	
	@Test
	public void testAssertion() throws InterruptedException{
		
		driver.manage().window().maximize();
		driver.get(url);{
			
			//Implicit wait(for loading the page)
			
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
             
			//Explicit wait (xpath load nite time lagle error diye dey) {for finding locator)
			
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
			WebElement blog = (WebElement)wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h2[contains(text(),'Posts in 2023')]")));
			blog.click();
			
			Thread.sleep(3000);
}
	}
}
