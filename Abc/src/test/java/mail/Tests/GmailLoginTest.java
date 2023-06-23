package mail.Tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import mail.Pages.GmailLogin;
import mail.TestComponents.BaseTest;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class GmailLoginTest extends BaseTest
{
	
	@Test
	 public void init() throws FileNotFoundException
	 {
		  String emailId = null ;
		  String password = null ;
		  
		  try {
		  FileInputStream fstream = new FileInputStream(new File("/home/vyrazu-66/Documents/testfakecred.xlsx"));
		  
		  XSSFWorkbook workbook = new XSSFWorkbook(fstream);
		  
		  XSSFSheet sheet = workbook.getSheetAt(0);
		  
		  XSSFRow row = sheet.getRow(1);
		  XSSFCell cell1 = row.getCell(0);
		  XSSFCell cell2 = row.getCell(1);
		  
		  emailId = cell1.toString();
		  password = cell2.toString();
		  
		  System.out.println(emailId);
		  System.out.println(password);
		  fstream.close();
		  workbook.close();
				
		  }
		  catch(Exception e)
		  {
			  e.printStackTrace();
		  }
		  
//		  GmailLogin loginpage = new GmailLogin(driver);
//		  PageFactory.initElements(driver, loginpage);
//        both meaning is same
		  
		  GmailLogin loginpage = PageFactory.initElements(driver,GmailLogin.class);
		  loginpage.perFormLogin(emailId, password);
//		  loginpage.verifyLogin();
		  
		  
	 }
}
