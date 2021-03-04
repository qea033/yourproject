package com.zigwheels.ZigWheelsProject;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerDemo implements ITestListener {
	 
		
	public void onTestFailure(ITestResult r) {
	
		TestClass1.environmentSetup();
		
		System.out.println(r);
		
		TakesScreenshot ts;
		File source = ((TakesScreenshot) TestClass1.driver).getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\035\\FailedTestCase.png");
		try {
		FileHandler.copy(source, destination);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
  
}
	