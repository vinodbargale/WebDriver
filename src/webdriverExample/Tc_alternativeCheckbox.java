package webdriverExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_alternativeCheckbox {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","F:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
driver.switchTo().frame("rightMenu");
for(int i=1;i<=10;i=i+2) {
	driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr["+i+"]/td[1]/input")).click();
	//for(int=1;i<=10;i++)used for simultenious click
	System.out.println("clicked on checkbox of:"+i);
}
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Logout")).click();
System.out.println("logout co mpleted");
driver.close();
		
	}
	
}
