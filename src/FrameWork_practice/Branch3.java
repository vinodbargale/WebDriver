package FrameWork_practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Branch3 {
	
	
	
	

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver","F:\\ChromeDriver\\chromedriver.exe")	;	
		WebDriver driver=new ChromeDriver()	;
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(4000);
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		Thread.sleep(4000);
		driver.findElement(By.name("txtPasswords")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(4000);	
		System.out.println("login completed");	
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("logout completed");
		driver.close();
	}

}
