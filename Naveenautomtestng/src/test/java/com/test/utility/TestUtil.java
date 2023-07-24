package com.test.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.excel.utility.Xls_Reader;

public class TestUtil {
	
  public static ArrayList<Object[]> getDataFromExcel() throws IOException
  {
	  
	  ArrayList<Object[]> myData = new ArrayList<Object[]>();
	  
	  FileInputStream fis = new FileInputStream("/home/vyrazu-66/Documents/Syseclipse/Naveenautomtestng/src/test/java/com/testdata/testdata.xlsx");
	  XSSFWorkbook workbook = new XSSFWorkbook(fis);
	  XSSFSheet sheet = workbook.getSheetAt(0);
	  
	  for(int rowNum = 2 ; rowNum <= sheet.; rowNum ++)
	  {
		  
	  }
   }
    return myData;
}
