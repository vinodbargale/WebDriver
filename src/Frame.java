import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class Frame {

	public static void main(String[] args)throws Exception {
		//open browser
		System.setProperty("webdriver.chrome.driver","F:\\ChromeDriver\\chromedriver.exe ");
		WebDriver driver=new ChromeDriver();
		//enter link
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println(driver.getTitle()); 
		//enter user name,password,login
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");	
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	//frame
	//enter frame
	driver.switchTo().frame("rightMenu");
	driver.findElement(By.xpath("//input[@Value='Add'][@type='button']")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("txtEmpLastName")).sendKeys("patil");
	driver.findElement(By.name("txtEmpFirstName")).sendKeys("vinod");
	driver.findElement(By.name("txtEmpMiddleName")).sendKeys("dilip");
	driver.findElement(By.name("txtEmpNickName")).sendKeys("vinu");
	driver.findElement(By.id("btnEdit")).click();//save
	Thread.sleep(4000);
	System.out.println("new employee added");// newemployee added
	driver.switchTo().defaultContent();// exit frame
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("lougout completed");
	Thread.sleep(4000);
	driver.close();
	}
}