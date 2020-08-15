package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Brask1 {
public static String url = "https://www.facebook.com/reg/?rs=2";
	
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/edhug/eclipse-workspace/SeleniumJavaBatch7/Drivers/chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		WebElement monthdd = driver.findElement(By.id("month"));
		Select selectMonth = new Select(monthdd);
		List<WebElement> optionsMonth = selectMonth.getOptions();
		if(optionsMonth.size()-1 == 12) {
			System.out.println("options of month size is correct");
		} else {
			System.out.println("Options of month size is NOT correct");
		}
		WebElement dayDD = driver.findElement(By.id("day"));
		Select selectDay = new Select(dayDD);
		List<WebElement> optionsDay = selectDay.getAllSelectedOptions();
		if(optionsDay.size() -1 == 31) {
			System.out.println("Options of day size is correct");
		} else {
			System.out.println("Options of day size is NOT correct");
		}
		WebElement yearDD = driver.findElement(By.id("year"));
		Select selectYear = new Select(yearDD);
		List<WebElement> optionsYear = selectYear.getAllSelectedOptions();
		if(optionsYear.size() -1 == 31) {
			System.out.println("Options of year size is correct");
		} else {
			System.out.println("Options of year size is NOT correct");
		}
		
}
}
