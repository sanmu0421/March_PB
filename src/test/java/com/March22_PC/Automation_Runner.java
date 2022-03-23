package com.March22_PC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.pom.Home_Page;
import com.pom.Login_Page;

public class Automation_Runner extends Base_Class{
	
	public static WebDriver driver= browser_Configuration("chrome");      
	
	public static Home_Page hp =  new Home_Page(driver);
	
	public static Login_Page login = new Login_Page(driver);
	
	public static void main(String[] args) {
		
		getUrl("http://automationpractice.com/index.php");
			
		clickOnElement(hp.getSignin_Btn());
		
        inputValueElement(login.getEmail(),"testingselenium0421@gmail.com");
        
		inputValueElement(login.getPassword(), "Abc@12345");
		
		clickOnElement(login.getSignin_Btn());
		
		close();
		
	}

}
