package Workbook;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class Jxl {
public static void main(String[] args) throws Exception {
	FileInputStream fi=new FileInputStream("E:\\\\exel\\\\vinodbargale.xls");
	Workbook wb=Workbook.getWorkbook(fi);
Sheet st=wb.getSheet(0);
System.out.println(st.getCell(0, 2).getContents());
int row=st.getRows();
System.out.println(row);
int col=st.getColumns();
System.out.println(col);
/*
int row1=2;
String s1=st.getCell(0, row1).getContents();
String s2=st.getCell(1, row1).getContents();
String s3=st.getCell(2, row1).getContents();
String s4=st.getCell(3, row1).getContents();
System.out.println(s1+"||"+s2+"||"+s3+"||"+s4);*/
 
for(int i=1;i<row;i++) {
	
	String s1=st.getCell(0, i).getContents();
	String s2=st.getCell(1, i).getContents();
	String s3=st.getCell(2, i).getContents();
	String s4=st.getCell(3, i).getContents();
	System.out.println(s1+"||"+s2+"||"+s3+"||"+s4);
}


	
	
}
}
