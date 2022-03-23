package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page1 {
	
	public WebDriver driver;
	
	@FindBy(name="username")
	
	private WebElement user;
	
	@FindBy(name="password")
	
	private WebElement pass;
	
	@FindBy(id="login")
	
	private WebElement logn;

	public Login_Page1(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogn() {
		return logn;
	}
	

	
	
}

	