package april29;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Using_iterator {
//Iterator: it is interface which can be used to iterate collection stored in list,set arraylist
//hasnext: it is a method returns true or false Returns true if the iteration has more elements.(In other words, returns true if next wouldreturn an element rather than throwing an exception.)
//next:	Returns the next element in the iteration.
public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		//get parent window id
		String parent=driver.getWindowHandle();
		//click on three link to open in new window
		driver.findElement(By.partialLinkText("Help")).click();
		driver.findElement(By.partialLinkText("Priva")).click();
		driver.findElement(By.partialLinkText("Terms")).click();
		//get collection of all window into arraylist
	ArrayList<String>brw=new ArrayList<String>(driver.getWindowHandles());
	System.out.println(brw);
	Iterator<String>x=brw.iterator();
while(x.hasNext())
{
	String child=x.next();
	//parent window should not equal to child window
	if(!parent.equals(child))
	{
	//get every window title and close
		String pagetitle=driver.switchTo().window(child).getTitle();
		System.out.println(pagetitle);
		Thread.sleep(5000);
		driver.close();
	}
}
//switch back to parent window
String parenttitle=driver.switchTo().window(parent).getTitle();
System.out.println(parenttitle);
Thread.sleep(5000);
driver.close();
	}

}













