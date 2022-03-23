package com.March22_PC;

import javax.swing.JOptionPane;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.helper.Page_Object_Manager;
import com.pom.Login_Page;
import com.pom1.Hotel_Book;
import com.pom1.Login_Page1;
import com.pom1.Payment_Page;
public class adactin_RunnerClass extends Base_Class{
	public static WebDriver driver= browser_Configuration("chrome");
	 
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	public static Logger log = Logger.getLogger(adactin_RunnerClass.class);
	
	public static void main(String[] args) throws Exception  {
		
		PropertyConfigurator.configure("log4j.properties");
		
		//LoginPage
		 
		getUrl("https://adactinhotelapp.com/");
		
		log.info("Url Launch");
		
	    
		String username = particular_Data("C:\\Users\\ram\\eclipse-workspace\\March22_PC\\Test_Cases\\TestCase_adactin.xlsx",1,5);
		
		inputValueElement(pom.get_Instance_login().getUser() , username);
		
		inputValueElement(pom.get_Instance_login().getPass(),
				particular_Data("C:\\Users\\ram\\eclipse-workspace\\March22_PC\\Test_Cases\\TestCase_adactin.xlsx",2,5));
		
		clickOnElement(pom.get_Instance_login().getLogn());
		
		log.info("logging Successfully");
		
		
		
		//Hotel Booking

	    dropdown("byText",pom.get_Instance_hb().getLocation(),
	    		particular_Data("C:\\Users\\ram\\eclipse-workspace\\March22_PC\\Test_Cases\\TestCase_adactin.xlsx",4,5));
	    sleep(3000);
		
		dropdown("byText",pom.get_Instance_hb().getHname(),
				particular_Data("C:\\Users\\ram\\eclipse-workspace\\March22_PC\\Test_Cases\\TestCase_adactin.xlsx",5,5));
		
		dropdown("byText",pom.get_Instance_hb().getRoomtype(),
				 particular_Data("C:\\Users\\ram\\eclipse-workspace\\March22_PC\\Test_Cases\\TestCase_adactin.xlsx",6,5));
		sleep(4000);
		
		dropdown("byText",pom.get_Instance_hb().getRoomnos(), 
				particular_Data("C:\\Users\\ram\\eclipse-workspace\\March22_PC\\Test_Cases\\TestCase_adactin.xlsx",7,5));
		
		//pom.get_Instance_hb().getDatein().clear();
		
		pom.get_Instance_hb().getDatein().sendKeys(particular_Data("C:\\Users\\ram\\eclipse-workspace\\March22_PC\\Test_Cases\\TestCase_adactin.xlsx",8,5));
		
		
		pom.get_Instance_hb().getDateout().sendKeys(particular_Data("C:\\Users\\ram\\eclipse-workspace\\March22_PC\\Test_Cases\\TestCase_adactin.xlsx",9,5));
		
		dropdown("byText",pom.get_Instance_hb().getAdultroom(), particular_Data("C:\\Users\\ram\\eclipse-workspace\\March22_PC\\Test_Cases\\TestCase_adactin.xlsx",10,5));
		
		dropdown("byText",pom.get_Instance_hb().getChildroom(),particular_Data("C:\\Users\\ram\\eclipse-workspace\\March22_PC\\Test_Cases\\TestCase_adactin.xlsx",11,5));
		sleep(3000);
		
		clickOnElement(pom.get_Instance_hb().getSubmit());
		
		clickOnElement(pom.get_Instance_hb().getSelect_btn());
		
		clickOnElement(pom.get_Instance_hb().getCont());
		
		log.info("Hotel details Selected and entered ");
		
		//Payment_Page
		
		inputValueElement(pom.get_Instance_payment().getFname(),
				particular_Data("C:\\Users\\ram\\eclipse-workspace\\March22_PC\\Test_Cases\\TestCase_adactin.xlsx",15,5));
		
		inputValueElement(pom.get_Instance_payment().getLname(),
				particular_Data("C:\\Users\\ram\\eclipse-workspace\\March22_PC\\Test_Cases\\TestCase_adactin.xlsx",16,5));
		
		inputValueElement(pom.get_Instance_payment().getAddress(),
				particular_Data("C:\\Users\\ram\\eclipse-workspace\\March22_PC\\Test_Cases\\TestCase_adactin.xlsx",17,5));
		
		inputValueElement(pom.get_Instance_payment().getAc_no(),
				particular_Data("C:\\Users\\ram\\eclipse-workspace\\March22_PC\\Test_Cases\\TestCase_adactin.xlsx",18,5));
		
		dropdown("byText",pom.get_Instance_payment().getAc_type(),
				particular_Data("C:\\Users\\ram\\eclipse-workspace\\March22_PC\\Test_Cases\\TestCase_adactin.xlsx",19,5));
		
		dropdown("byText",pom.get_Instance_payment().getExpmonth(),
				particular_Data("C:\\Users\\ram\\eclipse-workspace\\March22_PC\\Test_Cases\\TestCase_adactin.xlsx",20,5));
		
		dropdown("byText",pom.get_Instance_payment().getExpyr(),
				particular_Data("C:\\Users\\ram\\eclipse-workspace\\March22_PC\\Test_Cases\\TestCase_adactin.xlsx",21,5));
		
		inputValueElement(pom.get_Instance_payment().getCvv(),
				particular_Data("C:\\Users\\ram\\eclipse-workspace\\March22_PC\\Test_Cases\\TestCase_adactin.xlsx",22,5));
	
		clickOnElement(pom.get_Instance_payment().getBook());
		
		log.info("Hotel Booked");
		
		close();
		
		log.info("Successfully Logout");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}