package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TAble {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","F://geckodriver//geckodriver.exe" );
	
	FirefoxDriver  driver=new FirefoxDriver();
	driver.navigate().to("https://www.railyatri.in/time-table");
	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
int row=	driver.findElements(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/div/div/div/table/tbody/tr")).size();
System.out.println(row);

WebElement tab=driver.findElement(By.className("table-responsive"));
List<WebElement> row1 =tab.findElements(By.tagName("tr"));
System.out.println(row1.size());

List<WebElement> column=row1.get(1).findElements(By.tagName("td"));
System.out.println(column.size());



//int row_col=driver.findElements(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/div/div/div/table/tbody/tr/td")).size();
//System.out.println(row_col);


//int col=driver.findElements(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/div/div/div/table/tbody/tr[1]/td")).size();
//System.out.println(col);

 String data=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/div/div/div/table/tbody/tr[3]/td[2]")).getText();
System.out.println(data);

for(int i=1;i<row;i++) {
	String dataall=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/div/div/div/table/tbody/tr["+i+"]")).getText();
	System.out.println(dataall);
}
}

}
