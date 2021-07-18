package com.qa.practice.SimpleAzurePipelineTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 *
 */
public class SimpleBrowserTest {
	static WebDriver hdriver;
	
	@BeforeMethod
	public void setUpTest()
	{
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.silentOutput", "true");
		hdriver= new ChromeDriver();
		hdriver.manage().window().maximize();
	}
	
	@Test
	public void googleTest()
	{
		hdriver.get("http://www.google.co.in");
		String expTitle="Google";
		Assert.assertTrue(expTitle.equals(hdriver.getTitle()));
	}
	
	@Test
	public void googleNewsTest()
	{
		hdriver.get("https://news.google.com/");
		String expTitle="Google News";
		Assert.assertTrue(expTitle.equals(hdriver.getTitle()));
	}
	
	@AfterMethod
	public void tearDownTest()
	{
		hdriver.quit();
	}

}
