package com.company.qa.FluentWaitConcept;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {

	   static WebDriver driver;
		
		public static void main(String[] args) {
			
		   	WebDriverManager.chromedriver().setup();
				
	        driver = new ChromeDriver();
					
			driver.get("https://opensource-demo.orangehrmlive.com/");
			     

		       // String title =	driver.getTitle();
				
		       // System.out.println("Getting title for the website" +title);
		        
		      //  WebElement username =driver.findElement(By.id("txtUsername"));
		      //  WebElement password =driver.findElement(By.name("txtPassword"));
		        
			  //WebDriverWait Wait = new WebDriverWait(driver,20);
			 // Wait.until(ExpectedConditions.presennceOfAllElementsLocatedBy (By) username));
		      //Wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy (By) password));
		      
		      By usename = By.id("txtUsername");
		      By password = By.name("txtPassword");
		      By submit = By.xpath("//*[@class='button']");
		      
	//	 Wait <WebDriver> wait = new FluentWait <WebDriver> (driver)
	//			 .withTimeout(Duration.ofSeconds(15))
	//			 .pollingEvery(Duration.ofSeconds(5))
	//			 .ignoring(NoSuchElementException.class);
		 
		 waitForElemenetWithFluentWait(usename, 10,5).sendKeys("Admin");
		 waitForElemenetWithFluentWait(password,15, 5).sendKeys("admin123");
		 waitForElemenetWithFluentWait(submit,15, 5).click();
		 
		 
		 
		}
	      
		      
public static WebElement waitForElemenetWithFluentWait(By locator, int timeOut, int pollingTime) {
			
			Wait <WebDriver> wait = new FluentWait <WebDriver> (driver)
					.withTimeout(Duration.ofSeconds(timeOut))
					.pollingEvery(Duration.ofSeconds(pollingTime))
					.ignoring(NoSuchElementException.class);
				
				return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			
      
		      
		      
			
			
			
			
			
			
			
	}

		

}
