package EVP;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import Base.BaseTest;
import utilities.ReadXLSdata;

public class FirstTest extends BaseTest{
	
	@Test(dataProviderClass = ReadXLSdata.class, dataProvider = "testdata")
	public static void LoginTest(String username,String password) throws InterruptedException
	{
		/*System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://staging-demo.yuja.com/"); */
		//Login button in enterprise tube
		
		
		driver.findElement(By.xpath(loc.getProperty("login"))).click();
		Thread.sleep(2000);
		driver.findElement(By.id(loc.getProperty("login_userid"))).sendKeys(username);
		driver.findElement(By.id(loc.getProperty("password"))).sendKeys(password);
		driver.findElement(By.xpath(loc.getProperty("sign_in"))).click();	
		Thread.sleep(8000);
	}
	
	}
	

