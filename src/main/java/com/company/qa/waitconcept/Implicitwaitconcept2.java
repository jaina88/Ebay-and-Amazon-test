package com.company.qa.waitconcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicitwaitconcept2 {

	public static void main(String[] args) {
		
		
		// initaialize the webdriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// get the website
		driver.get("https://www2.hm.com/en_us/index.html");
        
        String title =driver.getTitle();
        System.out.println("Getting title for the website" +title);
        
        
        //maximize the screen
        driver.manage().window().maximize();
        
        //initialize the imlicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        driver.findElement(By.xpath("//*[@https://www2.hm.com/en_us/index.html]")).click();
        
        
	}

	

	
	}
	


