package april16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
//lauch url in chrome
	//printntitle
	//click on gmail link
	//click on back
	//click on forward
	//refresh page
	//close browser
	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
driver.navigate().to("https://google.com");
driver.manage().window().maximize();
System.out.println("page title[1]::"+driver.getTitle());
Thread.sleep(5000);
//click on gmail link
driver.findElement(By.partialLinkText("Gmail")).click();
System.out.println("page title[2]::"+driver.getTitle());
Thread.sleep(5000);
//click on back
driver.navigate().back();
System.out.println("page title[3]::"+driver.getTitle());
Thread.sleep(5000);
//click on forward
driver.navigate().forward();
System.out.println("page title[4]::"+driver.getTitle());
Thread.sleep(5000);
driver.navigate().refresh();
System.out.println("page title[5]::"+driver.getTitle());
Thread.sleep(5000);
driver.close();
	}

}














