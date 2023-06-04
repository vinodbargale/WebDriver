package VINOD;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class ScreenShots
{
public static void main(String[] args) throws Exception
{
	
	System.setProperty("webdriver.chrome.driver","F://ChromeDriver//chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("http://183.82.103.245/nareshit/login.php");
	driver.manage().window().maximize();
//WebElement scr=	 driver.findElement(By.xpath("html");
	TakesScreenshot f1 = (TakesScreenshot)driver;
	File sc=f1.	getScreenshotAs(OutputType.FILE);
	File sss=new File("E:\\Elementphoto12.png");
	FileUtils.copyFile(sc,sss);
			
	driver.close();
	
	//To take a element screen shot
	/*WebElement ele=	 driver.findElement(By.xpath("/html/body/form/table[1]/tbody/tr/td[2]/table/tbody/tr[1]/td[2]/img"));
	
	File sc=ele.	getScreenshotAs(OutputType.FILE);
	File scr=new File("E:\\Elementphoto.png");
	FileUtils.copyFile(sc,scr);*/
	
}
	
	
	
	

}
