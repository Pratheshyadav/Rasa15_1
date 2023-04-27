package com.demowebshop.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel implements Frames_constant
{
	public static Object[][] exedata(String sheet) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\Selenium.xlsx\\");
		Sheet sht = WorkbookFactory.create(fis).getSheet(sheet);
		int act_row=sht.getPhysicalNumberOfRows();
		int act_cell = sht.getRow(0).getPhysicalNumberOfCells();
		Object[][] arr=new Object[act_row-1][act_cell];
		for(int i=0;i<act_row-1;i++)
		{
			for(int j=0;j<act_cell;j++)
			{
				Row row = sht.getRow(i+1);
				Cell cell = row.getCell(j);
				arr[i][j]=cell.toString();
			}
		}
		return arr;
		
		
		
		
		
	}
}
