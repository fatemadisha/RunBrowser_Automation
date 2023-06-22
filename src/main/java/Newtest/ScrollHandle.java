package Newtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class ScrollHandle extends BaseDriver{
	
	String url = "https://www.amazon.com/";
	
	@Test
	
	public void scroll() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		
		Thread.sleep(5000);
		
		//action way
		
		//Actions action = new Actions(driver);
		//action.sendKeys(Keys.PAGE_DOWN).build().perform();
		//Thread.sleep(3000);
		
		//javascript way
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//specific location
		
		//WebElement location = driver.findElement(By.xpath("//span[contains(text(),'Popular Gifts in Baby')]"));
		//js.executeScript("arguments[0].scrollIntoView(true);", location);
		
		//scroll to the bottom
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		Thread.sleep(5000);
		//scroll to the top
		js.executeScript("window.scrollTo(0, 0)");
		
		
		Thread.sleep(5000);
		
		
	}

}

