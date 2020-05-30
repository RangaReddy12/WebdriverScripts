package april15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyProtocol {
//launch url in chrome browser
	//verify url contains https://
	//if it contains https:// url is secured or else not secured
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("http://amazon.com/");
		driver.manage().window().maximize();
		//verify url contains https://
		if(driver.getCurrentUrl().contains("https://"))
		{
			System.out.println("Url is Secured");
		}
		else
		{
			System.out.println("Url is Not Secured");
		}
Thread.sleep(5000);
driver.close();
	}

}
