package Automation.Page;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Registerdata {

	public static Object[][] data() throws IOException
	{
		Object obj[][]= new String[1][10];
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\git\\AutomationPracticeTB18A\\AutomationProjectTB18A\\src\\test\\resources\\GitRegister.xlsx");
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("Sheet1");
		
		for(int i=0;i<1;i++) {
			Row row = sheet.getRow(i+1);
			for(int j=0;j<10;j++)
			{
				Cell cell = row.getCell(j);
				obj[i][j]=cell.getStringCellValue();
				System.out.println(obj[i][j]);
			}
			
		}
		return obj;
		
	}
public static void main(String[] args) throws IOException {
		
		data();
	}
	
	
		
	
}
