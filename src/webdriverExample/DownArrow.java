package webdriverExample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
public class DownArrow {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.findElement(By.name("username")).sendKeys("Admin");
System.out.println("user name entered");
driver.findElement(By.name("password")).sendKeys("admin123");
Thread.sleep(4000);
		
	}

}
 