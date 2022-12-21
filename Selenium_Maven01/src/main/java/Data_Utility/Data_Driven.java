package Data_Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data_Driven {
	public String excelFetch(String shName,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\manis\\eclipse-workspace\\Selenium_Maven01\\src\\test\\resources\\Excel\\Data_Driven1.xlsx");
		DataFormatter df = new DataFormatter();
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(shName);
		
		String data = df.formatCellValue(sh.getRow(row).getCell(cell));
		return data;
		
	}

}
