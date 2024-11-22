package com.ShoppersStack_Generic_Utility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.ShoppersStack_POM.home_page;
import com.ShoppersStack_POM.login_page;
import com.ShoppersStack_POM.welcome_page;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

	public class Base_Test {
	
	public File_Utility fileUtility=new File_Utility();
	
	public WebDriver driver;
	public static WebDriver sDriver;
	public ExtentSparkReporter spark;
	public ExtentReports reports;
	public ExtentTest test;
	public welcome_page welcomePage;
	public login_page loginPage;
	public home_page homePage;
	public Java_Utility javaUtility=new Java_Utility();
	public WebDriverWait wait;
	public WebDriver_utility webdriverUtility=new WebDriver_utility();
	
	
	
	@BeforeSuite
	
	public void beforeSuit() {
		
		System.out.println("@BeforeSuite");
	}   
	
	@BeforeTest
	
	public void beforeTest() {
		
		System.out.println("@BeforeTest");
		
		spark=new ExtentSparkReporter(Framework_Constants.extentReportPath+javaUtility.dateAndTime()+".html");
		reports=new ExtentReports();
		reports.attachReporter(spark);
	}
	
	@BeforeClass
	
	public void beforeClass() throws IOException {
		
		System.out.println("@BeforeClass");
		
		String browser = fileUtility.readPropertyFile("browserName");
		
		String url = fileUtility.readPropertyFile("url");
		
//		String url = System.getProperty("url");
//		String browser = System.getProperty("browserName");
	
		
		if(browser.contains("chrome")) {
			
			driver=new ChromeDriver();
		}
		
		else if(browser.contains("firefox")) {
			
			driver=new FirefoxDriver();
		}
		
		else if(browser.contains("edge")) {
			
			driver=new EdgeDriver();
		}
		
		else {
			
			System.out.println("Enter Valid Browser Name");
		}
		
		sDriver=driver;
		homePage=new home_page(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
	}
	
	@BeforeMethod
	
	public void beforeMethod() throws IOException, InterruptedException {
		
		System.out.println("@BeforeMethod");
		
		String userName = fileUtility.readPropertyFile("username");
		String password = fileUtility.readPropertyFile("password");
		
		welcomePage=new welcome_page(driver);
		
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		
		wait.until(ExpectedConditions.elementToBeClickable(welcomePage.getLoginBtn()));
		Thread.sleep(3000);
		welcomePage.getLoginBtn().click();
		
		loginPage=new login_page(driver);
		loginPage.getEmailTextField().sendKeys(userName);
		loginPage.getPasswordTextField().sendKeys(password);
		loginPage.getLoginbtnTextField().click();
		
	}
	
	@AfterMethod
	
	public void afterMethod() {
		
		System.out.println("@AfterMethod");
		homePage.getAccountsettingsBtn().click();
		homePage.getLogoutBtn().click();
	}
	
	@AfterClass
	
	public void afterClass() throws InterruptedException {
		
		System.out.println("@AfterClass");
		
		Thread.sleep(3000);
		driver.quit();
	}
	
	@AfterTest
	
	public void afterTest(){
		
		System.out.println("@AfterTest");
		
		reports.flush();
	}
	
	@AfterSuite
	
	public void afterSuit(){
		
		System.out.println("@AfterSuite");
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
