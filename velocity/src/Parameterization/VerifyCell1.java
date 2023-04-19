package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class VerifyCell1 {
	
		public static void main(String[] args) throws EncryptedDocumentException, IOException {
			
		FileInputStream file = new FileInputStream("C:\\Users\\Nikheel\\Documents\\Book1.xlsx");
		
		CellType CT = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(0).getCellType();
		
		System.out.println(CT);
		}

}
