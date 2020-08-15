package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "/Users/edhug/eclipse-workspace/SeleniumJavaBatch7/Drivers/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
	driver.findElement(By.id("customer.firstName")).sendKeys("Edward");
	driver.findElement(By.id("customer.lastName")).sendKeys("Howard");
	driver.findElement(By.id("customer.address.street")).sendKeys("1234 Anywhere Street");
	driver.findElement(By.id("customer.address.city")).sendKeys("Washington");
	driver.findElement(By.id("customer.address.state")).sendKeys("DC");
	driver.findElement(By.id("customer.address.zipCode")).sendKeys("22313");
	driver.findElement(By.id("customer.phoneNumber")).sendKeys("202.222.2212");
	driver.findElement(By.id("customer.ssn")).sendKeys("123-45-6789");
	driver.findElement(By.id("customer.username")).sendKeys("edhughhoward");
	driver.findElement(By.id("customer.password")).sendKeys("password");
	driver.findElement(By.id("repeatedPassword")).sendKeys("password");
	driver.findElement(By.className("button")).click();
	Thread.sleep(3000);
	driver.close();

}
}
