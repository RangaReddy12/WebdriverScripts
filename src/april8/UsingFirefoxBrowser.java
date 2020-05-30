package april8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingFirefoxBrowser {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		//suspend tool from execution for 5 seconds
		Thread.sleep(5000);
		//enter username
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		//we can click button in three ways
		driver.findElement(By.name("login")).click();
		//driver.findElement(By.name("login")).submit();
		//driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.quit();	

	}

}
