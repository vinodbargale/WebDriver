import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().to("http://omayo.blogspot.com/");
		driver.findElement(By.id("uploadfile")).sendKeys("E:\\download (1).jpg");
		System.out.println("file uploded");
	}

}
