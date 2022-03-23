package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\ram\\Documents\\Write_Data.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
	
		Workbook wb =new XSSFWorkbook(fis);
		
		wb.createSheet("User_Excel").createRow(0).createCell(0).setCellValue("Email");
		
		wb.getSheet("User_Excel").getRow(0).createCell(1).setCellValue("Password");
		
		wb.getSheet("User_Excel").createRow(1).createCell(0).setCellValue("obama");
		
		wb.getSheet("User_Excel").getRow(1).createCell(1).setCellValue("obama@1234");
		
		wb.getSheet("User_Excel").createRow(2).createCell(0).setCellValue("leonardodicaprio");
		
		wb.getSheet("User_Excel").getRow(2).createCell(1).setCellValue("leo@321");
		
		wb.getSheet("User_Excel").createRow(3).createCell(0).setCellValue("kalam");
		
		wb.getSheet("User_Excel").getRow(3).createCell(1).setCellValue("kalam@768");
		
		wb.getSheet("User_Excel").getRow(4).createCell(0).setCellValue("bose");
		
		wb.getSheet("User_Excel").getRow(4).createCell(1).setCellValue("bose@45");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
		wb.close();
		
		System.out.println("Write Sucessfully");
		

	}

}
