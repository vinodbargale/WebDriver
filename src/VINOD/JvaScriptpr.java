package VINOD;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class JvaScriptpr {
	WebDriver driver;
	JavascriptExecutor jse;
	
public void launch()  {
	
	System.setProperty("webdriver.gecko.driver","F://geckoDriver//geckodriver.exe" );
	
	driver=new FirefoxDriver();
	driver.navigate().to("https://login.salesforce.com/");

	driver.manage().window().maximize();
}

public void click()  {
	WebElement login_click=driver.findElement(By.id("pwcaps"));
	
	jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();",login_click);
	}
public void setData() {
	WebElement userName=driver.findElement(By.id("username"));
	
	jse=(JavascriptExecutor)driver;
	jse.executeScript("document.getElementById('username').value='nareshit';", userName);
	//jse.executeScript("arguments[0].setAttribute('style','background:blue;border: 2px solid yellow;');", userName);
	//jse.executeScript("arguments[0].scrollIntoView(true);", userName);
	//jse.executeScript("window.scrollBy(0,400)");
	//System.out.println("complete");
	//jse.executeScript("window.scrollBy(0,-300)");
	//System.out.println("repeat scroll");
	
	//jse.executeScript("window.scrollTo(0,document.bodyscrollHeight)");
	//String tt=jse.executeScript("return document.documentElement.innerText;").toString();
	//jse.executeScript("history.go[0]");
//jse.executeAsyncScript("alert('welcome to saeforce vinod')");
//	Actions ac=new Actions(driver);
//	ac.doubleClick(userName).build().perform();
	
	//System.out.println("right");
	
}


public static void main(String[] args) {
	JvaScriptpr jj=new JvaScriptpr();
jj.launch();
	//jj.click();
	jj.setData();
	System.out.println("click work");
}
}
