package april29;

import java.util.List;

import javax.swing.plaf.basic.BasicTreeUI.TreeHomeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComplteTable {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Marke")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Market Sta")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Daily Share Pric")).click();
		Thread.sleep(3000);
		WebElement table=driver.findElement(By.id("gridSource"));
	List<WebElement>rows=table.findElements(By.tagName("tr"));
	System.out.println("no of rows are::"+rows.size());
for(int i=1;i<rows.size();i++)
	{
List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
for(int j=0;j<cols.size();j++)
{
if(cols.get(j).getText().isEmpty())
{
//click on next
driver.findElement(By.xpath("//th[@class='table-page:next']")).click();	
}
System.out.print("\n"+cols.get(j).getText());
}
System.out.println();
System.out.println("******************************************************************");
	}

	}

}
