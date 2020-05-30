package april24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert1 {

	public static void main(String[] args) throws Throwable{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		//click on login button without filling login details
	driver.findElement(By.name("login")).click();
	Thread.sleep(5000);
	//get alert text
	String alerttext=driver.switchTo().alert().getText();
	System.out.println(alerttext);
	Thread.sleep(5000);
	driver.switchTo().alert().dismiss();
	Thread.sleep(5000);
	driver.close();
	}

}
