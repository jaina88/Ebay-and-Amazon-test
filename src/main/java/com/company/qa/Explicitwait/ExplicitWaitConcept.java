package com.company.qa.Explicitwait;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept {
         
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
      By AssignLeave = By.xpath("//*[@class='quickLinkText']");
      By EmployeeName = By.id("assignleave_txtEmployee_empName");
      By LeaveType = By.id("assignleave_txtLeaveType");
      By FromDate =By.id("assignleave_txtFromDate");
      By ToDate = By.id("assignleave_txtToDate");
      By Admin = By.id("menu_admin_viewAdminModule");
      By Usermanagement = By.xpath("//*[@class='arrow']");
      By PIM = By.id("menu_pim_viewPimModule");
      By Leave =By.id("menu_leave_viewLeaveModule");
      By Time = By.id("menu_time_viewTimeModule");
      By Recruitment = By.id("menu_recruitment_viewRecruitmentModule");
      By MyInfo = By.id("menu_pim_viewMyDetails");
      By Performance = By.id("menu__Performance");
      By Dashboard = By.id("menu_dashboard_index");
      By Directory = By.id("menu_directory_viewDirectory");
      By Maintenance = By.id("menu_maintenance_purgeEmployee");
      By Buzz = By.id("menu_buzz_viewBuzz");
      By Marketplace = By.id("MP_link");
      By WelcomeHoang = By.id("welcome");
     
      
      
      
      
      
      
      
      String title = waitForPageTitlePresent("OrangeHRM", 3);
      System.out.println(title);
		
		
		waitForElementToBeLocated(usename, 10).sendKeys("Admin");
		waitForElementToBeLocated(password, 5).sendKeys("admin123");
		waitForElementToBeLocated(submit, 5).click();
		waitForElementToBeLocated(AssignLeave,5).click();
		waitForElementToBeLocated(EmployeeName,5).sendKeys("Jaina Patel");	
		waitForElementToBeLocated(LeaveType,5).sendKeys("US-berevement");
		waitForElementToBeLocated(FromDate,5).sendKeys("2022-05-19");
		waitForElementToBeLocated(ToDate,5).sendKeys("2022-05-20");
		waitForElementToBeLocated(Admin,5).click();
		waitForElementToBeLocated(Usermanagement,5).click();
		waitForElementToBeLocated(PIM, 5).click();
		waitForElementToBeLocated(Time, 5).click();
		waitForElementToBeLocated(Leave, 5).click();
		waitForElementToBeLocated(Recruitment, 5).click();
		waitForElementToBeLocated(MyInfo, 5).click();
		waitForElementToBeLocated(Performance, 1).click();
		waitForElementToBeLocated(Dashboard, 5).click();
		waitForElementToBeLocated(Directory, 5).click();
		waitForElementToBeLocated(Maintenance, 5).click();
		waitForElementToBeLocated(Buzz, 5).click();
		waitForElementToBeLocated(Marketplace, 5).click();
		waitForElementToBeLocated(WelcomeHoang, 5).click();
		
		
      
   }
	
   public static WebElement waitForElementToBeLocated(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
	
   public static String waitForPageTitlePresent(String titleValue, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
		wait.until(ExpectedConditions.titleContains(titleValue));
		return driver.getTitle();
	
	
   }
}
