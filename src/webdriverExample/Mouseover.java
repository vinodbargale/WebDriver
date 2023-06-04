package webdriverExample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
public class Mouseover {
	static String url="http://183.82.103.245/nareshit/login.php";
	static String username="nareshit";
	static String password="nareshit";
	static String title1="OrangeHRM - New Level of HR Management"	;
	static String title2="OrangeHRM";
public static void main(String[] args)throws Exception
{
	System.setProperty("webdriver.chrome.driver"
		,"F:\\chromedriver1\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
driver.navigate().to(url);
driver.findElement(By.name("txtUserName")).sendKeys(username);
driver.findElement(By.name("txtPassword")).sendKeys(password);
if(driver.getTitle().equals(title1)) {
System.out.println("the title matched");

}
else {
	System.out.println("title not matched");
	System.out.println(driver.getTitle());
}
driver.findElement(By.name("Submit")).click();
System.out.println("login completed");
Thread.sleep(3000);
if(driver.getTitle().equals(title2)) {
	System.out.println("title 2 matched");
}

else {
	System.out.println("title not matched");
	System.out.println(driver.getTitle());
}
Actions ac=new Actions(driver);
ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
System.out.println("Mouse over completed");
driver.findElement(By.linkText("Add Employee")).click();
Thread.sleep(3000);
System.out.println("click on sub menu");
driver.findElement( By.linkText("Logout")).click();
System.out.println("lougout completed");
driver.close();
}
}	