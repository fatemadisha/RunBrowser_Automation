package Newtest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_suite {
	
@BeforeSuite	
public void beforeSuiteTest() {
		
		System.out.println("Tribel new Before Suite test");
		
	}
@BeforeTest
public void beforeTestMethod() {
	
	System.out.println("Tribel new Before test");
	
}

@BeforeMethod
public void beforeMethod() {
	
	System.out.println("Tribel new Before Method");
	
}

	
	@Test(priority =1)
	public void firstTest() {
		
		System.out.println("Tribel new test");
		
	}
	
	@Test(priority = 0)
	public void secondTest() {
		
		System.out.println("Tribel new second test");
		
	}
	
	
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("Tribel new After Method");
		
	}
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Tribel new Before class");
		
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("Tribel new After class test");
		
	}
	
@AfterTest	
public void afterTestMethod() {
		
		System.out.println("Tribel new After test");
		
	}

	@AfterSuite
public void afterSuiteTest() {
		
		System.out.println("Tribel new After Suite test");
		
	}

}

//TESTNG FRAMEWORK
