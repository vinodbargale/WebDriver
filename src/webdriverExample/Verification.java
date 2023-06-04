package webdriverExample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class Verification {
public static void main(String[] args)throws Exception {
	System.setProperty("webdriver.chrome.driver","F:\\\\ChromeDriver\\chromedriver.exe" );
	WebDriver Driver=new ChromeDriver();
	Driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	if(Driver.getTitle().equals("OrangeHRM-New Level of HR Management")) {
		System.out.println("Title matched");
	}
	else {
		System.out.println("Title not matched");
		System.out.println(Driver.getTitle());
	}
	Driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	Driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	Driver.findElement(By.name("Submit")).click();
	System.out.println("Login completed");
	Thread.sleep(3000);
	if(Driver.getTitle().equals("OrangeHRM")) {
		System.out.println("Title matched");
	}
	else {
		System.out.println("title not matched");
		System.out.println(Driver.getTitle());
	}
		
	Driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(3000);
	System.out.println("logout completed");
	Driver.close();
	
}
}
