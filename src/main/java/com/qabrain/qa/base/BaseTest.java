package com.qabrain.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	public static WebDriver driver;
	
	public static void init() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://practice.qabrains.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	public static void tearDown() {
		driver.close();
	}

}
