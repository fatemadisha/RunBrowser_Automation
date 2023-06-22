package Newtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverHandaling extends BaseDriver{
	
	String url = "https://www.daraz.com.bd/";
	
	@Test
	public void mouse() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get(url);
		
		Thread.sleep(10000);
		
		Actions action = new Actions(driver);
		
		WebElement life = driver.findElement(By.xpath("//span[contains(text(),'Home & Lifestyle')]"));
		action.moveToElement(life).perform();
		Thread.sleep(3000);
		
		WebElement furniture = driver.findElement(By.xpath("//body/div[@id='J_7459419030']/div[@id='J_LzdSiteNav']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/ul[10]/li[3]"));
		action.moveToElement(furniture).perform();
		Thread.sleep(3000);
		
		WebElement home = driver.findElement(By.xpath("//span[contains(text(),'Home Office Furniture')]"));
		home.click();
		Thread.sleep(3000);
	}

}
