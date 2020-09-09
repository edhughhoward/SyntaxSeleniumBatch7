package com.syntax.test;

import com.syntax.pages.LoginPage;
import com.syntax.utils.BaseClass;

public class LoginTest {

	public static void main(String[] args) {
		BaseClass.setUp();
		LoginPage loginpage = new LoginPage();
		
		loginpage.username.sendKeys("Admin");
		loginpage.password.sendKeys("Hum@nhrm123");
		loginpage.loginbut.click();
		
		BaseClass.closeBrowser();
	}

}
