package com.zigwheels.ZigWheelsProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestClass1 {
  
	public static WebDriver driver;
	
	@BeforeSuite
	public static void environmentSetup() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://www.zigwheels.com");
	}
	
	@Test
	public void verifyTitle() {
		
		String expectedTitle = "ZigWheels";
				//+ " - New Cars, Used Cars, Bikes Prices, News, Reviews, Forum";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println(actualTitle);
	}
	
	@Test
	public void verifyLoginButton() {
		WebElement l = driver.findElement(By.id("des_lIconn"));
		l.isDisplayed();
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}