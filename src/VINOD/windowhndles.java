package VINOD;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhndles
{
	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver","F:\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("file:///F:/multiple%20folder/multiplewindows.html");// first default window will be open
driver.findElement(By.id("btn1")).click();
driver.findElement(By.id("btn2")).click();

     String defaultw=driver.getWindowHandle();
     
                    Set<String> allwindows = driver.getWindowHandles()  ;
                    Iterator <String> itr=allwindows.iterator();
     itr.next();// for !st window
   String  childwindow=itr.next();
   driver.switchTo().window(childwindow);
   driver.close();
   driver.switchTo().window(defaultw);
   driver.close();
     System.out.println("wnodow hndle of:"+defaultw);
     System.out.println("child window:"+childwindow);
	}
}