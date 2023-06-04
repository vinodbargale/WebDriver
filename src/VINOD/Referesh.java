package VINOD;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Referesh
{
public static void main(String[] args) throws Exception
{
	System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("http://183.82.103.245/nareshit/index.php");
	//driver.get(driver.getCurrentUrl());
	
//Thread.sleep(3000);
	//driver.navigate().to(driver.getCurrentUrl());
	
/*Actions ac=new Actions(driver);
	ac.sendKeys(Keys.F5).build().perform();
	System.out.println("refresh");*/
	
	JavascriptExecutor jse=JavascriptExecutor(driver);
	jse.executeScript("history.go(0)");
	System.out.println("refresh");
	}

private static JavascriptExecutor JavascriptExecutor(WebDriver driver) {
	// TODO Auto-generated method stub
	return null;
}

}
