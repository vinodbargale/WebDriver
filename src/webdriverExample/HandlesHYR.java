package webdriverExample;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlesHYR {
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver","F://geckodriver//geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
String parentwinodow=driver.getWindowHandle();
System.out.println("parentwindow:"+parentwinodow);


driver.findElement(By.id("newWindowBtn")).click();

 Set<String> handles=driver.getWindowHandles();
 
 for(String handle:handles) {
	 
	 if(!handle.equals(parentwinodow)) {
		 driver.switchTo().window(handle);
		 
		driver.findElement(By.name("fName")).sendKeys("vinod"); 
		Thread.sleep(3000);
		driver.close();
	 }
	// System.out.println(handle);
 }
 driver.switchTo().window(parentwinodow);
 driver.findElement(By.id("name")).sendKeys("vinodreddy");

Thread.sleep(3000);
driver.close();
		
		
	}

}
