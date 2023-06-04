package Practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\ChromeDriver\\chromedriver.exe" )	;
		WebDriver driver=new ChromeDriver();
		
	driver.navigate().to("https://www.google.com");
	
	List<WebElement> list=driver.findElements(By.tagName("a"));
	for(WebElement lists:list) {
		System.out.println(lists.getText());
	}
	
	
	}

}
