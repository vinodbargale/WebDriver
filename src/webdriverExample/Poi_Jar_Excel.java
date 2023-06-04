package webdriverExample;
import java.io.FileInputStream; //Read
import java.io.FileOutputStream;//Write
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Poi_Jar_Excel {
	 
 	public static void main(String args[]) throws Exception{
	    FileInputStream fileinput = new
 FileInputStream("C:\\Users\\DELL\\Desktop\\All excelpath\\vinodpoi.xlsx");
	    XSSFWorkbook workbook = new XSSFWorkbook(fileinput);
	    XSSFSheet sheet = workbook.getSheet("test");
	    System.out.println(sheet.getSheetName());
	    System.out.println(sheet.getLastRowNum());
	System.out.println("Before updating Cell Data "+
	                                      sheet.getRow(2).getCell(1));
	   
	//write a data to excel file
	/*XSSFCell cell=sheet.getRow(1).getCell(1);
	cell.setCellValue("Test123");
	fileinput.close(); 
	FileOutputStream fileOut=new	FileOutputStream("C:\\\\Users\\\\DELL\\\\Desktop\\\\vinodpoi.xlsx");
workbook.write(fileOut);
System.out.println("Updated data after write is done"+cell.getStringCellValue());
	
	fileOut.close();*/
	}
	}


 