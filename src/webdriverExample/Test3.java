package webdriverExample;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test3 {
	public static void main(String[] args) throws Exception {
		
		FileInputStream f1=new FileInputStream("C:\\Users\\DELL\\Desktop\\Employee.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f1);
		XSSFSheet st=wb.getSheet("Sheet1");
		int row=st.getLastRowNum();
		int col=st.getRow(0).getLastCellNum();
		System.out.println(row);
		System.out.println(col);
		
		System.out.println("cell:"+st.getRow(1).getCell(1));
		
	//read from pertilar row	
		XSSFRow r=st.getRow(1);
		
		XSSFCell c1=r.getCell(0);
		XSSFCell c2=r.getCell(1);
		XSSFCell c3=r.getCell(2);
		XSSFCell c4=r.getCell(3);
		
		String empid=c1.getStringCellValue();
		String ename=c2.getStringCellValue();
	double sal=c3.getNumericCellValue();
	boolean status=c4.getBooleanCellValue();
	System.out.println(empid+""+ename+""+sal+""+status);
	
	
		
		
		for(int i=1;i<=row;i++){
			XSSFRow rr=st.getRow(i);
			XSSFCell a=rr.getCell(0);
			XSSFCell b=rr.getCell(1);
			XSSFCell c=rr.getCell(2);
			XSSFCell d=rr.getCell(3);
			String aa =  a.getStringCellValue();
			String bb = b.getStringCellValue();
			double cc = c.getNumericCellValue();
			boolean dd = d.getBooleanCellValue();

			System.out.println(aa+" "+bb+" "+cc+" "+dd);
			
		}
				
				
		
		
	}

}
