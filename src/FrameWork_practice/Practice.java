package FrameWork_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Practice {
public static void main(String[] args) {
	
	/*
	 * System.setProperty("webdriver.gecko.driver",
	 * "F://geckodriver//geckodriver.exe"); WebDriver driver=new FirefoxDriver();
	 * driver.get("https://www.google.com");
	 * 
	 * System.setProperty("webdriver.chrome.driver",
	 * "F://ChromeDriver//chromedriver.exe"); WebDriver driver1=new ChromeDriver();
	 * driver.get("https://www.google.com");
	 */
	/*
	 * System.setProperty("webdriver.edge.driver","F://edgedriver//msedgedriver.exe"
	 * ); WebDriver driver3=new EdgeDriver(); driver3.get("https://www.google.com");
	 */
	
	/*
	 * System.setProperty("webdriver.ie.driver","F://IEBrowser//IEDriverServer.exe")
	 * ;
	 * 
	 * WebDriver driver=new InternetExplorerDriver();
	 * driver.get("https://www.google.com");
	 */
	System.setProperty("webdriver.safari.driver", "SafariDriver.safariextz");
	WebDriver driver=new SafariDriver();
	
	driver.get("https://www.google.com");
	
	System.setProperty("webdriver.opera.driver","F://opera1//operadriver.exe");
	WebDriver driver1=new OperaDriver();
}
}
O