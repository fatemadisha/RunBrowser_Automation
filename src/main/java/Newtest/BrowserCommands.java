package Newtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrowserCommands extends BaseDriver{
	
	String url = "https://www.daraz.com.bd/";
	
	@Test
	public void command() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get(url);
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		WebElement signUp = driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]"));
		signUp.click();
		Thread.sleep(3000);
		
		//for getting title
		System.out.println(driver.getTitle());
		
		//for getting current url
		System.out.println(driver.getCurrentUrl());
		
		
	}


	}

