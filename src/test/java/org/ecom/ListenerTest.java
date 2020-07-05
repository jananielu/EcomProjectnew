package org.ecom;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener {

	public void onFinish(ITestContext arg0) {
		System.out.println("Test Completed");}

	public void onStart(ITestContext arg0) {
		System.out.println("Test Starts");}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	System.out.println("on failed but success");	}

	public void onTestFailure(ITestResult result) {
		System.out.println("The name of failed test case is "+result.getName()); 
		Date d= new Date();
		String re = d.toString().replaceAll(":","-");
		TakesScreenshot  t = (TakesScreenshot)ExecutableClass.driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File des = new File ("C:\\Users\\PattonAdmin\\eclipse-workspce selenium project\\SeleniumProject\\Failed Test ScreenShot"+re+".png"); 
		try {FileUtils.copyFile(src, des);
		
		}
		catch (IOException e){
			e.printStackTrace();}
		
			ExecutableClass.driver.quit();
		
		
	System.out.println("on test failure");}

	public void onTestSkipped(ITestResult arg0) {
		System.out.println("on test skipped");}

	public void onTestStart(ITestResult arg0) {
		System.out.println("on test starts");
		
	}

	public void onTestSuccess(ITestResult arg0) {
	System.out.println("on test successs");
		
	}

}
