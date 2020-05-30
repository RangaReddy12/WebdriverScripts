package april22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox2 {
//count no of items in listbox
//print name of each item 	
//getOptions(); is a method which can return no of items in a listbox
	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		//click on register link
		driver.findElement(By.xpath("//a[starts-with(text(),'REG')]")).click();
		Thread.sleep(5000);
		//store country listbox into select class
		Select country=new Select(driver.findElement(By.name("country")));
//get collection of items in listbox
List<WebElement>Olist=country.getOptions();	
System.out.println("no of items are::"+Olist.size());
Thread.sleep(5000);
for(int i=1;i<Olist.size();i++)
{
	//get each item name
	String itemname=Olist.get(i).getText();
	System.out.println(itemname);
}
Thread.sleep(5000);
driver.close();
	}

}
