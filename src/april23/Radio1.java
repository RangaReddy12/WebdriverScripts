package april23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio1 {

	public static void main(String[] args) throws  Throwable{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//get collection of radio buttons
List<WebElement>Oradio=driver.findElements(By.xpath("//form/nav/ul/li/label/strong"));
System.out.println("No of radio buttons::"+Oradio.size());
for(WebElement each: Oradio)
{
	//verify radio button is active or not
boolean value=each.isSelected();
System.out.println(value);
	//get name of each radio button
	String radioname=each.getText();
	System.out.println(radioname);
	//select each radio button
	Thread.sleep(5000);
	each.click();
}
Thread.sleep(5000);
driver.close();
	}

}
