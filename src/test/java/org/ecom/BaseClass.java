package org.ecom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	static WebDriver driver;
	public  static void launch (String s) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PattonAdmin\\eclipse-workspce selenium project\\SeleniumProject\\div\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get(s);
		driver.manage().window().maximize();
	}
	public static void login (WebElement w) {
		Actions ac = new Actions(driver);
		ac.moveToElement(w).perform();
	   
	}
	public static void klick(WebElement w) {
		w.click();
	}
	public static void fill(WebElement w,String s) {
		w.sendKeys(s);
	}
	
	public static void jclick(WebElement w) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",w);
}
	public static void dclick(WebElement w) {
		Actions ac = new Actions(driver);
		 ac.doubleClick(w).perform();
	}}
	

