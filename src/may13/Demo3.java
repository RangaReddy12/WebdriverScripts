package may13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo3 {
WebDriver driver;
@Test
public void verifyTitle()
{
	driver=new ChromeDriver();
	driver.get("https://gmail.com");
	driver.manage().window().maximize();
	String Expected="Google";
	String Actaul=driver.getTitle();
	try{
	Assert.assertEquals(Actaul, Expected,"Title is Not matching");
	}catch(Throwable t)
	{
	System.out.println(t.getMessage());	
	}
}
}
