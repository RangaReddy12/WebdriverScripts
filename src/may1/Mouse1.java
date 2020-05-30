package may1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse1 {

	public static void main(String[] args) throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//create object for actions class
		Actions ac=new Actions(driver);
		//close login window
		ac.sendKeys(Keys.ESCAPE).perform();
		//mouse move to electronics
	ac.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"))).build().perform();	
Thread.sleep(5000);
//mouse move to mouse link 
ac.moveToElement(driver.findElement(By.partialLinkText("Mouse"))).click().perform();
Thread.sleep(5000);
driver.close();
	}

}
