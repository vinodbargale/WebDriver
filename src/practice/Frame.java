package practice;
//to access a WebDriver class & method
import org.openqa.selenium.WebDriver;
//to access chrome browser
import org.openqa.selenium.chrome.ChromeDriver;
//to access object identification method
import org.openqa.selenium.By;
public class Frame {
	public static void main(String[] args)throws Exception {
		
		System.setProperty("webdriver.chrome.driver","F:\\ChromeDriver\\chromedriver.exe" );
	WebDriver web=new ChromeDriver();
	web.navigate().to( "http://183.82.103.245/nareshit/index.php");
	web.getTitle();
web.findElement(By.name("txtUserName")).sendKeys("nareshit");
web.findElement(By.name("txtPassword")).sendKeys("nareshit");
web.findElement(By.name("Submit")).click();
Thread.sleep(4000);
web.switchTo().frame("rightMenu");
	web.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
	Thread.sleep(4000);
	web.findElement(By.name("txtEmpFirstName")).sendKeys("vinod");
	web.findElement(By.name("txtEmpLastName")).sendKeys("patil");
	web.findElement(By.className("savebutton")).click();
	System.out.println("sub data entered");
	web.findElement(By.className("clearbutton")).click();
	System.out.println("sub data reset");
	Thread.sleep(3000);
	web.switchTo().defaultContent();
	System.out.println("frame exit");
	Thread.sleep(2000);
	web.findElement(By.linkText("Logout")).click();
	System.out.println("logout completed");
	Thread.sleep(3000);
	web.close();
	}

}
