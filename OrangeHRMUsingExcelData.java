package excelsheetreader;

public class OrangeHRMUsingExcelData {
public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"//msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement username = driver.findElement(By.xpath("//*[@id='txtUsername']"));
		username.sendKeys(ExcelReader.readdata("LoginData", 0, 0));
		
		WebElement password = driver.findElement(By.xpath("//*[@id='txtPassword']"));
		password.sendKeys(ExcelReader.readdata("LoginData", 0, 1));
		
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		
		driver.findElement(By.xpath("//*[text()='My Info']")).click();
		
		driver.findElement(By.xpath("//*[@id='btnSave']")).click();
		
		WebElement firstname = driver.findElement(By.xpath("//*[@id='personal_txtEmpFirstName']"));
		firstname.sendKeys(ExcelReader.readdata("Personal Details", 1, 0));
		
		WebElement middlename = driver.findElement(By.xpath("//*[@id='personal_txtEmpMiddleName']"));
		middlename.sendKeys(ExcelReader.readdata("Personal Details", 1, 1));
		
		WebElement lastname = driver.findElement(By.xpath("//*[@id='personal_txtEmpLastName']"));
		lastname.sendKeys(ExcelReader.readdata("Personal Details", 1, 2));
		
		WebElement employeeid = driver.findElement(By.xpath("//*[@id='personal_txtEmployeeId']"));
		employeeid.sendKeys(ExcelReader.readdata("Personal Details", 1, 3));
		
		WebElement otherid = driver.findElement(By.xpath("//*[@id='personal_txtOtherID']"));
		otherid.sendKeys(ExcelReader.readdata("Personal Details", 1, 4));
		
		WebElement licensenumber = driver.findElement(By.xpath("//*[@id='personal_txtLicenNo']"));
		licensenumber.sendKeys(ExcelReader.readdata("Personal Details", 1, 5));
		
		WebElement ssnnumber = driver.findElement(By.xpath("//*[@id='personal_txtNICNo']"));
		ssnnumber.sendKeys(ExcelReader.readdata("Personal Details", 1, 6));
		
		WebElement sinnumber = driver.findElement(By.xpath("//*[@id='personal_txtSINNo']"));
		sinnumber.sendKeys(ExcelReader.readdata("Personal Details", 1, 7));
		
		WebElement nickname = driver.findElement(By.xpath("//*[@id='personal_txtEmpNickName']"));
		nickname.sendKeys(ExcelReader.readdata("Personal Details", 1, 8));
		
		WebElement militaryservice = driver.findElement(By.xpath("//*[@id='personal_txtMilitarySer']"));
		militaryservice.sendKeys(ExcelReader.readdata("Personal Details", 1, 9));
		
		WebElement smokecheckbox = driver.findElement(By.xpath("//*[@id='personal_chkSmokeFlag']"));
		smokecheckbox.click();
		
		
		
	}

}


}
