package webdriverExample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class practpoi {
	public static void main(String[] args) throws Exception {
		FileInputStream file=new FileInputStream("C:\\Users\\DELL\\Desktop\\VinTester.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet st=wb.getSheet("Sheet1");
		System.out.println(st.getSheetName());
		System.out.println(st.getLastRowNum());
		
		System.out.println("Before updating Cell Data "+
               st.getRow(4).getCell(0));
		
		Row row=st.getRow(0);
		System.out.println(row.getLastCellNum());
		
		
		
	XSSFCell cell=st.getRow(1).getCell(1);
	cell.setCellValue("Pawan");
	/*XSSFCell cell1=st.getRow(2).getCell(2);
	cell.setCellValue("Amit");*/
	
	
	CellStyle passstyle = wb.createCellStyle();
	passstyle.setFillForegroundColor(IndexedColors.BRIGHT_GREEN.getIndex());
	passstyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	
	cell.setCellStyle(passstyle);
	
	/*XSSFCell cell1=st.getRow(3).getCell(2);
	cell1.setCellValue("Amit");
	
	CellStyle passstyle1 = wb.createCellStyle();
	passstyle.setFillForegroundColor(IndexedColors.DARK_RED.getIndex());
	passstyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	cell.setCellStyle(passstyle1);*/
	
	
	
	
	
	
	file.close();
	FileOutputStream out=new FileOutputStream("C:\\Users\\DELL\\\\Desktop\\VinTester.xlsx");
	
	wb.write(out);
	
	System.out.println("updated data after writin is:"+cell.getStringCellValue());
	
	//System.out.println("updated data after writin is:"+cell1.getStringCellValue());
	out.close();

}
}