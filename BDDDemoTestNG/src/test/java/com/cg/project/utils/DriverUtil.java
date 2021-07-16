package com.cg.project.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverUtil {

	private static WebDriver driver;

	public static  WebDriver getWebDriver(String browser) {

		if(browser.equalsIgnoreCase("Chrome")) {
			//1st Step  load chrom  driver in JVM

			System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe" );
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--headless");
			chromeOptions.addArguments("--start-maximized");
			//2nd Step
			driver = new ChromeDriver(chromeOptions);
			// Implicit waiting 
			driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
			return driver;
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\FireFoxDriver\\geckodriver.exe" );
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			firefoxOptions.addArguments("--headless");
			firefoxOptions.addArguments("--start-maximized");
			//2nd Step
			driver =new FirefoxDriver(firefoxOptions);
			driver.manage().window().maximize(); driver.manage().deleteAllCookies();
			// Implicit waiting 
			driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
			return driver;
		}
		else return null;
	}
}
