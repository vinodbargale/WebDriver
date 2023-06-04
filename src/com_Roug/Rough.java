package com_Roug;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Rough {
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.gecko.driver", "F://geckodriver//geckodriver.exe");
	
	
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("http://183.82.103.245/nareshit/login.php");
	//183.82.103.245/nareshit/login.php
	/*
	 * List<WebElement>list=driver.findElements(By.tagName("a")); int size=
	 * list.size(); System.out.println(size); for(WebElement link:list) {
	 * System.out.println(link.getText()); }
	 */
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	
	driver.switchTo().frame("rightMenu");
	/*
	 * Select st=new Select(driver.findElement(By.id("loc_code")));
	 * 
	 * List <WebElement>list=st.getOptions();
	 * 
	 * for(WebElement value:list) { System.out.println(value.getText()); }
	 */
	int box=driver.findElements(By.xpath("//input[@type='checkbox']")).size();
	
	System.out.println(box);
for(int i=1;i<=10;i=i+2) {
	driver.findElement(By.xpath("/html/body/div/div[2]/form/table/tbody/tr["+i+"]/td[1]/input")).click();
}
	
}
}
