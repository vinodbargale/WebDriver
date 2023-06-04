import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webtable {
public static void main(String[] args) {
	
	System.setProperty("webdriver.gecko.driver", "F:\\geckodriver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("file:///F:/web/WebTable.html");

	int row= driver.findElements(By.tagName("tr")).size();
	System.out.println(row);
	
	
	
	WebElement curtable =  driver.findElement(By.id("idCourse"));
	List<WebElement> rows = curtable.findElements(By.tagName("tr"));
	
	System.out.println("Count of Rows: "+rows.size());
	
	
	
	// to count column
int col=	driver.findElements(By.xpath("/html/body/table/tbody/tr[1]/td")).size();
	System.out.println("the no column is :"+col);
	
	WebElement table=driver.findElement(By.id("idCourse"));
	List<WebElement>rowm=table.findElements(By.tagName("tr"));
	
	List<WebElement>colm=rowm.get(1).findElements(By.tagName("td"));
	
	System.out.println("count of coumn:"+colm.size());
	
	
	
	// the number of cell
	int row_col=driver.findElements(By.xpath("/html/body/table/tbody/tr/td")).size();
	System.out.println("the total no of row and col:"+row_col);
	
	
	
	
	//to read special cell data
	
String data=	driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[3]")).getText();
System.out.println(data);	



//Script to read data present in a specified Table Row


WebElement tab=driver.findElement(By.id("idCourse"));

List<WebElement> row1=tab.findElements(By.tagName("tr"));
List<WebElement>col1=row1.get(1).findElements(By.tagName("td"));

String s=col1.get(0).getText();
String course=col1.get(1).getText();
String ins=col1.get(2).getText();
 String date=col1.get(3).getText();

System.out.println(s+" "+course+" "+ins+" "+date);


/*
 * for(int i=1;i<=row;i++) { String
 * full_data=driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]")).
 * getText(); System.out.println(full_data); } System.out.println();
 */

//Script to Read All Rows of Data Present in a WebTable

WebElement table1=driver.findElement(By.id("idCourse"));
List<WebElement>rowf=table1.findElements(By.tagName("td"));

for(int i=1;i<rowf.size();i++) {
	
	List<WebElement> colf=rowf.get(i).findElements(By.tagName("td"));
	
	String ss=colf.get(0).getText();
	String course1=colf.get(1).getText();
	String ins1=colf.get(2).getText();
	String date1=colf.get(3).getText();
	System.out.println(ss+" "+course1+" "+ins1+" "+date1);
	
	
	
}


}
}
