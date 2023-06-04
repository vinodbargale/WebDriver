package com_Roug;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wetable 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/web/WebTable.html");
		
		//To count row
	/*int row=	driver.findElements(By.xpath("//*[@id=\'idCourse\']/tbody/tr")).size();
	System.out.println(row);*/
		
		WebElement table=driver.findElement(By.xpath("//*[@id=\'idCourse\']"));
		List<WebElement> tr=table.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr"));
		System.out.println(tr.size());
		//To count coulumn
	int col=driver.findElements(By.xpath("//*[@id=\'idCourse\']/tbody/tr[1]/td")).size();
	System.out.println(col);
	
	//To get row& column
	int row_col=driver.findElements(By.xpath("//*[@id=\'idCourse\']/tbody/tr/td"))	.size();
	System.out.println(row_col);	
	}

}
