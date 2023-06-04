import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.xpath("//input[@name='txtUserName'][@class='loginText']")).sendKeys("nareshit");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("nareshit");
		driver.findElement(By.xpath("//input[@name='Submit'][@type='Submit']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		System.out.println("add button clicked");
		Thread.sleep(3000);
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Bargale");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Vinod");
		WebElement fileuplod=driver.findElement(By.xpath("//input[@name='photofile'][@id='photofile']"));
		fileuplod.sendKeys("E:\\New folder (2).png");
		Thread.sleep(7000);
		System.out.println("file upload successfully");
		 driver.findElement(By.xpath("//*[@id='btnEdit']")).click();
	        Thread.sleep(7000);
	          System.out.println("New Employee Added");
	          driver.switchTo().defaultContent();
	          driver.findElement(By.linkText("Logout")).click();
	          driver.close();
	}

}
