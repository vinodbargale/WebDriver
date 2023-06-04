package VINOD;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Actions;


public class Keydwnkeyup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().to("http://omayo.blogspot.com/");
		//WebElement cc=driver.findElement(By.linkText("compendiumdev"));
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("compendiumdev"))).keyDown(Keys.CONTROL).click()
         .keyUp(Keys.CONTROL).build().perform();
		
		//driver.findElement(By.linkText("compendiumdev")).sendKeys(Keys.CONTROL);
		
	
	}

}
