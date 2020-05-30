package may14;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class PropertyFile {
WebDriver driver;
Properties p;
FileInputStream fi;
@BeforeTest
public void setUp()throws Throwable
{
	p=new Properties();
	fi=new FileInputStream("C:\\aprilmrngbatch\\Primus_Bank\\OR.properties");
	p.load(fi);
	driver=new ChromeDriver();
	driver.get(p.getProperty("url"));
	driver.manage().window().maximize();
}
@Test
public void verifyReg()throws Throwable
{
	driver.findElement(By.xpath(p.getProperty("Objreg"))).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath(p.getProperty("Objfname"))).sendKeys("Rita");
	driver.findElement(By.xpath(p.getProperty("Objlname"))).sendKeys("meta");
	driver.findElement(By.xpath(p.getProperty("Objph"))).sendKeys("545465656");
	driver.findElement(By.xpath(p.getProperty("Objmail"))).sendKeys("Rita@gmail.com");
	driver.findElement(By.xpath(p.getProperty("Objadd1"))).sendKeys("Hyderabad");
	driver.findElement(By.xpath(p.getProperty("Objadd2"))).sendKeys("Ameerpet");
	driver.findElement(By.xpath(p.getProperty("Objcity"))).sendKeys("Hyderabad");
	driver.findElement(By.xpath(p.getProperty("Objstate"))).sendKeys("TS");
	driver.findElement(By.xpath(p.getProperty("Objpcode"))).sendKeys("123456");
	new Select(driver.findElement(By.xpath(p.getProperty("Objcountry")))).selectByIndex(30);
	driver.findElement(By.xpath(p.getProperty("Objuser"))).sendKeys("Rita1234");
	driver.findElement(By.xpath(p.getProperty("Objpass"))).sendKeys("akhi123");
	driver.findElement(By.xpath(p.getProperty("Objcpass"))).sendKeys("akhi123");
	driver.findElement(By.xpath(p.getProperty("Objsubmit"))).click();
}
@AfterTest
public void teardown()throws Throwable
{
	Thread.sleep(5000);
	driver.close();
}
}












