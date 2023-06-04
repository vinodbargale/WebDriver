package webdriverExample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class Facebook {
public static void main(String[] args) throws Exception{
System.setProperty("webdriver.chrome.driver","F:\\ChromeDriver\\chromedriver.exe");
WebDriver d=new ChromeDriver();
d.navigate().to("http://183.82.103.245/nareshit/login.php");
if (d.getTitle().equals("OrangeHRM-New Level Of HR Management")) {
	System.out.println("The title is matched");
	
}
else {
	System.out.println("Title not matched");
	System.out.println(d.getTitle());
}
d.findElement(By.name("txtUserName")).sendKeys("nareshit");
Thread.sleep(2000);
d.findElement(By.name("txtPassword")).sendKeys("nareshit");
Thread.sleep(2000);
d.findElement(By.name("Submit")).click();
Thread.sleep(3000);
System.out.println("login completed");
Thread.sleep(3000);
if (d.getTitle().equals("OrangeHRM")) {
	System.out.println("title match");
}
else {
	System.out.println("title not match");
	System.out.println(d.getTitle());
}

d.findElement(By.linkText("Logout")).click();
Thread.sleep(3000);
System.out.println("log out completed");
d.close();

}
}
