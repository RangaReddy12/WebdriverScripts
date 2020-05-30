package april22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listbox3 {

	public static void main(String[] args)throws Throwable {
		String Expitem="Hyderabad";
		boolean itemexist=false;
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
//send hyd in textbox
	driver.findElement(By.id("FromTag")).sendKeys("hyd");
	Thread.sleep(5000);
	//get collection
	List<WebElement>Olist=driver.findElements(By.xpath("/html/body/ul[1]/li/a"));
	System.out.println("no of items are::"+Olist.size());
	Thread.sleep(5000);
for(WebElement each: Olist)
{
	String Actitem=each.getText();
	System.out.println(Actitem);
	Thread.sleep(2000);
	if(Actitem.toUpperCase().contains(Expitem.toUpperCase()))
	{
		itemexist=true;
		break;
	}
}
if(itemexist)
{
System.out.println("Item Found in textbox::"+Expitem);
}
else
{
System.out.println("Item Not Found in textbox::"+Expitem);
}
Thread.sleep(5000);
driver.close();
}

	
	}


