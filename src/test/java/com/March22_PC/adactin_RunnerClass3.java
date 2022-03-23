package com.March22_PC;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class adactin_RunnerClass3 extends Base_Class{
	
	public static WebDriver driver;      //-----> null

	public static void main(String[] args) throws InterruptedException {
		
	    driver = browser_Configuration("chrome");
		
		getUrl("https://adactinhotelapp.com/");
		
		
		WebElement user = driver.findElement(By.name("username"));
		inputValueElement(user, "Priyananth");
		
		WebElement pass = driver.findElement(By.name("password"));
		inputValueElement(pass, "YMF676");
		Thread.sleep(3000);
		WebElement logn = driver.findElement(By.id("login"));
		clickOnElement(logn);
		WebElement loc = driver.findElement(By.xpath("(//select)[1]"));
	    dropdown("byText",loc,"Los Angeles");
	    Thread.sleep(3000);
		WebElement hotel = driver.findElement(By.name("hotels"));
		dropdown("byText",hotel,"Hotel Sunshine");
		WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
		dropdown("byText",room,"Super Deluxe");
		WebElement roomno = driver.findElement(By.xpath("//select[@name='room_nos']"));
		dropdown("byText",roomno,"10 - Ten");
		WebElement startd = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		startd.clear();
		startd.sendKeys("04/07/2022");
		WebElement outd = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		outd.clear();
		outd.sendKeys("09/07/2022");
		WebElement adroom = driver.findElement(By.xpath("//select[@name='adult_room']"));
		dropdown("byText",adroom,"2 - Two");
		WebElement child = driver.findElement(By.xpath("//select[@name='child_room']"));
		dropdown("byText",child,"2 - Two");
		WebElement submit = driver.findElement(By.id("Submit"));
		clickOnElement(submit);
		WebElement select = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		clickOnElement(select);
		WebElement cont = driver.findElement(By.name("continue"));
		clickOnElement(cont);
		WebElement firstn = driver.findElement(By.xpath("//input[@name='first_name']"));
		inputValueElement(firstn,"Sanmga ");
		WebElement lastn = driver.findElement(By.xpath("//input[@name='last_name']"));
		inputValueElement(lastn,"priya");
		WebElement address = driver.findElement(By.name("address"));
		inputValueElement(address,"Junglighat Portblair South Andaman");
		WebElement acc = driver.findElement(By.xpath("//input[@name='cc_num']"));
		inputValueElement(acc,"9876543456328765");
		WebElement crdtype = driver.findElement(By.xpath("//select[@name='cc_type']"));
		dropdown("byText",crdtype,"Master Card");
		WebElement expd = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		dropdown("byText",expd,"August");
		WebElement expend = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		dropdown("byText",expend,"2022");
		WebElement cv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		inputValueElement(cv,"5466");
		WebElement book = driver.findElement(By.xpath("//input[@name='book_now']"));
		clickOnElement(book);
		WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
		clickOnElement(logout);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.findElement(By.xpath("//a[text()='New User Register Here']")).click();
		//WebElement user = driver.findElement(By.name("username"));
		//user.sendKeys("Shankaran");
		//WebElement pass = driver.findElement(By.name("password"));
		//pass.sendKeys("Abc@12345");
		//WebElement repass = driver.findElement(By.name("re_password"));
		//repass.sendKeys("Abc@12345");
		//WebElement fullname = driver.findElement(By.name("full_name"));
		//fullname.sendKeys("Sanmuga priya");
		//WebElement mail = driver.findElement(By.name("email_add"));
		//mail.sendKeys("priyama0421@gmail.com");
		//Thread.sleep(3000);
	    //String str = JOptionPane.showInputDialog("Enter your captcha");
	    // captcha = driver.findElement(By.name("captcha"));
	    //captcha.sendKeys(str);
	    //driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	    //driver.findElement(By.id("Submit")).click();
	    //driver.findElement(By.xpath("//a[text()='Click here to login']")).click();
	    //Thread.sleep(3000);
	    //WebElement usname = driver.findElement(By.name("username"));
	    //usname.sendKeys("Shankaran");
	    //WebElement password = driver.findElement(By.name("password"));
	    //password.sendKeys("Abc@12345");
	    //driver.findElement(By.name("login")).click();
	    
	    
	    
	}

}
