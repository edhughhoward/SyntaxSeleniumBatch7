package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/Users/edhug/eclipse-workspace/SeleniumJavaBatch7/Drivers/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.amazon.com");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	
	}
}
