package excelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	FileInputStream fis=new FileInputStream("./src/test/resources/Testdata.xlsx");
	
	Workbook wb=WorkbookFactory.create(fis);
	
	Sheet sheet=wb.getSheet("Sheet1");
	
	DataFormatter df=new DataFormatter();
	String[][] arr=new String[sheet.getLastRowNum()+1][sheet.getRow(3).getLastCellNum()+1];
	
	for(int i=0;i<=sheet.getLastRowNum();i++)
	{
		for(int j=0;j<=sheet.getRow(i).getLastCellNum();j++)
		{
			arr[i][j]=df.formatCellValue(sheet.getRow(i).getCell(j));//0,1

		}
	}
	
	for(int i=0;i<=sheet.getLastRowNum();i++)
	{
		for(int j=0;j<=sheet.getRow(i).getLastCellNum();j++)
		{
			System.out.println(arr[i][j]+"\t");
		}
		System.out.println();
	}
	wb.close();
	}

}
