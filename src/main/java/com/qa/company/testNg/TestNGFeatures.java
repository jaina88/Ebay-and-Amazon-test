package com.qa.company.testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGFeatures {
	
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite ---> create user");
		
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite --> delete user");
		
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test --> Method before Test cases");
		
	
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test --> Method after Test cases");
		
	}
	@BeforeGroups
	public void beforeGroup() {
		System.out.println(" Grouping before test cases");
		
	}
	
	
	@AfterGroups
	public void afterGroup() {
		System.out.println(" Grouping after test cases");
		
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println(" Class before test cases");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println(" Grouping after test cases");
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println(" Method before test cases");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println(" Method after test cases");
		
	}
	
		
	@Test
	public void userDataTest() {
		
		System.out.println("user data test");
	}
	
    @Test(priority=1)
		public void userProfileTest() {
			System.out.println("user profile test");
		}
	
	
    @Test
	public void myThirdTestCase() {
		System.out.println("Testing before method and after method ");
	}

	
	
	
	
}
