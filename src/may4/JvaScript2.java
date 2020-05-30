package may4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JvaScript2 {

	public static void main(String[] args) throws Throwable{
	WebDriver driver=new ChromeDriver();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.location='https://amazon.com'");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	//scroll page from top to bottom
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	Thread.sleep(5000);
	//How to scroll vertically for certain pixels:
	js.executeScript("window.scrollBy(0,900)");
	Thread.sleep(5000);
	//scroll page from bottom to top
	js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	Thread.sleep(5000);
	//store element into webelement
	WebElement signinbutton=driver.findElement(By.xpath("//a[@class='a-button-text']"));
	js.executeScript("document.scrollIntoView",signinbutton);
	Thread.sleep(5000);
	signinbutton.click();
	Thread.sleep(5000);
		driver.close();
	}

}
