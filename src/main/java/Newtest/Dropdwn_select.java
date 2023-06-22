package Newtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;


public class Dropdwn_select extends BaseDriver{
	
String url = "https://www.amazon.com/";
	
@Test
	public void dropdown() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get(url);
		
		Thread.sleep(5000);
		
		WebElement menuOption = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		//select by index
		Select option = new Select(menuOption);
		 option.selectByIndex(5);
		 
		 Thread.sleep(5000);
		 
		 //select by value
		 option.selectByValue("search-alias=arts-crafts-intl-ship");
		 Thread.sleep(5000);
		 
		 //select by text
		 option.selectByVisibleText("Computers");
		 Thread.sleep(5000);
		

}
}
