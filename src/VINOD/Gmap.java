package VINOD;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Gmap 
{
public static void main(String[] args) throws IOException
{
	System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/maps/");
	
	  
	
	driver.findElement(By.name("q")).sendKeys("Wankhede Stadium");
	driver.findElement(By.id("searchbox-searchbutton")).click();
	
	
	
	
	

	if(driver.getTitle().equals("Wankhede Stadium - Google Maps"))
{
		System.out.println("matched");
	}
else {
	System.out.println("title not match");
	System.out.println(driver.getTitle());
	}
	
	
	TakesScreenshot scr=(TakesScreenshot)driver;
	
	File sc=scr.getScreenshotAs(OutputType.FILE);
	File sss=new File("E:\\Gmap.png");
	FileUtils.copyFile(sc,sss);
	
/*	WebElement	w=driver.findElement(By.xpath("//*[@id=\"QA0Szd\"]/div/div/div[1]/div[2]/div/div[1]/div/div/div[2]/div[1]/div[1]/div[2]/div/div[2]/span[1]/span[1]/button"));
	if(w.getText().equals("stadium"))
	{
		System.out.println("text is verified");
	}
	else {
		System.out.println("text is not verified");*/
	
	Assert.assertTrue(driver.findElement(By.id("Pane")).getText().contains("Stadium"));
	
	
	
	
	
	driver.close();
	
	
	
	
	

}

}


