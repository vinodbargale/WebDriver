package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {
	public static void main(String[] args) throws Exception {
		 System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nareshit");
	        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("nareshit");
	        driver.findElement(By.name("Submit")).click();
	        Thread.sleep(4000);
	        driver.switchTo().frame("rightMenu");
	        driver.findElement(By.xpath("//input[@value='Add']")).click();
	        
	        driver.findElement(By.name("txtEmpLastName")).sendKeys("vinod");
	        driver.findElement(By.name("txtEmpFirstName")).sendKeys("shree");
	//        to file upload
	        WebElement file=driver.findElement(By.xpath("//input[@name='photofile']"));
	        file.sendKeys("E:\\New folder (2)");
	        Thread.sleep(6000);
	        System.out.println("file uploa success fully");
	        driver.findElement(By.xpath("//input[@id='btnEdit']")).click();
	        Thread.sleep(5000);
	        System.out.println("file added");
	        driver.switchTo().defaultContent();
	        driver.findElement(By.linkText("Logout")).click();
	}

}
