package com.company.qa.Explicitwait;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicitwaitconcept3 {

	
	static WebDriver driver;
	

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
       driver.get("https://www.orangehrm.com/");
       
      // String title = driver.getTitle();
     //  System.out.println("The title of the website is" + title);
       
       By email = By.id("myText");
       By freeTrail = By.id("linkadd");
       
       wairForElementToBeLocated(email,5).sendKeys("jainapatel882gmail.com");
       wairForElementToBeLocated(freeTrail,5).click();
       
       
       
       
	}
	
	
	public static WebElement wairForElementToBeLocated(By locator, int Timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Timeout);
		return (WebElement) wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		
		
		
	}
	  public static String waitForPageTitlePresent(String titleValue, int timeOut) {
			WebDriverWait wait = new WebDriverWait(driver,timeOut);
			wait.until(ExpectedConditions.titleContains(titleValue));
			return driver.getTitle();

	  }
}
