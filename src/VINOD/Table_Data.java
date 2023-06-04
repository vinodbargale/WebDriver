package VINOD;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Data 
{
public static void main(String[] args) throws Exception 
{
	System.setProperty("webdriver.chrome.driver","F:\\\\ChromeDriver\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.railyatri.in/time-table");
	Thread.sleep(3000);

	
	 WebElement table=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/div/div/div"));
List<WebElement> tr=table.findElements(By.tagName("tr"));
System.out.println(tr.size());

/*for(int i=1;i<tr.size();i++) {
	List<WebElement>columns=tr.get(i).findElements(By.tagName("td"));
	String train_name=columns.get(0).getText();
	String train_number=columns.get(1).getText();
	
	System.out.println(train_name+"----"+train_number);*/
for(int i=1;i<=tr.size();i++) {
	String data=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]")).getText();

System.out.println(data);}
	
	
}
}
