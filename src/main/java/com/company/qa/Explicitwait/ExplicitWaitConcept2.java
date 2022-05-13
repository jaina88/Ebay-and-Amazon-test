package com.company.qa.Explicitwait;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept2 {

	static WebDriver driver;
	
	

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		
		driver.get("https://www.hm.com/entrance.ahtml?orguri=%2F");
		driver.manage().window().maximize();
		
		//String title =driver.getTitle();
		//System.out.println("The title of the website is " + title);
		
		By country = By.id("link_en_us");
		By signin =By.xpath("//*[@class='menu__myhm']");
		By email = By.id("modal-txt-signin-email");
		By password = By.name("j_password");
	    By signin2 = By.xpath("//*[@class='button large js-set-session-storage btn-login']");
	    By CustomerService = By.xpath("//*[@class='menu__sub-link']");
	    By StudentDiscount = By.xpath("//*[@class='menu__services__item']");		
	   
		
		
			//String title1 = waitForPageTitlePresent("https://www2.hm.com/en_us/index.html", 3);
	    	//System.out.println(title1);
		
		
		waitForElementToBeLocated(country, 5).sendKeys("United States");
		waitForElementToBeLocated(country,2).click();
		waitForElementToBeLocated(signin,2).click();
		waitForElementToBeLocated(email, 5).sendKeys("jainapatel88@gmail.com");
	    waitForElementToBeLocated(password,5).sendKeys("12345");
		waitForElementToBeLocated(signin2, 5).click();
		waitForElementToBeLocated(CustomerService, 5).click();
		waitForElementToBeLocated(StudentDiscount, 5).click();
		
	}

	   public static WebElement waitForElementToBeLocated(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
	  public static WebElement waitForPageTitlePresent(By locator, int timeOut) {
			WebDriverWait wait = new WebDriverWait(driver,timeOut);
			return (WebElement)wait.until(ExpectedConditions.presenceOfElementLocated(locator)); 
}
}
