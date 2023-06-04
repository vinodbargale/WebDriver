package webdriverExample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.python.modules.thread.thread;

import Practice1.Java_Script_Excecutor;

public class JavaScriptScreen {
	WebDriver driver;
	JavascriptExecutor jse;
	
public void launch() throws Exception {
	
	System.setProperty("webdriver.chrome.driver","F://ChromeDriver//chromedriver.exe" );
	
	driver=new ChromeDriver();
	driver.navigate().to("https://login.salesforce.com/");
	Thread.sleep(3000);
	driver.manage().window().maximize();
}
	
	public void click () throws Exception {
		
		WebElement login_click=driver.findElement(By.id("pwcaps"));
		
		jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", login_click);
		Thread.sleep(3000);
		System.out.println("click");
		
		
	}
	
	
	
	
	public void sendData() throws Exception {
		
		WebElement userName=driver.findElement(By.id("username"));
		
		
		jse=(JavascriptExecutor)driver;
		jse.executeScript("document.getElementById(' username').value='abc@gmail.com';");
		//jse.executeScript("arguments[0].value='vinod'", userName);
		Thread.sleep(3000);
		System.out.println("data entred");
		
		WebElement pass=driver.findElement(By.id("password"));
		jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='binod'", pass);
		Thread.sleep(3000);
		System.out.println("data entred");

	}
	
	public void Highhilight() {
		WebElement pass1=driver.findElement(By.id("password"));
		jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].setAttribute('style','background: pink;border: 2px solid red;');",pass1);
		
	}
	public void Scroll() {
	WebElement link=driver.findElement(By.linkText("Try for Free"));
	jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].scrollIntoView(true);", link);	
	System.out.println("Scroll com");	
	}
	
 	
	
	public void up_down() throws Exception {
		jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)");
				
		System.out.println("complete");
		
		Thread.sleep(3000);
		
		jse.executeScript("window.scrollBy(0,-300)");
		System.out.println("done");
		
		
	}
	public void rightclick() {
		WebElement username=driver.findElement(By.id("username"));
	Actions ac=new Actions (driver);
	ac.contextClick(username).build().perform();
	
	System.out.println("Right click done");
	}
	
	public void doubbleclick() {
		
		WebElement btn=driver.findElement(By.name("rememberUn"));
	Actions ac=new Actions(driver);
	ac.doubleClick(btn).build().perform();
	System.out.println("doubble click");
		
	}
	public void scroll_bottom() throws Exception {
		jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,document.bodyscrollHeight)");
		Thread.sleep(3000);
		
	//	jse.executeScript("window.scrollTo(document.bodyscrollHeight,0)");
		System.out.println("scroll");
		
		
	}  
	
	public void title() {
		jse=(JavascriptExecutor)driver;
	String title=	jse.executeScript("return document.title").toString();
		System.out.println(title);
		
	}
	public void pagesource() {
		jse=(JavascriptExecutor)driver;
		String title=	jse.executeScript("return document.documentElement.innerText;").toString();
		System.out.println(title);
		
	}
 	public void  Refresh() {
		jse=(JavascriptExecutor)driver;
		jse.executeScript("history.go(0);");
		System.out.println("refresh");
		 
	}
	
	public void customalert() throws InterruptedException  {
		jse=(JavascriptExecutor)driver;
		jse.executeScript("alert('welcome to amazon mr karan');");
		Thread.sleep(3000);
		System.out.println("alert creted");
		
	//	document.getElementById("username").value='abc@gmail.com';
		//document.getElementsByClassName("input r4 wide mb16 mt8 username")[0].value='xyz2gmail.com';
	}
	
		
	
	
	
	
	 
	
	
	public void close() {
		
		driver.close();
	}
	
	public static void main(String[] args) throws Exception {
		
		JavaScriptScreen obj=new JavaScriptScreen();
		obj.launch();
		obj.click();
		//obj.sendData();
		//obj.Highhilight();
		
		//obj.rightclick();
		//obj.doubbleclick();
	//	obj.Scroll();
	//	obj.up_down();
		
		//obj.scroll_bottom();
		obj.title();
		//obj.pagesource();
		obj.Refresh();
		obj.customalert();
		//obj.close();
	}
	
}

