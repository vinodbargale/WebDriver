  package webdriverExample;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	import static org.testng.Assert.assertEquals;
	public class Dragdrop{
	public static void main(String args[]) throws Exception{
	    //Test Steps
	System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	
	assertEquals(driver.getTitle(),"Droppable | jQuery UI");
	//	assertEquals(driver.getTitle(),"Droppable | jQuery UI");
	//Verify Title: stop exe in case of cond failed: Assert stmt
	System.out.println("Title matched");
	Thread.sleep(5000);
	driver.switchTo().frame(1);
	
	System.out.println("Switched to Frame");
	Actions ac = new Actions(driver);
	ac.dragAndDrop(driver.findElement(By.id("draggable")),
	               driver.findElement(By.id("droppable"))).perform();
	Thread.sleep(4000);
	System.out.println("Drag&Drop");
	driver.close();
}
	}
