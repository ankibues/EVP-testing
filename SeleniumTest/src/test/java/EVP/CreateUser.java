package EVP;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.BaseTest;

public class CreateUser extends BaseTest{
	@Test
	public void run() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[normalize-space()='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loginuserid")).sendKeys("aswin_syras");
		driver.findElement(By.id("password")).sendKeys("Aswinsyras@123");
		driver.findElement(By.xpath("//button[@id='loginButton']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='mainMenuBtn']")).click();
		driver.findElement(By.xpath("//h6[normalize-space()='Manage organization options']")).click();
		


	}
}
