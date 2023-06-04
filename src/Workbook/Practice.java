package Workbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practice {
	public static void main(String[] args) throws Exception {
		FileInputStream file=new FileInputStream("C:\\\\Users\\\\DELL\\\\Desktop\\\\Employee.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(file);
	XSSFSheet st=wb.getSheet("Sheet1");
	
	
int row=	st.getLastRowNum();
		System.out.println(row);
		
	/*	int col=st.getRow(1).getLastCellNum();
		System.out.println(col);*/
		
		XSSFRow r1=st.getRow(0);
		int col=r1.getLastCellNum();
		
		XSSFRow r2=st.getRow(2);
		int col2=r2.getLastCellNum();
		System.out.println(col);
		System.out.println(col2);
		
	//Read data for perticular cell
		System.out.println(st.getRow(1).getCell(2));
		System.out.println(st.getRow(5).getCell(1));
		
	
	//Read data from perticular row	
	/*	XSSFRow ro=st.getRow(5);
		
		XSSFCell c1=ro.getCell(0);
		XSSFCell c2=ro.getCell(1);
		XSSFCell c3=ro.getCell(2);
		XSSFCell c4=ro.getCell(3);
		
		String empid=c1.getStringCellValue();
		String ename=c2.getStringCellValue();
		double sal=c3.getNumericCellValue();
		boolean status=c4.getBooleanCellValue();
		
		System.out.println(empid+" ||"+ename+"||"+sal+"||"+status);*/
		
		//Read data from all sheet

	/*	for(int i=1;i<row;i++) {
			
			XSSFRow ro=st.getRow(i);
			
			XSSFCell c1=ro.getCell(0);
			XSSFCell c2=ro.getCell(1);
			XSSFCell c3=ro.getCell(2);
			XSSFCell c4=ro.getCell(3);
			
			String empid=c1.getStringCellValue();
			String ename=c2.getStringCellValue();
			double sal=c3.getNumericCellValue();
			boolean status=c4.getBooleanCellValue();
			
			System.out.println(empid+" ||"+ename+"||"+sal+"||"+status);*/
			
			//Write a data
			
		XSSFRow ro=st.getRow(3);
		XSSFCell c1=ro.createCell(6);
		c1.setCellValue("Hii Vinod");
		file.close();
		FileOutputStream fo=new FileOutputStream("C:\\Users\\DELL\\Desktop\\Employee.xlsx");
		wb.write(fo);
		wb.close();
		fo.close();
		//System.out.println(st.getRow(3).getCell(6));
		
		
		XSSFRow r3=st.getRow(3);
		XSSFCell c=r3.getCell(6);
		String up=c.getStringCellValue();
		System.out.println(up);
		
		
		
		}
		
	}
	
	


