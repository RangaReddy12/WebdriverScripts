package april8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingChromebrowser {

	public static void main(String[] args) throws Throwable {
	//create instance object 
WebDriver driver=new ChromeDriver();		
//launch url in a browser
driver.get("http://primusbank.qedgetech.com/");
driver.manage().window().maximize();
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