package Newtest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertationExample extends BaseDriver {
	String url = "https://www.selenium.dev/" ;	
	
	@Test
	public void testAssertion() throws InterruptedException{
		
		driver.manage().window().maximize();
		driver.get(url);
		
		Thread.sleep(5000);
		String expectedTitle = "Selenium";
		String actualTitle = driver.getTitle();
		
	//Hard Assertion -> wrong hole next line e jabe na.
		
		Assert.assertEquals(expectedTitle, actualTitle );
		System.out.println("Pass");
		
		//Soft Assertion -> wrong hole laste sob fail throw korbe.
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(expectedTitle, actualTitle );
		System.out.println("Pass");
		
		Thread.sleep(5000);
		soft.assertAll();
}
}
