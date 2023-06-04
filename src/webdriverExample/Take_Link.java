package webdriverExample;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Take_Link {
public static void main(String args[]) throws Exception{
    //Test Steps
System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("  http://183.82.103.245/nareshit/login.php");
List<WebElement> links = driver.findElements(By.tagName("a"));
for(WebElement alllinks:links) {
    System.out.println(alllinks.getText());
    Thread.sleep(3000);

}
}}