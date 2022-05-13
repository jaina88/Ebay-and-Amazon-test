package com.company.qa.Explicitwait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept4 {

	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		  By usename = By.id("txtUsername");
	      By password = By.name("txtPassword");
	      By submit = By.xpath("//*[@class='button']");
	      By AssignLeave = By.xpath("//*[@class='quickLinkText']");
	      By EmployeeName = By.id("assignleave_txtEmployee_empName");
	      By LeaveType = By.id("assignleave_txtLeaveType");
	      By FromDate =By.id("assignleave_txtFromDate");
	      By ToDate = By.id("assignleave_txtToDate");
	      By ApplyLeave = By.id("menu_leave_applyLeave");
	      By MyLeaveList = By.id("menu_leave_viewMyLeaveList");
	      By Entitlement =By.id("menu_leave_Entitlements");
	      By Reports = By.id("menu_leave_Reports");
	      By Configure = By.id("menu_leave_Configure");
	      By LeaveList = By.id("menu_leave_viewLeaveList");
	      By Time = By.id("menu_time_viewTimeModule");
	      By Timesheets = By.id("menu_time_Timesheets");
	      By Attendance =By.id("menu_attendance_Attendance");
	      By Reports2 = By.id("menu_time_Reports");
	      By Projectinfo = By.id("menu_admin_ProjectInfo");
	      By Recruitment = By.id("menu_recruitment_viewRecruitmentModule");
	      By Candidates = By.id("menu_recruitment_viewCandidates");
	      By Vacancies = By.id("menu_recruitment_viewJobVacancy");
	      By Performance = By.id("menu__Performance");
	      By Configure2 = By.id("menu_performance_Configure");
	      By ManageReviews = By.id("menu_performance_ManageReviews");
	      By MyTrackers = By.id("menu_performance_viewMyPerformanceTrackerList");
	      By EmployeeTrackers = By.id("menu_performance_viewEmployeePerformanceTrackerList");
	      
	  
		
		
		
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
		  waitForElementToBeLocated(ApplyLeave, 4).click();
	      waitForElementToBeLocated(MyLeaveList, 5).click();
	      waitForElementToBeLocated(Entitlement, 4).click();
		  waitForElementToBeLocated(Reports, 5).click();
		  waitForElementToBeLocated(Configure, 10).click();
		  waitForElementToBeLocated(LeaveList, 5).click();
		  waitForElementToBeLocated(Time, 10).click();
		  waitForElementToBeLocated(Timesheets, 5).click();
		  waitForElementToBeLocated(Attendance, 5).click();
		  waitForElementToBeLocated(Reports2, 5).click();
		  waitForElementToBeLocated(Projectinfo, 5).click();
		  waitForElementToBeLocated(Recruitment, 5).click();
		  waitForElementToBeLocated(Candidates, 5).click();
		  waitForElementToBeLocated(Vacancies, 5).click();
		  waitForElementToBeLocated(Performance, 5).click();
		  waitForElementToBeLocated(Configure2, 5).click();
		  waitForElementToBeLocated(ManageReviews, 5).click();
		  waitForElementToBeLocated(MyTrackers, 5).click();
		  waitForElementToBeLocated(EmployeeTrackers, 5).click();

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
