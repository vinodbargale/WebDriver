package webdriverExample;
//to take a data from single cell
import java.io.FileInputStream;


import jxl.Sheet;
import jxl.Workbook;

public class Excelread_JXL {
	public static void main(String[] args) throws Exception {
		FileInputStream file=new FileInputStream("E:\\exel\\vinodbargale.xls");
		Workbook wb =Workbook.getWorkbook(file);
		Sheet st=wb.getSheet(0);
		String firstCellData=st.getCell(0, 0).getContents();
		System.out.println("first cell value is:"+firstCellData);
		System.out.println("second cell value is:"+st.getCell(1, 0).getContents());
	System.out.println("third cell value is:"+st.getCell(3, 4).getContents());
	}

}
