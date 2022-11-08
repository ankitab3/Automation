package excelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.formula.WorkbookDependentFormula;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataInToExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./src/test/resources/Testdata.xlsx");
		
		Workbook wb=WorkbookFactory.create(fis);
		
		Sheet sheet=wb.getSheet("Sheet1");
		
		Row row=sheet.createRow(4);
		Cell cell1=row.createCell(0);
		Cell cell2=row.createCell(1);
		
		cell1.setCellValue("Anki");
		cell2.setCellValue("546238");
		
		FileOutputStream fos=new FileOutputStream("./src/test/resources/Testdata.xlsx");
		wb.write(fos);
		wb.close();
	}

}
