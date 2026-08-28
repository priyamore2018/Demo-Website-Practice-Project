package com.qabrain.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class QABrainHomePage {

	public WebDriver driver;
	
	public QABrainHomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement loginLink;
	
	public void verifyLoginLink() {
		
		//Thread.sleep(5000);
		loginLink= driver.findElement(By.xpath("//span[text()='Login']"));
		
		Wait<WebDriver> wait=new WebDriverWait(driver, Duration.ofSeconds(80));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Login']")));
		
		if(loginLink.isEnabled()) {
			System.out.println("Login Link is Visibile on Home Pages");
		}
		boolean actualLoginLink=loginLink.isEnabled();
		
		Assert.assertEquals(actualLoginLink, true);
	}
}
