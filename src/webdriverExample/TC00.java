package webdriverExample;
import org .openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org .openqa.selenium.By;

public class TC00 
{
public static void main(String[] args) throws Exception
{ 
System.setProperty("webdriver.chrome.driver","F:\\\\chromeDriver\\\\chromeDriver.exe");
WebDriver vinod=new	ChromeDriver();
vinod.navigate().to("http://183.82.103.245/nareshit/login.php");
Thread.sleep(3000);
vinod.findElement(By.name("txtUserName")).sendKeys("nareshit");
Thread.sleep(3000);
vinod.findElement(By.name("txtPassword")).sendKeys("nareshit");
Thread.sleep(3000);
vinod.findElement(By.name("Submit")).click();
Thread.sleep(3000);
vinod.findElement(By.name("clear")).clear();
Thread.sleep(3000);
vinod.close();

}
}
