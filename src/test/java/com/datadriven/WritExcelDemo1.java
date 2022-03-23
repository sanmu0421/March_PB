package com.datadriven;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritExcelDemo1 {

	public static void main(String[] args) throws IOException {
	
		XSSFWorkbook wb= new XSSFWorkbook();
		
		XSSFSheet s = wb.createSheet("Emp Info");
		
	   Object empdata[][]= {    {"EmpID","Name", "Job"},
			                    {101,"Dravid","Engineer"},
	                            {102,"Smith","Manager"},
	                            {103,"Pavi","Analyst"}	   
                        };	   
	   //Using for loop
	   int rows = empdata.length;
	   int columns=empdata[0].length;
	   System.out.println(rows);  //4
	   System.out.println(columns); //3
	   
	   
	   for(int r=0;r<rows;r++)
	   {
		 XSSFRow row = s.createRow(r);
		 
        for(int c=0;c<columns;c++)	
        {
        	XSSFCell cell = row.createCell(c);
        Object value= empdata[r][c];
        
        if(value instanceof String)
        	cell.setCellValue((String)value);
        if(value instanceof Integer)
        	cell.setCellValue((Integer)value);
        if(value instanceof Boolean)	
        	cell.setCellValue((Boolean)value);
	
        }
	   }
	   String filePath=".\\datafiles\\employee.xlsx";
	   FileOutputStream fos= new FileOutputStream(filePath);
	   wb.write(fos);
	   
	   fos.close();
	   
	   System.out.println("Employee.xls file written successfully...");
	   
	   
	   
	}
}



