package Workbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//writing data into excel sheet cell
public class Writtingdata {
	public static void main(String[] args) throws Exception {
		FileInputStream file= new FileInputStream("C:\\Users\\DELL\\Desktop\\Employee.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet st=wb.getSheet("Sheet1");
		
	XSSFRow r=st.getRow(3);
	XSSFCell c=r.createCell(6);
	c.setCellValue("vinodbargale");

	CellStyle passstyle =wb.createCellStyle();
	passstyle.setFillForegroundColor(IndexedColors.BRIGHT_GREEN.getIndex());
	passstyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	c.setCellStyle(passstyle);
	
	
	
	FileOutputStream fout =new FileOutputStream("C:\\Users\\DELL\\Desktop\\Employee1.xlsx");
	wb.write(fout);
	System.out.println(c.getStringCellValue());
	wb.close();
		
	}

}
