package Newtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Locators_Example extends BaseDriver{
	
	
	@Test
	public void testLocation() throws InterruptedException {
		
		driver.manage().window().maximize();
		
		driver.get("https://www.shohoz.com/contact-us/en");

		Thread.sleep(5000);

		// By id
		WebElement bus = driver.findElement(By.id("purpose"));
		bus.click();

		Thread.sleep(5000);

		// By Name
		//WebElement bus_name = driver.findElement(By.name("purpose"));
		//bus.click();

		//Thread.sleep(5000);

		// By Link
		//WebElement link = driver.findElement(By.linkText("Launch"));
		//link.click();

		//Thread.sleep(5000);
		
		//Partial Link Text
		
		WebElement link = driver.findElement(By.partialLinkText("Contact"));
		link.click();

		Thread.sleep(5000);
		
		
		//By class
		WebElement tagName = driver.findElement(By.className("btn"));
		tagName.click();
		
		Thread.sleep(5000);
		
		//custom xpath -> //tagname[@attribute='value']
		//another custom xpath -> //a[contains(text().'value']
		// custom xpath -> //tagname[contains(text(),'text')]
		//*[contains(text(), 'text')]
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("test@nomail.com");
         
		Thread.sleep(5000);
		
		//absolute(root)
		//relative(path find)
		
		//css -> elementName[attributeName = 'attributeValue']
		
		//WebElement name = driver.findElement(By.cssSelector("input[name='dest_form']"));
		//name.click();
		//Thread.sleep(5000);
		
		
		}

}
