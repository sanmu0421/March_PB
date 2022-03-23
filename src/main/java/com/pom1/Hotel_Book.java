package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Book {
	
	public WebDriver driver;
	
	@FindBy(xpath="(//select)[1]")
	 private WebElement location;

	public Hotel_Book(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHname() {
		return hname;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getSelect_btn() {
		return select_btn;
	}

	public WebElement getCont() {
		return cont;
	}

	@FindBy(name="hotels")
	private WebElement hname;
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement roomtype;
	
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement roomnos;
	
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement datein;
	
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement dateout;
	
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adultroom;
	
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement childroom;
	
	@FindBy(id="Submit")
	private WebElement submit;
	
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement select_btn;
	
	@FindBy(name="continue")
	private WebElement cont;
	
	
	
	
	 
	

}
