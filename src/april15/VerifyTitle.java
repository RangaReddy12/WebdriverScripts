package april15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
//launch url in chrome browser	
//verify expected title with actual title
	public static void main(String[] args) throws Throwable{
	WebDriver driver=new ChromeDriver();
	driver.get("http://gmail.com");
	driver.manage().window().maximize();
	String exptitle="google";
	String acttitle=driver.getTitle();
if(acttitle.equalsIgnoreCase(exptitle))
{
	System.out.println("Title is Matching::"+exptitle+"   "+acttitle);
}
else
{
	System.out.println("Title is Not Matching::"+exptitle+"   "+acttitle);
}
Thread.sleep(5000);
driver.quit();
	}

}
