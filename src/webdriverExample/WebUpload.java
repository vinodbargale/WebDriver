package webdriverExample;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
	public class WebUpload {
	public static void main(String args[]) throws Exception{
	    // Test Steps
	System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver\\chromedriver.exe");
	
	
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(co);
	driver.get("file:///F:/web/WebTable.html");
	//Count
	int row =driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr")).size();
	////*[@id="idCourse"]
	///html/body/table
	int col =driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr[1]/td")).size();
	int row_col =driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr/td")).size();

	System.out.println("rowcount " + row);
	System.out.println("col count "+ col);
	System.out.println("row_col count "+ row_col);
	//Data : Cell
	String celldata=driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr[2]/td[2]")).getText();
	System.out.println(celldata);
	//Data : Table
	// DT Var VV
	for(int i=1; i<=row; i++) {
	String data = driver.findElement(By.
	        xpath("//*[@id='idCourse']/tbody/tr["+i+"]")).getText();
	Thread.sleep(3000);
	System.out.println(data);
	}
	driver.quit();
	}
	}


