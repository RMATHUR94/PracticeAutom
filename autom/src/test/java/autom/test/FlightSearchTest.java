package autom.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;

import autom.BaseT.BaseTest;
import autom.pages.FlightSearch;

public class FlightSearchTest extends BaseTest
{
    public void init() throws IOException
    {
    	String From = null;
    	String Dest = null;
    	String MonthToBeSelected = null;
    	String DAY = null;
    	
    	FileInputStream fStream = new FileInputStream(new File("/home/vyrazu-66/Documents/gobibo.xlsx"));
    	XSSFWorkbook workbook = new XSSFWorkbook(fStream);
    	XSSFSheet sheet = workbook.getSheetAt(0);
    	XSSFRow  row   = sheet.getRow(1);		
    	XSSFCell cell1 = row.getCell(0);
        XSSFCell cell2 = row.getCell(1);
//        XSSFCell cell3 = row.getCell(7);
//        XSSFCell cell4 = row.getCell(8);
//        XSSFCell cell5 = row.getCell(9);
//    	
        
         From = cell1.toString();
         Dest = cell2.toString();
         
         
         fStream.close();
         workbook.close();
         
         FlightSearch fs1 = PageFactory.initElements(driver, FlightSearch.class);
         fs1.searchFlight(From, Dest, MonthToBeSelected, DAY);
    }
    
   
    
    
}
