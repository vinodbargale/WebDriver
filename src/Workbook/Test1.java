package Workbook;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test1 {
public static void main(String[] args) throws Exception {
		
		FileInputStream f1=new FileInputStream("C:\\Users\\DELL\\Desktop\\Employee.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f1);
		XSSFSheet st=wb.getSheet("Sheet1");
		int row=st.getLastRowNum();
		int col=st.getRow(0).getLastCellNum();
		System.out.println(row);
		System.out.println(col);
		
		System.out.println("cell:"+st.getRow(1).getCell(1));
		
		XSSFRow r=st.getRow(2);
		try
		{
			XSSFCell c = r.getCell(1);
			String data = c.getStringCellValue();
			System.out.println(data);
		} catch (Exception e) 
		{
			System.out.println("no data found!");
		}

}
}
