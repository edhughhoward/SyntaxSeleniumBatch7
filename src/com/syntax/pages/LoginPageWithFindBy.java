package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class LoginPageWithFindBy extends BaseClass {

	@FindBy(id = "txtUsername")
	public WebElement userNametextBox;
	
	@FindBy(xpath = "//input[@id = 'txtPassword']")
	public WebElement passwordTextBox;
	
	@FindBy(css = "input#btnLogin")
	public WebElement loginBtn;
	
	public LoginPageWithFindBy() {
		PageFactory.initElements(driver, this);
	}
	
}
