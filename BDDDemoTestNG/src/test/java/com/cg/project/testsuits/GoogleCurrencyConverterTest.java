package com.cg.project.testsuits;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.cg.project.utils.DriverUtil;

public class GoogleCurrencyConverterTest {
	
	private WebDriver driver;
	@Parameters(value = "browser")
	@BeforeTest
	public void setUpTestEnv(String browser) {
			driver =DriverUtil.getWebDriver(browser);
	}

	@Test
	public void testGoogleCurrencyConverter() {
		System.out.println("testGoogleCurrencyConverter()");
	}
	
	@AfterTest
	public void tearDownTestEnv() {
			driver.quit();
	}
}