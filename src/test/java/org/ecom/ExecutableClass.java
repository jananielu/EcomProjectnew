package org.ecom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class ExecutableClass extends BaseClass {
	@Parameters({"url"})
	@Test
	public void testcase1(String s) {
		launch(s);}
	@Test
public void testcase2() throws InterruptedException {
	login(driver.findElement(By.xpath("//div[@class='x']")));
	klick(driver.findElement(By.xpath("(//a[@href='/login'])[1]")));
	Thread.sleep(3000);
	}
	@Parameters({"email" ,"password", })
	@Test
public void testcase3(String s1,String s2) throws InterruptedException {
	fill( driver.findElement(By.id("ap_email")),s1);
    fill(driver.findElement(By.id("ap_password")),s2);
	klick(driver.findElement(By.id("signInSubmit")));
	Thread.sleep(5000);}
	@Parameters({"search"})
	@Test
public void testcase4(String s3) throws InterruptedException {
	fill(driver.findElement(By.id("searchAll")),s3);
    klick(driver.findElement(By.xpath("//button[@class='E']")));
    jclick(driver.findElement(By.xpath("(//span[@class='Db Hb'])[3]")));
    Thread.sleep(3000);}
	@Test
public void testcase5() throws InterruptedException {
dclick(driver.findElement(By.xpath("//button[@class='fu']")));
Thread.sleep(3000);
jclick(driver.findElement(By.xpath("(//a[@href='/cart'])[2]")));
Assert.assertTrue(false);
	}}

