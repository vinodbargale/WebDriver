package webdriverExample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
public class TC_KB_WD {
	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.gecko.driver","F://geckodriver//geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.navigate().to("https://www.google.com/");
Thread.sleep(4000);
driver.findElement(By.name("q")).sendKeys("selenium");
Thread.sleep(3000);
driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
Thread.sleep(4000);
driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//driver.close();
	}

}
