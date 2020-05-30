package april20;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtourXpath {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[starts-with(text(),'REG')]")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("testing");
		driver.findElement(By.xpath("//input[@name='firstName']/following::input[1]")).sendKeys("Akhi123");
		driver.findElement(By.xpath("//input[@name='firstName']/following::input[2]")).sendKeys("56576577");
		driver.findElement(By.xpath("//input[@name='firstName']/following::input[3]")).sendKeys("Akhi123@gmail.com");
		driver.findElement(By.xpath("//input[@name='firstName']/following::input[4]")).sendKeys("hydera");
		driver.findElement(By.xpath("//input[@name='firstName']/following::input[5]")).sendKeys("ameerpet");
		driver.findElement(By.xpath("//input[@name='firstName']/following::input[6]")).sendKeys("hyderabad");
		driver.findElement(By.xpath("//input[@name='firstName']/following::input[7]")).sendKeys("TS");
		driver.findElement(By.xpath("//input[@name='firstName']/following::input[8]")).sendKeys("343534");
		driver.findElement(By.xpath("//select[@name='country']")).sendKeys("INDIA");
		driver.findElement(By.xpath("//input[@name='firstName']/following::input[9]")).sendKeys("Rita");
		driver.findElement(By.xpath("//input[@name='firstName']/following::input[10]")).sendKeys("meta123");
		driver.findElement(By.xpath("//input[@name='firstName']/following::input[11]")).sendKeys("meta123");
		driver.findElement(By.xpath("//input[@name='firstName']/following::input[12]")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.close();
	}

}
