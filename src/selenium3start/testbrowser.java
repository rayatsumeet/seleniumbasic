package selenium3start;

import org.openqa.selenium.chrome.ChromeDriver;

public class testbrowser {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","D:\\api\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ch = new ChromeDriver();
		
		ch.get("http://google.com");
	}

}
