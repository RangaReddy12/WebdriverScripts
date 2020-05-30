package may11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {
	WebDriver driver;
@BeforeMethod
public void setup()throws Throwable
{
	driver=new ChromeDriver();
	driver.get("http://primusbank.qedgetech.com/");
	driver.manage().window().maximize();
	driver.findElement(By.name("txtuId")).sendKeys("Admin");
	driver.findElement(By.name("txtPword")).sendKeys("Admin");
	driver.findElement(By.name("login")).click();
	Thread.sleep(5000);
	Reporter.log("Running setup",true);
}
@Test
public void braches()throws Throwable
{
driver.findElement(By.xpath("//tr//tr//tr//tr//tr[2]//td[1]//a[1]//img[1]")).click();
Reporter.log("Executing branches Test",true);
Thread.sleep(5000);
}
@Test
public void roles()throws Throwable
{
driver.findElement(By.xpath("//tr//tr//tr[4]//td[1]//a[1]//img[1]")).click();
Reporter.log("Executing roles Test",true);
Thread.sleep(5000);
}
@Test
public void users()throws Throwable
{
driver.findElement(By.xpath("//tr[6]//td[1]//a[1]//img[1]")).click();
Reporter.log("Executing users Test",true);
Thread.sleep(5000);
}
@AfterMethod
public void teardown()throws Throwable
{
	Thread.sleep(5000);
	driver.close();
	Reporter.log("Running teardown",true);
}
}



