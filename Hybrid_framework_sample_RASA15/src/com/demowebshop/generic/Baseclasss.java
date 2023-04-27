package com.demowebshop.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Baseclasss implements Frames_constant
{
	public static  WebDriver driver;
	public ExtentReports report;
	
	@BeforeClass
	public void defect()
	{
		ExtentHtmlReporter rep=new ExtentHtmlReporter("./extent/ext.html");
		report=new ExtentReports();
		report.attachReporter(rep);
		ExtentTest c = report.createTest("Extent test");
	}
	
	@BeforeMethod
	public void appopen()
	{
		System.setProperty(Gecko_key, Gecko_value);
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(t, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(url);
	}
	@AfterClass
	public void def()
	{
		report.flush();
	}
	@AfterMethod
	public void appclose()
	{
		driver.quit();
	}
	
}
