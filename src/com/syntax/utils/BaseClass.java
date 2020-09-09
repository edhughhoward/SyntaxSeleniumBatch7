package com.syntax.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	/**
	 * This method navigates to the hrms website
	 * 
	 */
	public static WebDriver driver;

	public static WebDriver setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/edhug/eclipse-workspace/SeleniumJavaBatch7/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("website");
		return driver;
	}

	public static void closeBrowser() {
		if (driver != null) {
			driver.quit();
		}

	}
}
