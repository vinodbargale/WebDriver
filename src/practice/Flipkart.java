package practice;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Flipkart {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","F:\\geckodriver\\geckodriver.exe")	;	
		WebDriver driver=new FirefoxDriver()	;
	driver.get("http://183.82.103.245/nareshit/login.php");
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("txtUserName")))).sendKeys("nareshit");
	
	
	WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(20));
	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.name("txtPassword"))).sendKeys("nareshit");
	
	
	
	WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(40));
	wait3.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("Submit")))).click();
	
	//wait3.until(ExpectedConditions.visibilityOfElementLocated(By.name("Submit"))).click();
/*	
	Thread.sleep(3000);
	Actions ac=new Actions(driver);
	ac.moveToElement(driver.findElement(By.linkText("Admin"))).build().perform();
	System.out.println("mouse over completed");
	Thread.sleep(3000);
	ac.moveToElement(driver.findElement(By.linkText("Job"))).build().perform();
	ac.moveToElement(driver.findElement(By.linkText("Job Titles"))).click();
	
	/*
	 * Wait <WebDriver>wa=new FluentWait<WebDriver>(driver)
	 * .withTimeout(Duration.ofSeconds(20)) .pollingEvery(Duration.ofSeconds(4))
	 * .ignoring(NoSuchElementException.class);
	 * 
	 * wa.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout"))
	 * ).click(); System.out.println("Logout");
	 */
/*	driver.switchTo().frame("rightMenu");
	Wait <WebDriver>foo=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(20)).ignoring(NoSuchElementException.class);
	foo.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("loc_name")))).sendKeys("123");
	
	*/
	
	
	
	/*List<WebElement>list=driver.findElements(By.tagName("a"));
	
	for(WebElement all:list) {
		System.out.println(all.getText());
	}*/
	
	
	
/*	List<WebElement>list=driver.findElements(By.id("rightMenu"));
	int count=list.size();
	System.out.println(count);
	System.out.println(list);*/
	
	
	/*try{driver.switchTo().frame("rightMen");
	Select st=new Select (driver.findElement(By.name("loc_code")));
	st.selectByIndex(1);
 String mul=st.getFirstSelectedOption().getText();
	System.out.println(mul);
	}
	catch (Exception e){
	TakesScreenshot scr=(TakesScreenshot)driver;
	File f1=scr.getScreenshotAs(OutputType.FILE);
	File f2=new File("E://java.png");
	FileUtils.copyFile(f1, f2);
	}
	
*/	
	/*driver.switchTo().frame("rightMenu");
	for(int i=1;i<=10;i=i+2) {
		
		driver.findElement(By.xpath("/html/body/div/div[2]/form/table/tbody/tr["+i+"]/td[1]/input")).click();
		System.out.println("clicked on checkbox of:"+i);*/
	
	/*WebElement web=driver.findElement(By.name("Submit"));
	File f1=web.getScreenshotAs(OutputType.FILE);
	File fe=new File("E://oooo.png");
	FileUtils.copyFile(f1, fe);*/
	
/*WebElement web=	driver.findElement(By.name("Submit"));
int height=web.getRect().getDimension().getHeight();
System.out.println(height);
System.out.println("widht"+web.getRect().getDimension().getWidth());
System.out.println("x axis"+web.getRect().getX());
System.out.println("x axis"+web.getRect().getY());*/
	
	
driver.switchTo().newWindow(WindowType.WINDOW);
driver.navigate().to("http://183.82.103.245:8888/BankingProject/LoginForm.jsp");


	
	}
	}


