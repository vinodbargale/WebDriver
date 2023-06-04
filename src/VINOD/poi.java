package VINOD;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class poi {
	public static void main(String[] args) throws Exception {
		
	
	FileInputStream file=new FileInputStream("C:\\Users\\DELL\\Desktop\\VinTester.xlsx ");
	
	XSSFWorkbook wb=new XSSFWorkbook(file);
	
	XSSFSheet st=wb.getSheet("Sheet1");
	
	int rowcount=st.getLastRowNum();
	
	
	
	
	
	
	
	for(int i=1;i<=rowcount;i++)
	{
		Row r = st.getRow(i);
		
		Cell c1 = r.getCell(0);
		Cell c2 = r.getCell(1);
		Cell c3 = r.getCell(2);
		Cell c4 = r.getCell(3);
		
		String empid =  c1.getStringCellValue();
		double empname = c2.getNumericCellValue();
		//double sal = c3.getNumericCellValue();
		//boolean status = c4.getBooleanCellValue();
	    String sal = c3.getStringCellValue();
	double status = c4.getNumericCellValue();
	
		System.out.println(empid+"  "+empname+"  "+sal+"  "+status);
	}
	System.out.println(st.getRow(4).getCell(3));
	
	XSSFCell cell=st.getRow(3).getCell(3);
	cell.setCellValue("my love");
	
	file.close();
	
	
	FileOutputStream out=new FileOutputStream("C:\\Users\\DELL\\Desktop\\VinTester.xlsx");
	wb.write(out);
	out.close();
	
	System.out.println(cell.getStringCellValue());
	
	

}
}