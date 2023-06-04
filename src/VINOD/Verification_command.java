package VINOD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification_command {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://ChromeDriver//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://tutorialsninja.com/demo/index.php?route=account/login");
		
		WebElement btn=driver.findElement(By.xpath("//input[@type='submit']"));
		if(btn.isDisplayed()) {
			System.out.println("btn is present");
		}
		else {
			System.out.println("btn is not displlyed ");
		}
		
		if(btn.isEnabled()) {
			System.out.println("btn is enable");
		}
		else {
			System.out.println("btn is not enable");
		}
		if(driver.findElements(By.xpath("//input[@value='Login']")).size()!=0) {
			System.out.println("element is present");
		}
		else {
			System.out.println("Element is notpresent");
		}
		if(driver.getTitle().equals("Account Login")) {
			System.out.println("mached");
		}
		else {
			System.out.println("not matched");
		}
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}

}
