package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebUpload1 {
	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver","F:\\ChromeDriver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/web/WebTable.html");
		int row=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr")).size();
		System.out.println(row);
		int column=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[1]/td")).size();
		System.out.println(column);
		int row_column=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr/td")).size();
		System.out.println(row_column);
		
		
		String cell=driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[2]/td[2]")).getText()	;	
		System.out.println(cell);
		
		for(int i=1;i<=row;i++) {
			String data=driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr["+i+"]")).getText();
			Thread.sleep(4000);
			System.out.println(data);
		}
	}

}
