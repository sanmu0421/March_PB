package com.March22_PC;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import  org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;


//import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class Base_Class {
	
	public static WebDriver driver ; //------->null
	
	public static String value;   //--------->null
	
	 public static WebDriver browser_Configuration(String type) {
		 
		 if(type.equalsIgnoreCase("chrome")) {
			 System.setProperty("webdriver.chrome.driver", 
					 System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			 
			  driver =new ChromeDriver();
		 }
		 else if(type.equalsIgnoreCase("firefox")) {
			 System.setProperty("webdriver.gecko.driver","value");
			  driver = new FirefoxDriver();
		 }
		 driver.manage().window().maximize();
		 return driver;
		 
	 }
	
	public static void clickOnElement(WebElement element){
		element.click();
		
	}
	public static void inputValueElement(WebElement element , String data){
		
		element.sendKeys(data);		
	}
	public static void close(){
		
		driver.close();
	 }
	public static void getUrl(String url) {
		driver.get(url);
	}
	//dropdown using if else
	public static void dropdown(String type, WebElement element, String value) {
		Select s = new Select(element);
		
		if(type.equalsIgnoreCase("byValue")) {
			s.selectByValue(value);
		}
		else if(type.equalsIgnoreCase("byText")) {
			s.selectByVisibleText(value);
			}
		else if(type.equalsIgnoreCase("byIndex")) {
			int index = Integer.parseInt(value);	
		s.selectByIndex(index);
		}
	
		}
	//dropdown using switch case 
	public static void dropdown1(String location, String str, WebElement element, String type, String value ) {
		 
		WebElement we = findElement(location, str, element);
		
		Select s1 = new Select(we);
		switch(type) {
		case "value":
			s1.selectByValue(value);
		    break;
		case "text" :
			s1.selectByVisibleText(value);
			break;
		case "index":
			int sel = Integer.parseInt(value);
			s1.selectByIndex(sel);
		default:
			break;
		}
	}
     // finding webElement
	private static WebElement findElement(String location, String str, WebElement we) {
		
		switch(location) {
		case"name":
			we=driver.findElement(By.name(str));
			break;
		case"id":
			we = driver.findElement(By.id(str));
			break;
		case"xpath":
			we=driver.findElement(By.xpath(str));
			break;
			
			default:
				break;
		}
		return we;
			
	}
	//takeScreenshot
	//public static void takeScreenshot(String path)throws Exception{
		
		//TakesScreenshot ts = (TakesScreenshot)driver;
		//File source = ts.getScreenshotAs(OutputType.FILE);
		//File destination = new File(path);
		//FileHandler.copy(source, destination);
		
	//}
	//thread.sleep
	public static void sleep(int milliseconds)throws InterruptedException{
		try {
			Thread.sleep(milliseconds);
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
	
	public static String particular_Data(String path,int row_Index,int cell_Index) throws IOException {
		
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		 XSSFWorkbook w = new XSSFWorkbook(fis);
		 
		 Sheet sheetAt = w.getSheetAt(0);
		 
		 Row row = sheetAt.getRow(row_Index);
		 
		 Cell cell = row.getCell(cell_Index);
		 
		 CellType cellType = cell.getCellType();
		 
		 if(cellType.equals(cellType.STRING)) {
			 
			 value = cell.getStringCellValue();
			 
		 }
		 else if (cellType.equals(cellType.NUMERIC)) {
			 
			 double numericCellValue = cell.getNumericCellValue();
			 
			 int val = (int) numericCellValue;
			 
			 value = String.valueOf(val);
			 
		 }
		 
		 return value;
		 	
	} 
	 
	}
	
		
				
				
				
				
				
				
					
				
		
			  
		
	

