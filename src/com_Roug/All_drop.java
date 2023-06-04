package com_Roug;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class All_drop {
	
	
		public static void main(String[] args)throws Exception {
			System.setProperty("webdriver.chrome.driver","F:\\ChromeDriver\\chromedriver.exe" )	;
			WebDriver driver=new ChromeDriver();
			driver.navigate().to(" http://183.82.103.245/nareshit/login.php");
			driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
			driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
			 
			driver.findElement(By.name("Submit")).click();
			System.out.println("login completed");
			Thread.sleep(3000);
			driver.switchTo().frame("rightMenu");
			
			System.out.println("enter in the frame");
			
			Select st=new Select(driver.findElement(By.name("loc_code")));
			
			
			
			
			List<WebElement> drop=st.getOptions();
			
			for(WebElement all:drop) {
				System.out.println(all.getText());
				Thread.sleep(3000);
			}
		
	}

}
