package may5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteText1 {

	public static void main(String[] args) throws Throwable{
		File f=new File("G://sample.txt");
		f.createNewFile();
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		WebDriver driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
String para1=driver.findElement(By.xpath("//p[contains(text(),'Primus Bank')]")).getText();
String para2=driver.findElement(By.xpath("//p[contains(text(),'In 1975, the Malta')]")).getText();
bw.write(para1);
bw.newLine();
bw.newLine();
bw.write(para2);
bw.flush();
bw.close();
driver.close();
	}

}
