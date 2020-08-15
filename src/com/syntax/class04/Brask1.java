package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brask1 {
public static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	
	public static void main(String [] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/edhug/eclipse-workspace/SeleniumJavaBatch7/Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt = 'OrangeHRM']"));
		if (logo.isDisplayed()) {
			System.out.println("Logo is displayed");
		} else {
			System.out.println("Logo is not displayed");
		}
	
	
}
}
