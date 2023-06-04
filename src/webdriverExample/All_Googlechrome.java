package webdriverExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_Googlechrome {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","F:\\ChromeDriver\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	
	driver.navigate().to("https://www.google.com");
	List <WebElement>link=driver.findElements(By.tagName("a"));
	for(WebElement allinks:link) {
		System.out.println(allinks.getText() );
	}

	
		
	}

}
