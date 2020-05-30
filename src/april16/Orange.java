package april16;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange {

	public static void main(String[] args) throws Throwable{
		Scanner s=new Scanner(System.in);
		for(int i=1;i<=3;i++)
		{
		System.out.println("Enter username");
		String username=s.nextLine();
		System.out.println("Enter password");
		String password=s.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://orangehrm.qedgetech.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	String expected="dashboard";
	String actual=driver.getCurrentUrl();
	if(actual.contains(expected))
	{
		System.out.println("Login Success::"+expected+"   "+actual);
	}
	else
	{
	String message=driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();	
		System.out.println(message+"  "+expected+"   "+actual);
	}
	Thread.sleep(5000);
	driver.close();
	}
	}
}
