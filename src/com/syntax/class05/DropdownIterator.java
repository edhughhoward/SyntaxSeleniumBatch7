package com.syntax.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownIterator {
public static String url = "http://amazon.com";
	
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/edhug/eclipse-workspace/SeleniumJavaBatch7/Drivers/chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		WebElement categories = driver.findElement(By.id("searchDropdownBox"));
		Select select = new Select(categories);
		List<WebElement> options = select.getOptions();
		
		Iterator<WebElement> it = options.iterator();
		while(it.hasNext()) {
			WebElement option = it.next();
			System.out.println(option.getText());			
		}
		boolean isMultiple = select.isMultiple();
		System.out.println(isMultiple);
}
}
