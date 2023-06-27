package Newtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IframeHandaling extends BaseDriver {
	
	String url = "https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html";
	
	@Test
	public void frameHandle() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get(url);
		
		int iframeNumber = driver.findElements(By.tagName("iframe")).size();
		System.out.println(iframeNumber);
		
		// need to switch to a frame first
		driver.switchTo().frame("packageListFrame");
		
		WebElement frame = driver.findElement(By.xpath("//body/main[1]/ul[1]/li[1]/a[1]"));
		frame.click();
		Thread.sleep(5000);
		
		//after one frame need to close it as default content
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("packageFrame");
		
		WebElement alert = driver.findElement(By.xpath("//span[contains(text(),'Alert')]"));
		alert.click();
		Thread.sleep(5000);
		
       driver.switchTo().defaultContent();	
		
        //need to change the frame name as well
		driver.switchTo().frame("classFrame");
		
		WebElement accept = driver.findElement(By.xpath("//a[contains(text(),'accept')]"));
		accept.click();
		Thread.sleep(5000);	
		
	}

}
