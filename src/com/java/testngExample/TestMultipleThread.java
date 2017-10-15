package com.java.testngExample;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMultipleThread {
	@Test(invocationCount=20, threadPoolSize = 5)
	public void loadTestWebsite(){
		System.out.printf("%n[START] Thread Id : %s is started!", Thread.currentThread().getId());
		File pathToBinary = new File("D:\\Jaas\\FF\\firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);	
		driver.get("http://www.google.com");
		System.out.println("page title is :" + driver.getTitle());
		Assert.assertEquals("Google", driver.getTitle());
		
		System.out.printf("%n[END] Thread Id : %s", Thread.currentThread().getId());

		
		driver.quit();
	}
  
}
