package april15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Counting_Links {
//launch url in chrome browser
	//print title of the page
	//get collection of links which stored in html tag a and count them
	//print each link name
	//print each link url
	//close browser
	//size: it is method Returns the number of elements in this list collection
	//List it is interface which stores integer collection
	//WebElement is datatype
	public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("http://rediff.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);//suspend tool from execution for 5 seconds
//get collection of link which are stored into html tag a
List<WebElement>Links=driver.findElements(By.tagName("a"));
System.out.println("No of links are::"+Links.size());
Thread.sleep(5000);
//iterate all links
for(int i=0;i<Links.size();i++)
{
	//capture each linkname
	
	
	String linkname=Links.get(i).getText();
	//capture each link url
	String linkurl=Links.get(i).getAttribute("href");
	System.out.println(linkname+"\n"+linkurl);
}
Thread.sleep(5000);
driver.close();
	}

}
