package webdriverExample;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readallpoi {
	
	
	public static void main(String[] args) throws Exception {
		
		
		FileInputStream file=new FileInputStream("C:\\Users\\DELL\\Desktop\\VinTester.xlsx ");
		
		XSSFWorkbook wb=new XSSFWorkbook(file);
		
		XSSFSheet st=wb.getSheet("Sheet1");
		
		int rowcount=st.getLastRowNum();
		
		
		
		
		
		
		
		for(int i=1;i<=rowcount;i++)
		{
			//Row r = st.getRow(i);
			
			//Cell c1 = r.getCell(0);
		String	 empid = st.getRow(0).getCell(rowcount).getStringCellValue();
		String empname = st.getRow(1).getCell(rowcount).getStringCellValue();
		String sal= st.getRow(2).getCell(rowcount).getStringCellValue();
		String status = st.getRow(3 ).getCell(rowcount).getStringCellValue();
			
			/*String empid =  c1.getStringCellValue();
			double empname = c2.getNumericCellValue();
			//double sal = c3.getNumericCellValue();
			//boolean status = c4.getBooleanCellValue();
		    String sal = c3.getStringCellValue();
		double status = c4.getNumericCellValue();*/
		
			System.out.println(empid+"  "+empname+"  "+sal+"  "+status);
		}

}
}