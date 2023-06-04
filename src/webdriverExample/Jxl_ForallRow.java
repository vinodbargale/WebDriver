package webdriverExample;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class Jxl_ForallRow {
public static void main(String[] args) throws Exception{
	FileInputStream file=new FileInputStream("C:\\Users\\DELL\\Desktop\\vinodbargale.xls");
	Workbook wb=Workbook.getWorkbook(file);
	Sheet st=wb.getSheet(0);
	int rowCount=st.getRows();
	System.out.println(rowCount);
	for(int i=1;i<rowCount;i++) {
		String empid=st.getCell(0, i).getContents();
		String name=st.getCell(1, i).getContents();
		String email=st.getCell(2, i).getContents();
		String no=st.getCell(3, i).getContents();
		System.out.println(empid+"||"+name+"||"+email+"||"+no); 
	}

		
	}
}

