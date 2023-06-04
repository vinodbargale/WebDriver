package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Retviewebtable {
	public static void main(String[] args) {
     System.setProperty("webdriver.gecko.driver", "F://geckodriver//geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///F:/web/WebTable.html");
		/*int row=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr")).size();
		System.out.println(row);
		int column =driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[1]/td")).size();
		System.out.println(column);
		int r_c=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr/td")).size();
		System.out.println(r_c);
	String cell=driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[7]/td[4]")).getText();
		System.out.println(cell);
		for(int z=2;z<=row;z++) {
			String data=driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr["+z+"]")).getText();
			System.out.println("data:"+data);
		}
			*/

			WebElement currtable=driver.findElement(By.id("idCourse"));
			List<WebElement> rows=currtable.findElements(By.tagName("tr"));
			
			System.out.println("table row is"+rows.size());	
			
			
			List<WebElement> columns=rows.get(1).findElements(By.tagName("td"));
			System.out.println("Table columns is:"+columns.size());
			
			
			for(int i=1;i<rows.size();i++) {
				List<WebElement> col=rows.get(i).findElements(By.tagName("td"));
				String srNo=col.get(0).getText();
				String couNme=col.get(1).getText();
				String InName=col.get(2).getText();
				String stdate=col.get(3).getText();
				System.out.println(srNo+" "+couNme+" "+InName+" "+stdate);
					
					
				}
				
				
			}
		
		}
		
	


