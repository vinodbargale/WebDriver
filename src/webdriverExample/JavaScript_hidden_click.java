package webdriverExample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_hidden_click {
	WebDriver driver;
	JavascriptExecutor jse;
	
public void launch1() throws Exception {
	
	System.setProperty("webdriver.chrome.driver","F://ChromeDriver//chromedriver.exe" );
	
	driver=new ChromeDriver();
	driver.navigate().to("https://www.amazon.in/");
	Thread.sleep(3000);
	driver.manage().window().maximize();
}

public void click() {
	jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,500);");
	WebElement we=driver.findElement(By.className("landscape-image"));
	//WebElement we=driver.findElement(By.xpath("//img[@alt='BAGS & LUGGAGE']"));
	we.click();
	System.out.println("click done");
}
public static void main(String[] args) throws Exception {
	JavaScript_hidden_click  obj1=   new JavaScript_hidden_click();
	obj1.launch1();
	
	obj1.click();
	
	
}

}
//arguments[0].click();", login_click  click
//arguments[0].value='vinod'", userName
//arguments[0].setAttribute('style','background: pink;border: 2px solid red;');",pass1);
//arguments[0].scrollIntoView(true);", link
//window.scrollBy(0,400)   uup and down
 
//window.scrollTo(0,document.bodyscrollHeight

//("window.scrollTo(document.bodyscrollHeight,0)")
//("return document.title").toString();
//("return document.documentElement.innerText;").toString();
//("history.go(0);");
//("alert('welcome to amazon mr vinod');");
