package april29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureData {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/mutual-funds");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement table=driver.findElement(By.className("dataTable"));
	List<WebElement>rows=table.findElements(By.tagName("tr"));
	System.out.println("no of rows are::"+rows.size());
	for(WebElement each: rows)
	{
List<WebElement>cols=each.findElements(By.tagName("td"));
for(WebElement eachcell: cols)
{
	String celltext=eachcell.getText();
	System.out.print("\n"+celltext);
}
System.out.println();
System.out.println("===============================================");
	}
	Thread.sleep(5000);
	driver.close();
	}

}
