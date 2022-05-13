package com.company.qa.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumdemo {

	public static void main(String[] args) {
		
		

		 System.setProperty("webdriver.chrome.driver", "/Users/jainapatel/eclipse-workspace/SeleniumMvaenDemoMarch2022/drivers/chromedriver");
		 WebDriver driver = new ChromeDriver();
	          
	         driver.get("https://www.google.com");
	         
	         
	   

	}

}
