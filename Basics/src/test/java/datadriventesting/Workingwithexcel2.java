package datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Workingwithexcel2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\sarvesh\\Documents\\selenium\\demo.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		
		Sheet sh =book.getSheet("Sheet3");
		sh.createRow(0).createCell(0).setCellValue("Ajith kumaran");
		
		FileOutputStream fos = new FileOutputStream("C:\\\\Users\\\\sarvesh\\\\Documents\\\\selenium\\\\demo.xlsx");
		book.write(fos);
		fos.flush();
	}

}
