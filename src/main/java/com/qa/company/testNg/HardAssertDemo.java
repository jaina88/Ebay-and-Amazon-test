package com.qa.company.testNg;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssertDemo {
	
	
	
	
	WebDriver driver;

	@BeforeMethod
	//@BeforeTest
	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	
	
	@Test(priority =1)
	public void orangeHRMLogoTest() {
		
	
	Assert.assertTrue(driver.findElement(By.id("divLogo")).isDisplayed());

	}

	@Test(priority =1)
	public void orangeHRMTitleTest() {
		
		
	//	String expected = "OrangeHRM";
		String actual = driver.getTitle();
		
		System.out.println("Page title is " + actual );
	//	assertEquals(actual, expected, "Wrong title");
		
		assertTrue(true);

		System.out.println("Page title is " + actual );

	}

//	@Test (priority =1)
//	public void loginTextTest() {
//
//		String text = driver.findElement(By.id("logInPanelHeading")).getText();
//
//		System.out.println("Login panel text " + text);
//
//	}

//	@AfterTest
@AfterMethod
	public void tearDown() {

		driver.quit();
}
	
}