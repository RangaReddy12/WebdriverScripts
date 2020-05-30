package may13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 {
WebDriver driver;
@Test
public void verifyTitle()
{
	driver=new ChromeDriver();
	driver.get("https://google.com");
	driver.manage().window().maximize();
	String Expected="Google";
	String Actaul=driver.getTitle();
	try{
	Assert.assertFalse(Actaul.equalsIgnoreCase(Expected),"Title is matching");
	}catch(Throwable t)
	{
	System.out.println(t.getMessage());	
	}
}
}
