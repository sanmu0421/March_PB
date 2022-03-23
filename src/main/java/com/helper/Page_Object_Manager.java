package com.helper;

import org.openqa.selenium.WebDriver;

import com.pom1.Hotel_Book;
import com.pom1.Login_Page1;
import com.pom1.Payment_Page;



public class Page_Object_Manager {
	public WebDriver driver;
	
	private Login_Page1 login;
	
	private Hotel_Book hb;
	
	private Payment_Page payment;
	
	public Page_Object_Manager(WebDriver driver2) {


		this.driver = driver2;
		
	}

	public Login_Page1 get_Instance_login() {
		
		if(login==null) {
			
			login=new Login_Page1(driver);
				
    }
			
		return login;
	
	}
	public Hotel_Book get_Instance_hb() {
		
	   if(hb==null) {
		   
		   hb = new Hotel_Book(driver);	
		    
	   }
    	return hb;	
	
	}	
	public Payment_Page get_Instance_payment() {
		
		if(payment==null) {
			
			payment = new Payment_Page(driver);
			
			
		}
		
		return payment;
		
	}

}
