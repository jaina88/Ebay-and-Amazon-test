package com.company.qa.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locatorsconcept {

	

	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
			
		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//driver.findElement(By.)
		//1. ID is unique  - first choice
		
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		
		// 2. name --> can be duplicate -->2nd choice
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		
		driver.findElement(By.xpath("txtUsername")).sendKeys("Admin");
		
		
		
		//3. Classname --> it can be same for the different elements--not recommended
		
		// 4. Tagname --> not an attribute.-->not recommended
		
		//5. Link text only for links
		
		//6. partial link text only for links
		
		// 7. CSS selector: is not an attribute -- not recommended

		// 8.Xpath-
		
		//tagname[@Attribute='value']
		
		WebElement tagname = driver.findElement(By.tagName("input"));
		
	}
	
	

}
