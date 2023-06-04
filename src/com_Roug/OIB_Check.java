package com_Roug;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OIB_Check
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","F://ChromeDriver//chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://183.82.103.245:8888/BankingProject/LoginForm.jsp");
	//login
	driver.findElement(By.name("username")).sendKeys("nareshit");
	driver.findElement(By.name("password")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	 
	Actions ac=new Actions(driver);
	ac.moveToElement(driver.findElement(By.id("link1"))).perform();
	Thread.sleep(3000);
	ac.moveToElement(driver.findElement(By.id("menuItem1"))).perform();
	driver.findElement(By.id("menuItem1")).click();
//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Thread.sleep(3000);
	
	for(int i=1;i<=10;i++)
	{
driver.findElement(By.xpath
("/html/body/table/tbody/tr/td/table[3]/tbody/tr/td/center/h3/form/table/tbody/tr["+i+"]/td[1]/input")).click();
///html/body/div/div[2]/form/table/tbody/tr["+i+"]/td[1]/input	




System.out.println("click onbox:"+i);
		
	}
	
	
}
}
