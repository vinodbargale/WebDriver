import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileDownload {
public static void main(String[] args) {
	ChromeOptions option=new ChromeOptions();
	HashMap<String,Object> chromePrefs=new HashMap<String,Object>();
	
	
	
	
	System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://omayo.blogspot.com/p/page7.html");
	driver.findElement(By.linkText("ZIP file")).click();
}
}
