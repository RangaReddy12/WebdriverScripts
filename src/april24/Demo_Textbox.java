package april24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Textbox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://facebook.com");
		driver.manage().window().maximize();
	
	List<WebElement>Olist=driver.findElements(By.xpath("//form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
	System.out.println(Olist.size());
for(WebElement each: Olist)
{
	String textboxnme=each.getText();
	System.out.println(textboxnme);
}
	}

}











