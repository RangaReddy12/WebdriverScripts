package may5;

import java.io.BufferedReader;
import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtour {

	public static void main(String[] args)throws Throwable {
		FileReader fr=new FileReader("G://selenium.txt");
		BufferedReader br=new BufferedReader(fr);
		WebDriver driver=new ChromeDriver();
		String str="";
		while((str=br.readLine())!=null)
		{
		String login[]=str.split("@");
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys(login[0]);
		driver.findElement(By.name("password")).sendKeys(login[1]);
		driver.findElement(By.name("login")).click();
		String exptitle="Find a Flight";
		String acttitle=driver.getTitle();
		if(acttitle.contains(exptitle))
		{
			System.out.println("Login success");
		}
		else
			
		{
			System.out.println("Login Fail");
		}
		}
		br.close();
driver.close();
	}

}
