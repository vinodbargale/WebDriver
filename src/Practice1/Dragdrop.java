package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.testng.Assert.assertEquals;
public class Dragdrop {
public static void main(String[] args)throws Exception {
	System.setProperty("webdriver.chrome.driver","F:\\ChromeDriver\\chromedriver.exe" );
	WebDriver driver= new ChromeDriver();
	driver.navigate().to("https://jqueryui.com/droppable/");
	assertEquals(driver.getTitle(),"Droppable | jQuery UI");
	System.out.println("title matched");
	Thread.sleep(3000);
	driver.switchTo().frame(0);
	Actions ac=new Actions(driver);
	ac.dragAndDrop(driver.findElement(By.id("draggable")), 
			driver.findElement(By.id("droppable"))).build().perform();
	Thread.sleep(4000);
	System.out.println("drag and drop");
	driver.close();
}
}
//import

