package VINOD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigateto 
{
public static void main(String[] args) throws InterruptedException
{
	//System.setProperty("webdriver.gecko.driver", "F:\\geckodriver\\geckodriver.exe");
	
	System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	driver.navigate().to("http://183.82.103.245/nareshit/index.php");
	
	Thread.sleep(3000);
	
	driver.manage().deleteAllCookies();
	

/*driver.navigate().back();
Thread.sleep(3000);
driver.navigate().forward();
Thread.sleep(2000);
driver.navigate().refresh();*/
}
}
