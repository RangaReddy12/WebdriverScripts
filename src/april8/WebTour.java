package april8;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebTour {
public static void main(String[] args)throws Throwable {
//Create instance object 
WebDriver driver=new ChromeDriver();
//launch url in a browser
driver.get("http://newtours.demoaut.com/");
driver.manage().window().maximize();
//suspend tool for 5 seconds
Thread.sleep(5000);
//click on register link
driver.findElement(By.partialLinkText("REGIST")).click();
//suspend tool for 5 seconds
Thread.sleep(5000);
//fill register form
driver.findElement(By.name("firstName")).sendKeys("Rita");
driver.findElement(By.name("lastName")).sendKeys("Meta");
driver.findElement(By.name("phone")).sendKeys("565675676");
driver.findElement(By.name("userName")).sendKeys("Rita@gmail.com");
driver.findElement(By.name("address1")).sendKeys("Hyderabad");
driver.findElement(By.name("address2")).sendKeys("kukatpalli");
driver.findElement(By.name("city")).sendKeys("amerpat");
driver.findElement(By.name("state")).sendKeys("TS");
driver.findElement(By.name("postalCode")).sendKeys("3456789");
driver.findElement(By.name("country")).sendKeys("INDIA");
driver.findElement(By.name("email")).sendKeys("Akhi123");
driver.findElement(By.name("password")).sendKeys("test123");
driver.findElement(By.name("confirmPassword")).sendKeys("test123");
driver.findElement(By.name("register")).sendKeys(Keys.ENTER);
Thread.sleep(5000);
driver.close();
	}
}
