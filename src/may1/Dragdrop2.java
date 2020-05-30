package may1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop2 {

	public static void main(String[] args)throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		Thread.sleep(5000);
		//switch to frame
		driver.switchTo().frame(0); //frame index number starts with 0,1,2,3....
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement dst=driver.findElement(By.id("droppable"));
		ac.dragAndDrop(src, dst).build().perform();
if(dst.getText().contains("Dropped!"))
{
	System.out.println("drag and drop is success");
}
else
{
	System.out.println("drag and drop is Fail");
}
	}

}
