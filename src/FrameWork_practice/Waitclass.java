package FrameWork_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import Practice1.Java_Script_Excecutor;

public class Waitclass {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","F://geckodriver//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		//driver.get("http://google.com");
		
		
		
		driver.navigate().to("http://google.com");
		//driver.manage().window().minimize();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	String title = driver.getTitle();
	
	System.out.println(title);
	
	String url = driver.getCurrentUrl();
	System.out.println(url);
	
//	String page = driver.getPageSource();
//	System.out.println(page);
	
	/*
	 * driver.findElement(By.id("APjFqb")).sendKeys("selenium"); String value =
	 * driver.findElement(By.id("APjFqb")).getAttribute("value");
	 * System.out.println(value);
	 */
 JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeAsyncScript("loaction.reload()");
			
	
	
	System.out.println("ref");
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(20));
		 * wait1.until(ExpectedConditions.visibilityOfElementLocated(By.name(
		 * "txtUserName"))).sendKeys("nareshit"); String
		 * s=driver.findElement(By.name("txtUserName")).getAttribute("value");
		 * 
		 * WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(20));
		 * wait2.until(ExpectedConditions.visibilityOfElementLocated(By.name(
		 * "txtPassword"))).sendKeys("nareshit");
		 */


		//	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//  wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name
		//("Submit")))).click();


		/*
		 * FluentWait<WebDriver> wait5=new FluentWait<WebDriver>(driver)
		 * .withTimeout(Duration.ofSeconds(20)) .pollingEvery(Duration.ofSeconds(5))
		 * .ignoring(NoSuchElementException.class);
		 * 
		 * // wait5.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(
		 * "Logout"))).click();
		 * 
		 * WebElement foo=wait5.until(new Function<WebDriver,WebElement>(){
		 * 
		 * public WebElement apply(WebDriver driver) { (By.linkText("Logout")).c }
		 * 
		 * 
		 * });
		 * 
		 * 
		 * 
		 * System.out.println("fluentwaitexecuted");
		 */

	}

}
