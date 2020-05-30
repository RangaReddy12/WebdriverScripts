package april13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args)throws Throwable {
		//create instance object
		WebDriver driver=new ChromeDriver();
		//launch url
		driver.get("http://amazon.com");
		driver.manage().window().maximize();
		//print title of page and length of title
		String pagetitle=driver.getTitle();
		System.out.println("page title is::"+pagetitle);
		System.out.println("page title length is::"+pagetitle.length());
//print url of the page and length of url
		String strurl=driver.getCurrentUrl();
		System.out.println("url of the page::"+strurl);
		System.out.println("url lenght is::"+strurl.length());
		Thread.sleep(5000);
		driver.close();
	}

}
