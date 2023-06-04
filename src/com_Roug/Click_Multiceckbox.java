package com_Roug;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// click on multiple checkbox
public class Click_Multiceckbox 
{public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","F:\\ChromeDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	driver.switchTo().frame("rightMenu");
	
	for(int i=1;i<=10;i=i+2) {         ///html/body/table/tbody/tr/td/table[3]/tbody/tr/td/center/h3/form/table/tbody/tr[2]/td[1]/input
		driver.findElement(By.xpath("/html/body/div/div[2]/form/table/tbody/tr["+i+"]/td[1]/input")).click();
		System.out.println("click on:"+i);
	}
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("logout completed");
	driver.close();
	
	
	
	
}

}
