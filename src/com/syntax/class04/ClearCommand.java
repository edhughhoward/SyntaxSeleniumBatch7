package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearCommand {
public static String url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx";
	
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/edhug/eclipse-workspace/SeleniumJavaBatch7/Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		WebElement userNameTextBox = driver.findElement(By.id("ct100_MainContent_username"));
		userNameTextBox.sendKeys("Tester");
		WebElement passwordTextBox = driver.findElement(By.name("ct100$MainContent$password"));
		passwordTextBox.sendKeys("test");
		
		Thread.sleep(2000);
		WebElement loginButton = driver.findElement(By.className("button"));
		loginButton.click();
//		userNameTextBox.clear();
//		passwordTextBox.clear();
		
		WebElement logo = driver.findElement(By.xpath("//h1[text() = 'Web Orders']"));
		if (logo.isDisplayed()) {
			String logoText = logo.getText();
			if (logoText.equals("Web Orders")) {
				System.out.println("This is the right logo");
			} else {
				System.out.println("this is the wrong logo");
			}
		}
}
}
