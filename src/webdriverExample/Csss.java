package webdriverExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Csss {
	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","F://geckodriver//geckodriver.exe" );
	WebDriver driver=new FirefoxDriver();
	driver.navigate().to("https://www.facebook.com/login/");
	//tag and id
	//driver.findElement(By.cssSelector("#email")).sendKeys("gjhgjg");
		//driver.findElement(By.cssSelector("input#email")).sendKeys("vinod");
	
	
		
	//tag and class	
		//driver.findElement(By.cssSelector("input.inputtext" )).sendKeys("bar");
	
	//tag and attribute
	
//	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("kar");
	//driver.findElement(By.cssSelector("button[type='submit']")).click();
	
	//ttag,class and attribute;
	//driver.findElement(By.cssSelector("input.inputtext[placeholder='Email address or phone number']")).sendKeys("css");
//	driver.findElement(By.cssSelector("input.inputtext[aria-label='Password']")).sendKeys("jbkjknk");
	
	//driver.findElement(By.cssSelector("input.inputtext ")).sendKeys("123");
	driver.findElement(By.cssSelector("input[type$='text']")).sendKeys("lovvvguruah");
	driver.findElement(By.cssSelector("input[type^='password'")).sendKeys("bhar");
	
	
	}
	
	

}
