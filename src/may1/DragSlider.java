package may1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DragSlider {

	public static void main(String[] args) throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		Thread.sleep(5000);
		//switch to frame
		driver.switchTo().frame(0); //frame index number starts with 0,1,2,3....
//store slider
	WebElement slider=driver.findElement(By.id("slider"));
	ac.dragAndDropBy(slider, 350, 0).perform();
	Thread.sleep(5000);
	ac.dragAndDropBy(slider, -250, 0).perform();
	
	}

}
