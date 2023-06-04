package webdriverExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Window_Handlers {
	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver","F:\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/multiple%20folder/multiplewindows.html");
		Thread.sleep(3000);
		driver.findElement(By.id("btn1")).click();
		System.out.println("window 1 open");
		/*driver.findElement(By.id("btn2")).click();
		System.out.println("window 2 open");
		Thread.sleep(4000);
		driver.findElement(By.id("btn3")).click();
		System.out.println("winow 3 opened");
		Thread.sleep(4000); 
		ArrayList<String> win=new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(win.get(1));
	System.out.println(win);
		Thread.sleep(4000);
		driver.quit();*/
		
		String win=driver.getWindowHandle();
		System.out.println(win);
		System.out.println(driver.getTitle());
		driver.quit();
	/*	Set <String> win=driver.getWindowHandles() ;
		Iterator<String> it=win.iterator();
		String parwin=it.next();
		String chilwin=it.next();
		System.out.println(parwin);
System.out.println(chilwin);*/

}}
  