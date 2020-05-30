package april16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingForEach {

	public static void main(String[] args) throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.get("https://snapdeal.com");
		driver.manage().window().maximize();
		//get collections of links
List<WebElement>links=driver.findElements(By.tagName("a"));		
System.out.println("no of links are::"+links.size());
Thread.sleep(5000);
for(WebElement each:links)
{
	String linkname=each.getText();
	String linkurl=each.getAttribute("href");
	System.out.println(linkname+"\n"+linkurl);
}
Thread.sleep(5000);
driver.close();
	}

}






