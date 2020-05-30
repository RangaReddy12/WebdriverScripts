package may11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {
WebDriver driver;
@BeforeTest
public void setup()throws Throwable
{
	driver=new ChromeDriver();
	driver.get("http://newtours.demoaut.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	Reporter.log("Running setup",true);
}
@Test(description="Verify Register link",priority=0,enabled=true,timeOut=3000)
public void register()throws Throwable
{
driver.findElement(By.partialLinkText("REG")).click();
//Thread.sleep(2000);
Reporter.log("Executing register Test",true);
}
@Test(description="Verify hotel link",priority=2,enabled=false)
public void hotels()throws Throwable
{
driver.findElement(By.partialLinkText("Hot")).click();
Thread.sleep(5000);
Reporter.log("Executing hotels Test",true);
}
@Test(description="Verify cruioses link",priority=1,enabled=true)
public void cruises()throws Throwable
{
driver.findElement(By.partialLinkText("Cru")).click();
Thread.sleep(5000);
Reporter.log("Executing Cruises Test",true);
}
@AfterTest
public void tearDown()
{
	driver.close();
	Reporter.log("Running tearDown",true);
}
}
