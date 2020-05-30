package april23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton2 {

	public static void main(String[] args) throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//get collection all elements which are under input tag
		List<WebElement>Olist=driver.findElements(By.xpath("//form/div/div/span/span/label"));
		System.out.println("no of radiobuttons::"+Olist.size());
for(WebElement each: Olist)
{
	boolean value=each.isSelected();
	System.out.println(value);
	//get only radio buttons from Olist collection
	String radio=each.getText();
	System.out.println(radio);
	Thread.sleep(5000);
	each.click();
}
Thread.sleep(5000);
driver.close();
	}

}
