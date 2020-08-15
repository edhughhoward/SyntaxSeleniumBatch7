package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "/Users/edhug/eclipse-workspace/SeleniumJavaBatch7/Drivers/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fdefault.aspx");
	driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
	driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
	driver.findElement(By.id("ctl00_MainContent_login_button")).click();
	
	String actualtitle = driver.getTitle();
	String expectedtitle = "Wbyeb Orders";
	if (actualtitle.equalsIgnoreCase(expectedtitle)) {
		System.out.println("This is the correct title");
	} else {
		System.out.println("This is the wrong title");
	}
	driver.findElement(By.linkText("Logout")).click();
	
}
}


