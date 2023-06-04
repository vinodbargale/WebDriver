package practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
public class Mouseoverpractice {
	static String url="http://183.82.103.245/nareshit/login.php";
	static String username="nareshit";
	static String password="nareshit";
	static String title1="OrangeHRM - New Level of HR Management"	;
	static String title2="OrangeHRM";
	public static void main(String[] args) throws Exception{
		//launch browser
		System.setProperty("webdriver.chrome.driver"
				,"F:\\ChromeDriver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		//enter url
			driver.navigate().to(url);
			//verify page name
			if(driver.getTitle().equals(title1)) {
				System.out.println("title matched");
			}
			else {
				System.out.println("title not matched");
				System.out.println(driver.getTitle());
			}
			Thread.sleep(3000);
			//login
			driver.findElement(By.name("txtUserName")).sendKeys(username);
			driver.findElement(By.name("txtPassword")).sendKeys(password);
			driver.findElement(By.name("Submit")).click();
			System.out.println("login completed");
			Thread.sleep(3000);
	
	if(driver.getTitle().equals(title2)) {
		System.out.println("title matched");}
	else {System.out.println("title not matched");
	System.out.println(driver.getTitle());}
	Actions ac=new Actions(driver);
	ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
	System.out.println("Mouse over completed");
	Thread.sleep(3000);
	driver.findElement(By.linkText("Add Employee")).click();
	
	System.out.println("new employee added");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@value='Back'][@type='button']")).click();
	{System.out.println("Back activity ");}
	}
	}
	

