package webdriverExample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001_Login_logout
{
public static void main(String[] args)throws Exception
{
System.setProperty("webdriver.chrome.driver", 	
		"F:\\ChromeDriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
Thread.sleep(3000);
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
Thread.sleep(3000);
driver.findElement(By.name("Submit")).click();
driver.findElement(By.linkText("Logout")).click();
Thread.sleep(3000);
driver.close();

}
}
