package april15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureProperty {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		//capture gmail url 
	String gmailurl=driver.findElement(By.linkText("Gmail")).getAttribute("href");
	System.out.println(gmailurl);

	}

}
