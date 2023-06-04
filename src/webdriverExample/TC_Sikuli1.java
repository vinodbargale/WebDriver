 package webdriverExample;

import org.sikuli.script.Screen;

public class TC_Sikuli1 {
	public static void main(String[] args) throws Exception{
		//Test steps
		Screen sc =new Screen();
		sc.click("E:\\eclipse workspace\\Selenium\\min.png");
		Thread.sleep(3000);
		sc.doubleClick("E:\\eclipse workspace\\Selenium\\open.png");
		Thread.sleep(3000);
		sc.click("E:\\eclipse workspace\\Selenium\\min1.PNG");
		Thread.sleep(3000);
		sc.doubleClick("E:\\eclipse workspace\\Selenium\\chrome.PNG");
		Thread.sleep(3000);
		sc.click("E:\\eclipse workspace\\Selenium\\gmail.PNG");
		Thread.sleep(3000);
		sc.click("E:\\eclipse workspace\\Selenium\\vinod1.PNG");
		Thread.sleep(3000);
	sc.type("8412043143");
	Thread.sleep(3000);
	sc.click("E:\\eclipse workspace\\Selenium\\next.PNG");
	Thread.sleep(3000);
	sc.click("E:\\eclipse workspace\\Selenium\\back2.PNG");  
	
		
		
	}

}
