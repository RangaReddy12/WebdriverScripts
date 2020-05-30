package april27;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handles2 {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		//click on below three links
		driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
		driver.findElement(By.xpath("//span[@class='allcircle circletwo']")).click();
	driver.findElement(By.xpath("//span[@class='railDrishti fa fa-line-chart']")).click();
//store collection of windows in to arraylist class
	ArrayList<String>brw=new ArrayList<String>(driver.getWindowHandles());
	System.out.println(brw);
	String ticketitle=driver.switchTo().window(brw.get(3)).getTitle();
	System.out.println(ticketitle);
	driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	Thread.sleep(5000);
	driver.findElement(By.name("userId")).sendKeys("pranga2010");
	driver.findElement(By.name("password")).sendKeys("pranga2010");
	driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
	Thread.sleep(5000);
	driver.close();
	//switch to rail window
	String railtitle=driver.switchTo().window(brw.get(1)).getTitle();
	System.out.println(railtitle);
	Thread.sleep(5000);
	driver.close();
	//switch to rail window
		String staytitle=driver.switchTo().window(brw.get(2)).getTitle();
		System.out.println(staytitle);
		Thread.sleep(5000);
		driver.close();
		//switch to rail window
		String parenttitle=driver.switchTo().window(brw.get(0)).getTitle();
		System.out.println(parenttitle);
		Thread.sleep(5000);
		driver.close();
	}

}
