package Practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Wait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\ChromeDriver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		
		//condition
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(4));
	//	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("Submit"))));
	//	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	//	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	//	driver.findElement(By.name("Submit")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("Submit"))));
		
		
	}

}
