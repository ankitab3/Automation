package excelFile;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//step1: convert physical file into java readable object
		FileInputStream fis=new FileInputStream("./src/test/resources/Testdata.xlsx");
//step 2: Open excel workbook	
Workbook wb=WorkbookFactory.create(fis);
		//step3: Get control over the sheet
		Sheet sheet=wb.getSheet("Sheet1");
		
		//step4: Get control over the row
		Row row=sheet.getRow(2);
		row=sheet.getRow(1);
		//step5: Get control over the cell
		Cell cell1=row.getCell(0);
		Cell cell2=row.getCell(1);
		
		//step6: Fetch the data from cell
		String un=cell1.getStringCellValue();
		double pwd=cell2.getNumericCellValue();
		System.out.println(un);
		System.out.println(pwd);
		
		//step7: close the workbook
		
		wb.close();
		
	}
	

}
