package webdriverExample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll
{public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver","F:\\ChromeDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	JavascriptExecutor ex=(JavascriptExecutor)driver;
	ex.executeScript("Window.scrollBy(0,900)");
	System.out.println("scroll complete");
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	System.out.println(driver.getTitle());
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	JavascriptExecutor ec=(JavascriptExecutor)driver;
	ec.executeScript("window.scrollBy(0,900)");
	System.out.println("scroll complete");
	
	
}
}