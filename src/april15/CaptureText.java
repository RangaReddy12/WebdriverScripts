package april15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureText {
//launch url in chrome browser
	//capture gmail link text using getTetxt method
	//verify exptext with acttext
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//capture gmail text
	String gmailtext=driver.findElement(By.partialLinkText("Gmail")).getText();	
	String exptext="gmail";
	if(gmailtext.equalsIgnoreCase(exptext))
	{
		System.out.println("Text is Matching::"+gmailtext+"   "+exptext);
	}
	else
	{
		System.out.println("Text is not Matching::"+gmailtext+"   "+exptext);
	}
Thread.sleep(5000);
driver.close();
	}

}
