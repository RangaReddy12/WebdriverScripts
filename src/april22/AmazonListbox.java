package april22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonListbox {

	public static void main(String[] args)throws Throwable {
		String Expitem="deals";
		boolean itemexist=false;
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Select listbox=new Select(driver.findElement(By.id("searchDropdownBox")));
	//get collection of all items
		List<WebElement>Olist=listbox.getOptions();
		System.out.println("no of items are::"+Olist.size());
		Thread.sleep(5000);
	for(WebElement each: Olist)
	{
		String Actitem=each.getText();
		System.out.println(Actitem);
		Thread.sleep(2000);
		if(Actitem.equalsIgnoreCase(Expitem))
		{
			itemexist=true;
			break;
		}
	}
if(itemexist)
{
	System.out.println("Item Found in Listbox::"+Expitem);
}
else
{
	System.out.println("Item Not Found in Listbox::"+Expitem);
}
Thread.sleep(5000);
driver.close();
	}

}
