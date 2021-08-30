package chromeBrower;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\launchchrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("");
        
	}

}
