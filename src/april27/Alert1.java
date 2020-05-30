package april27;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert1 {

	public static void main(String[] args) throws Throwable{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		//click on branches
	driver.findElement(By.xpath("//tr//tr//tr//tr//tr[2]//td[1]//a[1]//img[1]")).click();	
	Thread.sleep(5000);
	//click on delete 
	driver.findElement(By.xpath("//tr//tr[2]//td[8]//a[1]//img[1]")).click();
	Thread.sleep(5000);
	//get alert message
	String alertmessage=driver.switchTo().alert().getText();
	System.out.println(alertmessage);
	Thread.sleep(5000);
	//click on cancel
	driver.switchTo().alert().dismiss();
	Thread.sleep(5000);
	//click on delete 
	driver.findElement(By.xpath("//tr//tr[2]//td[8]//a[1]//img[1]")).click();
	Thread.sleep(5000);
	//get alert message
	String alertmessage1=driver.switchTo().alert().getText();
	System.out.println(alertmessage1);
	Thread.sleep(5000);
	driver.switchTo().alert().accept();
	Thread.sleep(5000);
	//get alert text
	String alerttext=driver.switchTo().alert().getText();
	System.out.println(alerttext);
	Thread.sleep(5000);
	driver.switchTo().alert().accept();
	Thread.sleep(5000);
	driver.close();
	
	}

}
