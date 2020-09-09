package com.syntax.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingWindows {
	public static String url = "http://166.62.36.207/syntaxpractice/window-popup-modal-demo.html";
	public static void main(String [] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.get(url);
			String mainPageHandle = driver.getWindowHandle();
			WebElement instaButton = driver.findElement(By.linkText("Follow On Instagram"));
			WebElement fbButton = driver.findElement(By.linkText("Like us On Facebook"));
			WebElement bothButton = driver.findElement(By.linkText("Follow Instagram & Facebook"));
			instaButton.click();
			fbButton.click();
			bothButton.click();
			
			Set<String> allHandles = driver.getWindowHandles();
			System.out.println(allHandles.size());
			Iterator<String> it = allHandles.iterator();
			while (it.hasNext()) {
				String childHandle = it.next();
				if(!childHandle.equals(mainPageHandle)) {
					driver.switchTo().window(childHandle);
					System.out.println(driver.getTitle());
					driver.close();
				}
			}
			driver.switchTo().window(mainPageHandle);
			instaButton.click();
	}
}
