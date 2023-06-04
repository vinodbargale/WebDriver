package com_Roug;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmLinks {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","F://geckodriver//geckodriver.exe ");
	WebDriver driver=new FirefoxDriver();
driver.get("https://www.amazon.in/");
 List<WebElement> link=driver.findElements(By.tagName("a"));
 
 for(WebElement All:link) {
	 System.out.println(All.getText());
 }
 
 
 
  }
}

