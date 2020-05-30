package may13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
	WebDriver driver;
@BeforeMethod
public void setup()
{
	driver=new ChromeDriver();
	driver.get("http://primusbank.qedgetech.com/");
	driver.manage().window().maximize();
}
@Test(invocationCount=3)
public void login()
{
	driver.findElement(By.name("txtuId")).sendKeys("Admin");
	driver.findElement(By.name("txtPword")).sendKeys("Admin");
	driver.findElement(By.name("login")).click();
}
@AfterMethod
public void tearDown()
{
	driver.close();
}
}
