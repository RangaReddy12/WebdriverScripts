package april23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox1 {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//store checkbox into webelement
WebElement Checkbox=driver.findElement(By.id("remember"));
//verify check is checked or unchecked
boolean value=Checkbox.isSelected();
System.out.println(value);
Thread.sleep(5000);
//uncheck checkbox
Checkbox.click();
Thread.sleep(5000);
driver.close();
	}

}
