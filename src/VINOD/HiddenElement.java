package VINOD;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElement {
	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver","F:\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();
driver.findElement(By.id("hide-textbox")).click();//hide
//driver.findElement(By.id("displayed-text")).sendKeys("v");

     JavascriptExecutor jse=(JavascriptExecutor)driver;
     jse.executeScript("document.getElementById('displayed-text').value='ssjks';");
     System.out.println("vallue entred");
}
}