package com.syntax.test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.syntax.pages.DashboardPage;
import com.syntax.pages.LoginPageWithFindBy;
import com.syntax.utils.BaseClass;

public class LoginTestWithFindBy {

	public static void main(String[] args) {
		BaseClass.setUp();
		LoginPageWithFindBy loginpage = new LoginPageWithFindBy();
		DashboardPage dashboard = new DashboardPage();
		loginpage.userNametextBox.sendKeys("Admin");
		loginpage.passwordTextBox.sendKeys("Hum@nhrm123");
		loginpage.loginBtn.click();
		
		TakesScreenshot ts = (TakesScreenshot)BaseClass.driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File());
		
		String admintext = dashboard.welcomeAdmin.getText();
		System.out.println(admintext);
		
		BaseClass.closeBrowser();

	}

}
