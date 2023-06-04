package webdriverExample;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class jxl_Excel{

	public static void main(String[] args) throws Exception{ 
	
	FileInputStream file=new FileInputStream("C:\\Users\\DELL\\Desktop\\vinodbargale.xls");	
	Workbook wb=Workbook.getWorkbook(file);
	Sheet st=wb.getSheet(0);
	
	int row=2;
	String empId=st.getCell(0, row).getContents();
	String empname=st.getCell(1, row).getContents();
	String empnum=st.getCell(2, row).getContents();
	String empmail=st.getCell(3, row).getContents();
	System.out.println(empId+"||"+empname+"||"+empnum+"||"+empmail);
	
	}

}
