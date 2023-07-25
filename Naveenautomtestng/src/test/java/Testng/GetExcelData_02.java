package Testng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class GetExcelData_02 {

	@DataProvider(name ="excel-data")
	public Object[][] excelDP() throws IOException
	{
		Object[][] arrObj = getExcelData("home/vyrazu-66/Documents/Testdata03.xlsx" ,"Sheet1");
		return arrObj;
	}
	
	
	public Object[][] getExcelData(String filename,String sheetName) throws IOException
	{
		Object[][] data = null;
		Workbook wb = null;
		
		FileInputStream fis = new FileInputStream(filename);
		String fileExtensionName = filename.substring(filename.indexOf("."));
		
		if(fileExtensionName.equals(".xlsx"))
			wb = new XSSFWorkbook(fis);
		else if(fileExtensionName.equals(".xls"))
		{
			wb = new HSSFWorkbook(fis);
		}
		
		org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet(sheetName);
		Row row =  sh.getRow(0);
		
		int noOfRows = sh.getPhysicalNumberOfRows();
		int noOfCols = row.getLastCellNum();
		Cell cell;
		data = new Object[noOfRows - 1][noOfCols];
		
		for(int i = 1 ; i < noOfRows ; i++ )
		{
			for(int j = 0 ; j < noOfCols ; j++)
			{
				row = sh.getRow(i);
				cell = row.getCell(j);  //1,0
				
				switch(cell.getCellType())
				{
				case STRING :
					data[i - 1][j] = cell.getStringCellValue();
					break;
				case NUMERIC:
					data[i - 1][j] = (int)cell.getNumericCellValue();
					break;
				case BLANK:
					data[i - 1][j] = "";
				default:
					data[i - 1][j] =null;
					break;

				}
			}
		}
		return data;
	}
}
