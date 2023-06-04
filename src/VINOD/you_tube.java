package VINOD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class you_tube
{
public static void main(String[] args)
{
	
	System.setProperty("webdriver.chrome.driver","F:\\ChromeDriver\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("you tube");
	driver.findElement(By.id("searchbox-searchbutton")).click();
	
}
}
