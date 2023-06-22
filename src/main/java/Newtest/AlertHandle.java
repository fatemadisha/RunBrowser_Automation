package Newtest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertHandle extends BaseDriver {
	
	String url = "https://demoqa.com/alerts";
	
	@Test
	public void alert() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		
		WebElement alertButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
		alertButton.click();
		
		//Accept alert method or switch to alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		
		
		WebElement alertappear = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		alertappear.click();
		Thread.sleep(6000);
		
		alert.accept();
		Thread.sleep(3000);
		
		WebElement confirmButton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirmButton.click();
		Thread.sleep(3000);
		
		alert.accept();
		//if want to cancel -> alert.dismiss();		
		
		WebElement confirm = driver.findElement(By.id("confirmResult"));
		System.out.println(confirm.getText());
		Thread.sleep(3000);
		
		
		WebElement buttonClick = driver.findElement(By.xpath("//button[@id='promtButton']"));
		buttonClick.click();
		Thread.sleep(3000);
		alert.sendKeys("Hello World");
		alert.accept();
		Thread.sleep(3000);
		}
	}


