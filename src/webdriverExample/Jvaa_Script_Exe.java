package webdriverExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
public class Jvaa_Script_Exe {
	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver","F:\\ChromeDriver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("nareshit");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("nareshit");
	//	driver.findElement(By.name("Submit")).click();
WebElement loginbtn=driver.findElement(By.name("Submit"));		
JavascriptExecutor executor=(JavascriptExecutor)driver;
executor.executeScript("arguments[0].click();", loginbtn);
	Thread.sleep(4000)	;
	System.out.println("login completed");
	
	
	WebElement logout=driver.findElement(By.linkText("Logout"));
	JavascriptExecutor executor1=(JavascriptExecutor)driver;
	executor1.executeScript("arguments[0].click();", logout);
	driver.close();
	}

}
