package practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class MosueeOver1 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","F:\\ChromeDriver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://adactinhotelapp.com/");
		Thread.sleep(3000);
		if(driver.getTitle().equals("Adactin.com - Hotel Reservation System")) {
			System.out.println("the title matched");
		}
		else {
			System.out.println("title not matched");
System.out.println(driver.getTitle());
		}
		Thread.sleep(3000);
		driver.findElement(By.linkText("Forgot Password?")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Go back to Login page")).click();
		Thread.sleep(4000);
	System.out.println("back to ");
	}

}
