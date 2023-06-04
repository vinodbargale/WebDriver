package webdriverExample;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test2 {
	public static void main(String[] args) throws Exception {
		FileInputStream f1=new FileInputStream("C:\\Users\\DELL\\Desktop\\XL\\Mahesh.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f1);
		XSSFSheet st=wb.getSheet("Sheet1");
	int  Total_row=	st.getLastRowNum();
	System.out.println(Total_row);
	
	XSSFRow row= st.getRow(0);
    Short row1=	row.getLastCellNum();
    System.out.println(row1);
    
   XSSFRow row2=st.getRow(1);
    Short row3=row2.getLastCellNum();
    System.out.println(row3);
	
	wb.close();
	}

}
