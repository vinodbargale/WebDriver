package VINOD;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JAVAScriptExecutor {	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","F:\\ChromeDriver\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("http://183.82.103.245/nareshit/login.php");
	WebElement  user=driver.findElement(By.name("txtUserName"));
	WebElement pass=driver.findElement(By.name("txtPassword"));
	WebElement in=driver.findElement(By.name("Submit"));
	
	
	
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	
	executor.executeScript("arguments[0].value='nareshit'", user);
	
	JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	executor1.executeScript("arguments[0].value='nareshit'", pass);
	JavascriptExecutor executor3 = (JavascriptExecutor)driver;
	executor3.executeScript("arguments[0].click();",in);
	WebElement logout=driver.findElement(By.linkText("Logout"));
	JavascriptExecutor executor2=(JavascriptExecutor)driver;
	executor2.executeScript("arguments[0].click();", logout);
	
	
}
}
