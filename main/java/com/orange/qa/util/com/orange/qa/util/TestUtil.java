package com.orange.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.orange.qa.base.TestBase;

public class TestUtil  extends TestBase{
	public static long PAGE_LOAD_TIMEOUT =30;
	   	public static long IMPLICIT_WAIT=30;
	   	
	   	
	   	public static String TESTDATA_SHEET_PATH="/Users/richabharti/Desktop/AutomationFramwork/automation/src/"
	   			+ "main/java/com/orange/qa/pages/testdata/OrangeHRMTestData.xlsx";

	   	static Workbook book;
	   	static Sheet sheet;
	   	
	  //read exel file
	   	
	   	public static Object[][] getTestData(String sheetName){
	   		FileInputStream file=null;
	   		try {
				file= new FileInputStream(TESTDATA_SHEET_PATH);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   		try {
				book=WorkbookFactory.create(file);
			} catch (EncryptedDocumentException e) {
				  // TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   		sheet= book.getSheet(sheetName);
	   		
	   		Object[][] data= new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	   		for(int i=0; i< sheet.getLastRowNum();i++) {
	   			for(int k=0; k< sheet.getRow(0).getLastCellNum();k++) {
	   				data[i][k]=sheet.getRow(i+1).getCell(k).toString();
	   			}
	   		}
	   		return data;
	   			}
	   	
}
