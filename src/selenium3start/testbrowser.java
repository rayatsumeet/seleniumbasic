package selenium3start;

import org.openqa.selenium.chrome.ChromeDriver;

public class testbrowser {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","D:\\api\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		
		c.get("http://google.com");
	}

}
