package april6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws Throwable {
	//create pbject for class
	WebDriver driver=new ChromeDriver();
	//lauching url in a browser
	driver.get("http://naukri.com");
	driver.manage().window().maximize();
	driver.findElement(By.name(""));
	//suspend tool from execution for about 5 seconds
	Thread.sleep(5000);
	//driver.close();
driver.quit();
	}

}
