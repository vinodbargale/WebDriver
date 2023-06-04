package VINOD;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class All_Links 
{
public static void main(String[] args) {
	
	System.setProperty("webdriver.gecko.driver","F:\\geckodriver\\geckodriver.exe" );
	WebDriver driver=new FirefoxDriver();
	driver.navigate().to("https://www.amazon.in/?tag=admpdesktopin-21&ref=pd_sl_e09cefe3b2db0088c0fa7805a2bbf09bd5c935a9ba37171dd3d98ae5&mfadid=adm");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
/*WebElement element=	driver.findElement(By.linkText("Laptops"));
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].scrollIntoView(true);",element);
	
	
	//jse.executeScript("window.scrollTo(0,1000)");
System.out.println("scroll completed");*/
 WebElement element=driver.findElement(By.name("field-keywords"));	
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].value='Iphone'", element);
	WebElement element1=driver.findElement(By.id("nav-search-submit-button"));	
	JavascriptExecutor jse1=(JavascriptExecutor)driver;
	jse1.executeScript("arguments[0].click();", element1);
	
	WebElement element2=driver.findElement(By.linkText("/a"));	
	JavascriptExecutor jse2=(JavascriptExecutor)driver;
	jse2.executeScript("arguments[0].click();", element2);
	System.out.println("click");
}
}