package april29;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/mutual-funds");
		driver.manage().window().maximize();
//get table data
String tabledata=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[5]/td[1]")).getText();
System.out.println(tabledata);
//store table into webelement
WebElement table=driver.findElement(By.className("dataTable"));
//get collection of rows in  atable
List<WebElement>rows=table.findElements(By.tagName("tr"));
System.out.println("no of rows are::"+rows.size());
for(int i=1;i<rows.size();i++)
{
	//get collection of column in each row
	List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
	System.out.println("Row Number::"+i+"    "+"column size::"+cols.size());
}
	}

}
