package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebUplod {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\ChromeDriver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("file:///F:/web/WebTable.html");
		
		int row=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr")).size();
		System.out.println(row);
		int column=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[1]/td")).size();
		System.out.println(column);
		int r_c=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr/td")).size();
		System.out.println(r_c);
		
		String cell=driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[3]/td[3]")).getText();
		System.out.println(cell);
		
		for(int z=1;z<=row;z++) {
			String data=driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr["+z+"]")).getText();
			System.out.println(data);
		}
		
	}
	

}
