package popupHandling;

public class AlertPopUpHandling {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		driver.findElement(By.xpath("//*[@name='alert']")).click();
		
//	To print the Pop-up msg	
		
		String alerttext = driver.switchTo().alert().getText();
		System.out.println(alerttext);
	
//	Alert Pop-up Handling	
		driver.switchTo().alert().accept();
		
		
		
		
	}

}


	}


