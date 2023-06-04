

	package VINOD;

	import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

	public class TableData1 {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.gecko.driver", "F://geckoDriver//geckodriver.exe");
			WebDriver driver =new FirefoxDriver();
			//driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.railyatri.in/time-table");
			Thread.sleep(3000);
			Alert a=driver.switchTo().alert();
			System.out.println(a.getText());
			a.accept();
			Thread.sleep(3000);
			
		    WebElement table=	driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/div/div/div/table"));
		    List<WebElement> tr=   table.findElements(By.tagName("tr"));
		    System.out.println(tr.size());
		    for (int i = 1; i < tr.size(); i++) {
		  List<WebElement>  cols=	tr.get(i).findElements(By.tagName("td"));
		  String train_name=cols.get(0).getText();
		  String train_number=cols.get(1).getText();
		  System.out.println(train_name+"--"+train_number);
		  System.out.println(train_name+"--"+train_number);
				
			}
		    
		    
		   
		    
			
			driver.close();

		}

	}

