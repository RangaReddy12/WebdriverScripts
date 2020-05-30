package may4;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class JavaScript3 {

	public static void main(String[] args) throws Throwable{
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='http://orangehrm.qedgetech.com/'");
		driver.manage().window().maximize();
		js.executeScript("document.querySelector('#txtUsername').value='test'");
		js.executeScript("document.querySelector('#txtPassword').value='Qedge123!@#'");
		js.executeScript("document.querySelector('#btnLogin').click()");
		Thread.sleep(5000);
	String expurl="dash";
	String acturl=js.executeScript("return document.URL").toString();
	if(acturl.contains(expurl))
	{
		System.out.println("Login success");
	}
	else
	{
String message=js.executeScript("return document.querySelector('#spanMessage').innerHTML").toString();
		System.out.println(message);
	}
	Thread.sleep(5000);
	driver.close();
	}

}
