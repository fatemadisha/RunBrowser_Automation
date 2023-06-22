package Newtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

public class Copy_Paste extends BaseDriver{
	
String url = "https://demoqa.com/automation-practice-form" ;	
	@Test
	
	public void scroll() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		
		Thread.sleep(5000);
		
		Actions action = new Actions(driver);
		
		WebElement name = driver.findElement(By.xpath("//input[@id='firstName']"));
		name.sendKeys("Disha");
		Thread.sleep(3000);
		
		//Select
		action.keyDown(Keys.CONTROL);
		action.sendKeys("A");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		Thread.sleep(3000);
		
		//Copy
				action.keyDown(Keys.CONTROL);
				action.sendKeys("C");
				action.keyUp(Keys.CONTROL);
				action.build().perform();
				Thread.sleep(3000);
				
				
		//Tab
		name.sendKeys(Keys.TAB);
		action.build().perform();
		Thread.sleep(3000);
		
		
		
		//Paste
		action.keyDown(Keys.CONTROL);
		action.sendKeys("V");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		Thread.sleep(3000);

}
}
