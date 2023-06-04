 package webdriverExample;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;



public class Fluentwait
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","F://Chromedriver//chromedriver.exe ");
	WebDriver driver=new ChromeDriver();
	driver.get("https://google.com");
	driver.findElement(By.name("q")).sendKeys("Abcd");
	driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	
	//driver.findElement(By.linkText("American-Born Confused Desi - Wikipedia"));
	
	
	
	
	
	Wait<WebDriver>wait=new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(60))
			.pollingEvery(Duration.ofSeconds(5))
			.ignoring(NoSuchElementException.class);

WebElement foo=wait.until(new Function<WebDriver,WebElement>(){
	public WebElement apply(WebDriver driver) {
		return driver.findElement(By.linkText("American-Born Confused Desi - Wikipedia"));
	
}}	
);
	
}
}

