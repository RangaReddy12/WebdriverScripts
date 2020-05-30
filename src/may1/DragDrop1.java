package may1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop1 {

	public static void main(String[] args) throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		Thread.sleep(5000);
		//get collection of frames
List<WebElement>frames=driver.findElements(By.tagName("iframe"));
System.out.println("no of frames are::"+frames.size());
//switch to frame
driver.switchTo().frame(0); //frame index number starts with 0,1,2,3....
WebElement src=driver.findElement(By.id("draggable"));
WebElement dst=driver.findElement(By.id("droppable"));
ac.clickAndHold(src).moveToElement(dst).release().perform();
Thread.sleep(5000);
//come out of main frame
driver.switchTo().defaultContent();
//click on button
ac.moveToElement(driver.findElement(By.linkText("Button"))).click().perform();
	}

}
