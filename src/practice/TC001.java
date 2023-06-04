package practice;
//To access webdriver classes&method
import org.openqa.selenium.WebDriver;
//to access chrome browser
import org.openqa.selenium.chrome.ChromeDriver;
//to access object identification methods
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
public class TC001 {
	// Dt      variable    Value of variable
static String url="http://183.82.103.245/nareshit/login.php";
static String username="nareshit";
static String password="nareshit";
static String title1="OrangeHRM -New Level of HR Management";
static String title2="OrangeHRM";
public static void main(String[] args)throws Exception {
	System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	//enter link
	d.navigate().to(url);
	//verifcation of page name
	if(d.getTitle().equals(title1)) {
		System.out.println("title matched");
	}
	else {
		System.out.println("title not matched");
		System.out.println(d.getTitle());
	}
	//enter user name
	d.findElement(By.name("txtUserName")).sendKeys(username);
	Thread.sleep(3000);// pause
	//enter password
	d.findElement(By.name("txtPassword")).sendKeys(password);
	Thread.sleep(3000);
	//click on submit
	d.findElement(By.name("Submit")).click();
	System.out.println("login completed");
	Thread.sleep(3000);
	//verification of page name
	if(d.getTitle().equals(title2)) {
		System.out.println("title matched");
		
	}
	else {
		System.out.println("title not matched");
		System.out.println(d.getTitle());
		}
	//mouseOver activity perform
	Actions ac=new Actions(d);
	ac.moveToElement(d.findElement(By.linkText("PIM"))).perform();
	System.out.println("mouseOver completed");
	Thread.sleep(3000);
	//click on sub menu
	d.findElement(By.linkText("Add Employee")).click();
	System.out.println("click on submenu");
	//lougout
	d.findElement(By.linkText("Logout")).click();
	System.out.println("Lougout completed");
	
	//close browser
	d.close();
}
	
	
	
	
	
	
	
	
	
	
}