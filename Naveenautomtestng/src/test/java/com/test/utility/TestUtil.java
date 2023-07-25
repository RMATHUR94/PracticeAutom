package com.test.utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

import org.apache.poi.xssf.eventusermodel.XSSFReader;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFCreationHelper;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestUtil {

static XSSFReader reader;

  public static ArrayList<Object[]> getDataFromExcel() throws IOException
  {
	  
	  ArrayList<Object[]> myData = new ArrayList<Object[]>();
	  
//	  reader = new XSSFReader();
      XSSFReader xssfReader = new XSSFReader("/home/vyrazu-66/Documents/Syseclipse/Naveenautomtestng/src/test/java/com/testdata/testdata.xlsx");

	  
	  
//	  
//	  FileInputStream fis = new FileInputStream("/home/vyrazu-66/Documents/Syseclipse/Naveenautomtestng/src/test/java/com/testdata/testdata.xlsx");
//	  XSSFWorkbook workbook = new XSSFWorkbook(fis);
//	  XSSFSheet sheet = workbook.getSheetAt(0);
	  
	  for(int rowNum = 2 ; rowNum <= reader.getRowCount("RegTestData"); rowNum ++)
	  {
		  String firstname = reader.getCellData("RegTestData" , "firstname",rowNum);
		  String lastname = reader.getCellData("RegTestData" , "lastname",rowNum);
		  String email = reader.getCellData("RegTestData" , "email",rowNum);
		  int contactno = reader.getCellData("RegTestData" , "contactno",rowNum);
		  String password =reader.getCellData("RegTestData" , "password",rowNum);
		  String confirm_password = reader.getCellData("RegTestData" , "confirm_password",rowNum);
		  
		  Object ob[] = {firstname ,lastname,email,contactno,password,confirm_password};
		  myData.add(ob);
	  }
	  return myData;
   }
   
}
