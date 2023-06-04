
package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandler {
	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver","F:\\ChromeDriver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/multiple%20folder/multiplewindows.html");
		Thread.sleep(4000);
		driver.findElement(By.id("btn1")).click();
		
		
	}

}
