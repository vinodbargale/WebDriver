package webdriverExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading {
	public static void main(String[] args) throws Exception, IOException {
	FileInputStream fileinput=new FileInputStream("E:\\writedata\\Vinod11.xlsx");	
	XSSFWorkbook workbook=new XSSFWorkbook(fileinput);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	System.out.println(sheet.getSheetName());
	System.out.println(sheet.getLastRowNum());
	System.out.println("before updating cell Data");
	System.out.println("Before updating Cell Data "+
            sheet.getRow(2).getCell(1));
	// write the data
	XSSFCell cell=sheet.getRow(2).getCell(1);
	cell.setCellValue("vinod");
	fileinput.close();
	FileOutputStream fileOut=new 	FileOutputStream("E:\\writedata\\Vinod11.xlsx");
		workbook.write(fileOut);
		System.out.println("updated data after write is done"+cell.getStringCellValue());
	
	}}
