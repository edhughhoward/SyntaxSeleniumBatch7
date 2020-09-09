package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		WebElement fileUpload = driver.findElement(By.linkText("File Upload"));
		fileUpload.click();
		WebElement chooseFile = driver.findElement(By.id("file-upload"));
		chooseFile.sendKeys("C:\\Users\\edhug\\OneDrive\\Desktop\\SampleTest.xlsx");
		WebElement uploadButton = driver.findElement(By.id("file-submit"));
		uploadButton.click();
	}
}