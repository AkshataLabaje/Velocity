package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AllDataCT {
	
		public static void main(String[] args) throws EncryptedDocumentException, IOException {
			
		FileInputStream file = new FileInputStream("C:\\Users\\Nikheel\\Documents\\Book1.xlsx");
		
		Sheet sheet1 = WorkbookFactory.create(file).getSheet("Sheet1");
		
		for (int j = 0; j <= sheet1.getRow(j).getLastCellNum()-1; j++)  {
		
		Cell cellinfo = sheet1.getRow(j).getCell(j);
		
		CellType CT = cellinfo.getCellType();
		
		if (CT == CellType.STRING)  {
			System.out.println(cellinfo.getStringCellValue()+" ");
		}
		else if ( CT == CellType.NUMERIC)    {
			System.out.println(cellinfo.getNumericCellValue()+" ");
		}
		else if (CT == CellType.BOOLEAN)   {
			System.out.println(cellinfo.getBooleanCellValue()+" ");
	
		}
			System.out.println();
		}
	}

}
