package april24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleCheckbox {

	public static void main(String[] args) throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/prang/Downloads/checkbox_1.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//get collection of checkboxes 
List<WebElement>Olist=driver.findElements(By.tagName("input"));
System.out.println("no of checkboxes are::"+Olist.size());
Thread.sleep(5000);
for(WebElement each: Olist)
{
	//verify checkbox which is selected or not selected
	boolean value=each.isSelected();
	System.out.println(value);
	//get each checkbox name which is stored into value property
	String checkboxname=each.getAttribute("value");
	System.out.println(checkboxname);
	//uncheck which is already selected and check which is not selected
	if(!each.isSelected())
	{
		//select check box
		each.click();
	}
	else
	{
		//uncheck checkbox
		each.click();
	}
	Thread.sleep(5000);
}
Thread.sleep(5000);
driver.close();
	}

}












