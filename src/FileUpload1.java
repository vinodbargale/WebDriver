import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload1 {
	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.gecko.driver", "F:\\geckoDriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.xpath("//input[@name='txtUserName'][@class='loginText']")).sendKeys("nareshit");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("nareshit");
		driver.findElement(By.xpath("//input[@name='Submit'][@type='Submit']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("txtEmpLastName")).sendKeys("virat");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("anushka");
		Thread.sleep(3000);
	WebElement file=driver.findElement(By.id("photofile"))	;
		file.sendKeys("E:\\virat.png");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		System.out.println("file uploded");
		
}
}