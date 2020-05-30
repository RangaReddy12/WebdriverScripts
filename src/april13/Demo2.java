package april13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		//print souce code of the page loaded by selenium
		String strsource=driver.getPageSource();
		System.out.println(strsource);
		driver.close();

	}

}
