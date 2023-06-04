package VINOD;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver",
				"F:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.get("https://www.youtube.com/watch?v");
		System.out.println(driver.getCurrentUrl());
		
		//driver.findElement(By.xpath("//g-flat-button[@jsname='ZnuYW']")).click();
		
		//driver.manage().window().minimize();
		//Thread.sleep(3000);
		//driver.manage().window().maximize();
	
		
		
		/*
	 * 	//how  to enter on text box or any element using key having key class and predefined  constant
		
		driver.get("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(5000);
		driver.findElement(By.name("Submit")).sendKeys(Keys.ENTER);
	driver.findElement(By.linkText("Logout")).sendKeys(Keys.ENTER);*/
	
		
		
	/* to get  the attribute by using getAttribute()  method	

String s=driver.findElement(By.name("txtUserName")).getAttribute("name");
	System.out.println(s);*/
		
	
		
		/*	//To check element is present
		if(driver.findElements(By.name("txtUserName")).size()!=0)
		{
			 System.out.println("Element is present"); 
			}
		else{ 
			 System.out.println("Element is absent"); 
			}
		
		//to check element is visible
	if(driver.findElement(By.name("Submit")).isDisplayed()){ 
			  System.out.println("Element is visible"); 
			}else{ 
			  System.out.println("Element is visible"); 
			}
		//to check element is enable
		if(driver.findElement(By.name("Submit")).isEnabled()){ 
			  System.out.println("Element is Enable"); 
			}else{ 
			  System.out.println("Element is Enable"); 
			}	
		// to check text is present
		
		if(driver.getPageSource().contains("text")){
			 System.out.println("Text is present"); 
			}else{
			 System.out.println("Text is not present"); 
			}*/
		//driver.quit();
		
	

	}
}
	

