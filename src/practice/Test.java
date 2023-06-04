package practice;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver","F:\\geckodriver\\geckodriver.exe")	;	
		WebDriver driver=new FirefoxDriver()	;
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("file:///F:/multiple%20folder/multiplewindows.html");
	

driver.findElement(By.id("btn1")).click();
System.out.println("window 1 open");
driver.findElement(By.id("btn2")).click();
System.out.println("window 2 open");
Thread.sleep(4000);
/*driver.findElement(By.id("btn3")).click();
System.out.println("winow 3 opened");
Thread.sleep(4000); driver.findElement(By.id("btn1")).click();
		System.out.println("window 1 open");
		/*driver.findElement(By.id("btn2")).click();
		System.out.println("window 2 open");
		Thread.sleep(4000);
		driver.findElement(By.id("btn3")).click();
		System.out.println("winow 3 opened");
		Thread.sleep(4000);*/ 


ArrayList<String>win=new ArrayList<>(driver.getWindowHandles());
driver.switchTo().window(win.get(1));
System.out.println(win);




}}