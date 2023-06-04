package webdriverExample;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;




public class Fluent1 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","F://ChromeDriver//chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("http://183.82.103.245/nareshit/login.php");
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("txtUserName")))).sendKeys("nareshit");
	
	String s=driver.findElement(By.name("txtUserName")).getAttribute("value");
	
	System.out.println(s);
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	
	
	
//	WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(20));
//	wait1.until(ExpectedConditions.elementToBeClickable(By.linkText("Logout"))).click();
//	wait1.until(ExpectedConditions.visibilityOfElementLocated((By.linkText("Logout")))).click();
//System.out.println("logout completed");*/
	
	
	/*
	 * Wait<WebDriver>wait3=new FluentWait<WebDriver>(driver)
	 * .withTimeout(Duration.ofSeconds(60)) .pollingEvery(Duration.ofSeconds(6))
	 * .ignoring(NoSuchElementException.class);
	 * 
	 * 
	 * WebElement foo=wait3.until(new Function<WebDriver,WebElement>(){ public
	 * WebElement apply(WebDriver driver) { return
	 * driver.findElement(By.linkText("Logout")).click();
	 * 
	 * }} ); return WebElement;
	 */
	
}
}
