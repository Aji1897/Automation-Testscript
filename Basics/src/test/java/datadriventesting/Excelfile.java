package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelfile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
	
FileInputStream fis = new FileInputStream("C:\\Users\\sarvesh\\Documents\\selenium\\demo.xlsx");
Workbook book = WorkbookFactory.create(fis);
Sheet sh = book.getSheet("Sheet1");
//to access row
//Row row = sh.getRow(0);
//to access cell
//Cell cell = row.getCell(0);
//to fetch data in string format
//System.out.println(cell.getStringCellValue());
System.out.println(sh.getRow(0).getCell(0).toString());
System.out.println(sh.getRow(1).getCell(0).toString());
System.out.println(sh.getRow(2).getCell(1).toString());




	}

}
