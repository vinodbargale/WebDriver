package webdriverExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class One {
	public static void main(String[] args) throws Exception {
		
		
		FileInputStream f1=new FileInputStream("C:\\Users\\DELL\\Desktop\\Aunty.xlsx");
		
		Workbook wb=new XSSFWorkbook(f1);
		
		wb.createSheet("demo sheet");
		wb.createSheet("test sheet");
		
		FileOutputStream fo=new FileOutputStream("C:\\Users\\DELL\\Desktop\\Uncle.xlsx ");
	wb.write(fo);
	wb.close();
	

		
		
	}

}
