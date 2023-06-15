package Newtest;

import org.testng.annotations.Test;

public class FirstRun extends BaseDriver {
	
	
	@Test
	public void firstTest() throws InterruptedException {
		driver.get("https://www.tribel.com/public/trending");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		System.out.println(driver.getTitle());
		}

}
