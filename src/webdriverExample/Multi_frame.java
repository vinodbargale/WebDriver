package webdriverExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multi_frame {
public static void main(String[] args) throws Exception {
System.setProperty("webdriver.gecko.driver","F://geckodriver//geckodriver.exe");

WebDriver driver=new FirefoxDriver();
driver.get("https://www.selenium.dev/selenium/docs/api/java/overview-summary.html");
Thread.sleep(3000);
driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[2]/ul[1]/li[1]/a")).click();
driver.switchTo().frame("packageListFrame");
driver.findElement(By.linkText("org.openqa.selenium")).click();
System.out.println("click"); 

driver.switchTo().defaultContent();


driver.switchTo().frame("packageFrame");
driver.findElement(By.xpath("/html/body/main/div/section[1]/ul/li[13]/a/span")).click();
////html/body/main/div/section[1]/ul/li[13]/a/span
System.out.println("enter 2 frame");
driver.switchTo().defaultContent();


driver.navigate().
}
}
