package webdriverExample;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.kenai.jffi.Main;

public class TO_GET_MULTIFRAME {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","F://geckodriver//geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://183.82.103.245/nareshit/login.php");
	
	
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("txtUserName"))).sendKeys("nareshit");

	
	//driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	
	WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(20));
	wait1.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("txtPassword")))).sendKeys("nareshit");
	
	WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(20));
	wait2.until((ExpectedConditions.elementToBeClickable(By.name("Submit")))).click();
	
	
	List<WebElement>frameList=driver.findElements(By.id("rightMenu"));
	int totalframe=frameList.size();
	System.out.println(totalframe);
	
	
	//WebElement log=driver.findElement(By.linkText("Logout"));
	WebDriverWait wait3=new WebDriverWait(driver, Duration.ofSeconds(20));
	wait3.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout"))).click();
	
	//wait.until(ExpectedConditions.visibilityOf(log)).click();
	System.out.println("logout competed");
	
	
	
	
	
	}

}
