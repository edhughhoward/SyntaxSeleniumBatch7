package com.syntax.class04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksFromEbay {
public static String url = "http://ebay.com";
	
	public static void main(String [] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/edhug/eclipse-workspace/SeleniumJavaBatch7/Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
}
}
