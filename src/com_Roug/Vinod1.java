package com_Roug;

import org.openqa.selenium.chrome.ChromeDriver;

public class Vinod1 {
	public static void main(String[] args) {
		
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
	}

}
