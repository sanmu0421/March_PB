package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Page {
	
    public WebDriver driver;
    
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement fname;
	
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement lname;
	
	@FindBy(name="address")
	private WebElement address;
	
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement ac_no;
	
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement ac_type;
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement expmonth;
	
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement expyr;
	
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement cvv;
	
	@FindBy(xpath="//input[@name='book_now']")
	private WebElement book;

	public Payment_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getAc_no() {
		return ac_no;
	}

	public WebElement getAc_type() {
		return ac_type;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyr() {
		return expyr;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}
	

}
