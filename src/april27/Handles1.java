package april27;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handles1 {
//getWindowHandle is a method which can return parent window id in the form of alphanumeric
//getWindowHandles() it is a string type method which can return collection of window ids	
	public static void main(String[] args) throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//get parent unique id
	String parent=driver.getWindowHandle();	
System.out.println(parent);
//click on terms link
driver.findElement(By.partialLinkText("Ter")).click();
Set<String>allwinds=driver.getWindowHandles();
System.out.println(allwinds);
for (String each: allwinds)
{
	//parent window should not be equal to child
	if(!parent.equals(each))
	{
		//switch to child window
		driver.switchTo().window(each);
		Thread.sleep(5000);
		//click on sign up
driver.findElement(By.xpath("(//a[text()='Sign Up'])[1]")).click();
Thread.sleep(5000);
//switch to parent
driver.switchTo().window(parent);
Thread.sleep(5000);
driver.findElement(By.name("email")).sendKeys("test@gmail.com");
driver.findElement(By.name("pass")).sendKeys("test@gmail.com");
driver.findElement(By.name("pass")).sendKeys(Keys.ENTER);
Thread.sleep(5000);
driver.quit();
	}
}
	}

}












