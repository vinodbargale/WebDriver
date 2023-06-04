package webdriverExample;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
public class TC002_Chrome_Browser
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.gecko.driver", 	
			"F:\\geckodriver\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	
}
}