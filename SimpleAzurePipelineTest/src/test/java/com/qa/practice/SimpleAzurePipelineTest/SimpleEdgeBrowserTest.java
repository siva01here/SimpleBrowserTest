package com.qa.practice.SimpleAzurePipelineTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 *
 */
public class SimpleEdgeBrowserTest {
	WebDriver eDriver;
	
	@Before
	public void setupTest()
	{
		WebDriverManager.edgedriver().setup();
		eDriver= new EdgeDriver();
		eDriver.manage().window().maximize();
	}
	
	@Test
	public void googleTest()
	{
		eDriver.get("http://www.google.com");
		System.out.println(eDriver.getTitle());
	}
	
	@Test
	public void msnTest()
	{
		eDriver.get("http://www.msn.com");
		System.out.println(eDriver.getTitle());
	}
	
	@After
	public void tearDownTest()
	{
		eDriver.quit();
	}
}
