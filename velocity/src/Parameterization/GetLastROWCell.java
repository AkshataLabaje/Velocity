package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetLastROWCell {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Nikheel\\Documents\\Book1.xlsx");
		int lastROWNumber = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		System.out.println(lastROWNumber+1);
	}

}
