package webdriverExample;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test1 {
	public static void main(String[] args) throws Exception {
FileInputStream f1=new FileInputStream("E:\\exel\\vinodbargale.xlsx");		
FileInputStream f2=new FileInputStream("E:\\exel\\shiv.xlsx");

XSSFWorkbook wb1=new XSSFWorkbook(f1);
XSSFWorkbook wb2=new XSSFWorkbook(f2);

XSSFSheet st=wb1.createSheet("Demosheet");
XSSFSheet st2=wb2.createSheet("SampleSheet");

FileOutputStream fo1=new FileOutputStream("C:\\Users\\DELL\\Desktop\\Karan.xlsx");
wb1.write(fo1);
wb1.close();
FileOutputStream fo2=new FileOutputStream("C:\\Users\\DELL\\Desktop\\Kiran.xlsx");
wb2.write(fo2);
wb2.close();



				
	}


}
