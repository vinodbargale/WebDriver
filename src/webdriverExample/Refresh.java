package webdriverExample;


import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Refresh {
	
	public static void main(String[] args)  {
	System.setProperty("webdriver.gecko.driver","F://geckodriver//geckodriver.exe" );
	WebDriver driver=new FirefoxDriver();
	
	driver.get("http://183.82.103.245/nareshit/login.php");
	driver.navigate().refresh();
	driver.navigate().to(driver.getCurrentUrl());
	
	
	
	String url=driver.getCurrentUrl();
	
	driver.get(url);
	driver.navigate().to(url);
//	System.out.println(url);
	System.out.println("refresh");
	
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.location.reload(true)");
	System.out.println("jse refresh");
	
	JavascriptExecutor jse1=(JavascriptExecutor)driver;
	jse1.executeScript("history.go(0);");
	
/*	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_F5);
	r.keyRelease(KeyEvent.VK_F5);
	System.out.println("key refresh");
	*/
	
	
	Actions ac=new Actions(driver);
	ac.sendKeys(Keys.F5).build().perform();
	System.out.println("Action refresh");
	
	
	
	}

}
