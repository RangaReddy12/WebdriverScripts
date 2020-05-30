package april20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xapthexpresion {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Test1234");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("rita");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Test1234@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Test1234@gmail.com");
	driver.findElement(By.xpath("(//input[contains(@name,'reg')])[3]")).sendKeys("akhi");
	Thread.sleep(5000);
driver.findElement(By.xpath("(//select[starts-with(@name,'birth')])[1]")).sendKeys("20");
Thread.sleep(5000);
driver.findElement(By.xpath("(//select[starts-with(@name,'birth')])[2]")).sendKeys("Dec");
Thread.sleep(5000);
driver.findElement(By.xpath("(//select[starts-with(@name,'birth')])[3]")).sendKeys("1975");
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
Thread.sleep(8000);
driver.close();
	}

}
