package VINOD;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "F://ChromeDriver//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//self
		driver.get("https://www.facebook.com/campaign/landing.php");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']/parent::*/parent::*/child::div[1]/div/div[1]")).sendKeys("1234");
	/*String text=	driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[7]/td[1]/a/self::a")).getText();
	System.out.println(text);
	
	//parent
	String text1=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[7]/td[1]/a/parent::td ")).getText();
	
	
	
	System.out.println(text1);
	//child
	// List<WebElement>list=driver.findElements(By.xpath("[@id=\"leftcontainer\"]/table/tbody/tr[66]/td[1]/ancestor::tr/child::td"));
//System.out.println(list.size());	
	
	//ancestor parent parent
String ans=	driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[129]/td[1]/a/ancestor::tr")).getText();
	System.out.println(ans);
	
	//descendant    grandchildren
List<WebElement>list=	driver.findElements(By.xpath("//a[contains(text(),'NCC')]/ancestor::tr/descendant::td"));
System.out.println(list.size());


List<WebElement>foll=driver.findElements(By.xpath("//a[contains(text(),'NCC')]/ancestor::tr/following::*"));
foll.size();*/
	}

}
