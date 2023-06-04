package webdriverExample;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class Verification1 {
static String url="http://183.82.103.245/nareshit/login.php";
static String username="nareshit";
static String password="nareshit";
static String title1="OrangeHRM-New Level of HR Management";
static String title2="OrangeHRM";
public static void main(String[] args) throws Exception
{
	System.setProperty("webdriver.chrome.driver","F:\\ChromeDriver\\chromedriver.exe ");
	WebDriver v=new ChromeDriver();
	v.navigate().to(url);
	if(v.getTitle().equals(title1))
	{
		System.out.println("title match");
	}
	else {
		System.out.println("title not match");
		System.out.println(v.getTitle());
	}
	v.findElement(By.name("txtUserName")).sendKeys(username);
	
	v.findElement(By.name("txtPassword")).sendKeys(password);
	Thread.sleep(3000);
	
	
	v.findElement(By.name("Submit")).click();
	System.out.println("login completed");
	
	if(v.getTitle().equals(title2))
	{
		System.out.println("title match");
	}
	else 
	{
		System.out.println("title not match");
	System.out.println(v.getTitle());
	}
	v.findElement(By.linkText("Logout")).click();
	System.out.println("logout completed");
	Thread.sleep(3000);
	v.close();
}
}
