package com.cg.project.testsuits;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.cg.project.utils.DriverUtil;
public class GoogleSerachTest {

	private WebDriver driver;
	@Parameters(value = "browser")
	@BeforeTest
	public void setUpTestEnv(String browser) {
			driver =DriverUtil.getWebDriver(browser);
	}

	@Test
	public void testGoogleSerachForInformation() {
		driver.get("https://www.google.in");
		WebElement searchBox= driver.findElement(By.name("q"));
		searchBox.sendKeys("Agile Methodology");
		WebElement submitBtn = driver.findElement(By.name("btnK"));
		submitBtn.submit();
		String expectedTitle = "Agile Methodology - Google Search";
		String actualTitle=driver.getTitle();
		
		System.out.println("actualTitle is "+ actualTitle);
		
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	@AfterTest
	public void tearDownTestEnv() {
			driver.close();
	}
	
}