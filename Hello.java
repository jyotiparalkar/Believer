package firstdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		
	        System.setProperty ("Webdriver.chrome.driver","C:\\chromedriver_win32.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://safari.com");
		
		
	}

}

