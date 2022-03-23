package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
	
	public static void  particular_Cell_Date() throws IOException{
		
		File f = new File("C:\\Users\\ram\\eclipse-workspace\\March22_PC\\Test_Cases\\TestCase_Demo1.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(0);
		
		Row r = s.getRow(3);
		
		Cell c = r.getCell(0);
		
		CellType type = c.getCellType();
		
		if(type.equals(CellType.STRING)) {
			
			String cellValue = c.getStringCellValue();
			
	        System.out.println(cellValue);    
			
		}
		
		else if(type.equals(CellType.NUMERIC)) {
			
			double cellValue = c.getNumericCellValue();	
			
			int value = (int)cellValue;
			
			
		  System.out.println(value);
			
		}
		
		wb.close();
				
	}
	
	public static void all_Data() throws IOException {
		
        File f = new File("C:\\Users\\ram\\eclipse-workspace\\March22_PC\\Test_Cases\\TestCase_Demo1.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(0);
		
		for(int i = 0; i<s.getPhysicalNumberOfRows(); i++) {
			
			Row r = s.getRow(i);
			
			for(int j =0;j<r.getPhysicalNumberOfCells();j++) {
				
				Cell c= r.getCell(j);
				
				CellType type = c.getCellType();
				
				if(type.equals(CellType.STRING)) {
					
					String value = c.getStringCellValue();
					System.out.println(value);
				}
				
				else if (type.equals(CellType.NUMERIC))
				{
					
					double numericValue = c.getNumericCellValue();
					
					int v = (int)numericValue;
					
					String value = Integer.toString(v);
					
					System.out.println(value);
					
				}
				}
				}
				
				wb.close();
			}
			
			
			public static void all_Row_Data() throws IOException {
				
		        File f = new File("C:\\Users\\ram\\eclipse-workspace\\March22_PC\\Test_Cases\\TestCase_Demo1.xlsx");
				
				FileInputStream fis = new FileInputStream(f);
				
				Workbook wb = new XSSFWorkbook(fis);
				
				Sheet s = wb.getSheetAt(0);
				
				int lastRowNum = s.getLastRowNum();
				
				int numberOfRows = s.getPhysicalNumberOfRows();
				
				
				System.out.println("Inclusive of header:"+ numberOfRows);
				
				System.out.println("No. of Rows:" + lastRowNum);
				
				short lastCellNum = s.getRow(0).getLastCellNum();
				
				System.out.println("No. of cells:"+lastCellNum);
				
				for(int i = 1; i<=lastRowNum;i++) {
					
					Row row = s.getRow(i);
					for(int j = 0;j<lastCellNum; j++) {
						
						Cell cell = row.getCell(j); 
						
						DataFormatter dft = new DataFormatter();
						
						String value = dft.formatCellValue(cell);
						
						System.out.println(value);
					}
					
				}
				wb.close();			
		
	}
			

			public static void paticular_Row_Data() throws IOException {
				
		        File f = new File("C:\\Users\\ram\\eclipse-workspace\\March22_PC\\Test_Cases\\TestCase_Demo1.xlsx");
				
				FileInputStream fis = new FileInputStream(f);
				
				Workbook wb = new XSSFWorkbook(fis);
				
				Sheet s = wb.getSheetAt(0);
				
				Row row = s.getRow(1);
					
					for (int i = 0; i < 2; i++) {
						Cell cell = row.getCell(i);
                        DataFormatter dft = new DataFormatter();
						
						String value = dft.formatCellValue(cell);
						System.out.println(value);
					}
					
					wb.close();
					
				}

            public static void paticular_Column_Data() throws IOException {
				
		        File f = new File("C:\\Users\\ram\\eclipse-workspace\\March22_PC\\Test_Cases\\TestCase_Demo1.xlsx");
				
				FileInputStream fis = new FileInputStream(f);
				
				Workbook wb = new XSSFWorkbook(fis);
				
				Sheet s = wb.getSheetAt(0);
				
				Row row = s.getRow(1);
				
				for(int i = 0; i<s.getPhysicalNumberOfRows(); i++) {
					
					Row r = s.getRow(i);
					
					Cell c= r.getCell(0);
					
					CellType type = c.getCellType();
					
					if(type.equals(CellType.STRING)) {
						
						String value = c.getStringCellValue();
						System.out.println(value);
					}
					
					else if (type.equals(CellType.NUMERIC))
					{
						
						double numericValue = c.getNumericCellValue();
						
						int v = (int)numericValue;
						
						String value = Integer.toString(v);
						
						System.out.println(value);
						
					}
					}
					
					wb.close();
					
            }
	
	public static void main(String[]args) throws IOException {
        System.out.println("*****Particular Cell Data*****");
		particular_Cell_Date();	
		
		
		System.out.println("\n***All Data***");
		all_Data();
	
		
		System.out.println("\n******Particular_Row_Data******");
		paticular_Row_Data();
		
		System.out.println("\n******Particular_Column_Data******");
		paticular_Column_Data();
		
		
	}

}





//System.out.println("\n******All row data******");
//all_Row_Data();