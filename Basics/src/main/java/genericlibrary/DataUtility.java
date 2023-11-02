package genericlibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility {
	
	public String getDatafromExcel(String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException
	{
	FileInputStream fis = new  FileInputStream("C:\\Users\\sarvesh\\Documents\\selenium\\demo.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh = book.getSheet(sheetName);
	String value = sh.getRow(rowNum).getCell(cellNum).toString();
	return value;	
	}
   public String getDataFromProperties(String key) throws IOException
   {
	   FileInputStream fis = new FileInputStream("C:\\Users\\sarvesh\\Documents\\selenium\\testdata.properties");
	   Properties pobj = new Properties();
	   pobj.load(fis);
	   String value = pobj.getProperty(key);
	   return value;
	   }
}
