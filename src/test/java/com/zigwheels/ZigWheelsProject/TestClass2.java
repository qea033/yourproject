package com.zigwheels.ZigWheelsProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass2 {
  WebDriver driver;
	@BeforeTest
	public void browserSetup() {
		TestClass1 t = new TestClass1();
		t.environmentSetup();
	}
	
	@Test(groups = {"smoketest"})
	public void testSearchBox() {
		WebElement e = driver.findElement(By.id("headerSearch"));
		e.isDisplayed();
	}
	
}
