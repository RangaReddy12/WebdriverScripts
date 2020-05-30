package april22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox1 {

	public static void main(String[] args) throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//store month listbox into select class
		Select month=new Select(driver.findElement(By.xpath("//select[@title='Month']")));
		//verify month listbox is single or multi selection
		boolean value1=month.isMultiple();
		System.out.println(value1);
		//store year listbox into select class object
		Select year=new Select(driver.findElement(By.xpath("//select[@id='year']")));
		boolean value2=year.isMultiple();
		System.out.println(value2);
		//select one item from both month and year listbox with selectByvisible text
		month.selectByVisibleText("Oct");
		Thread.sleep(5000);
		year.selectByVisibleText("1975");
		Thread.sleep(5000);
		//select one item from both month and year listbox with selectByvalue
		year.selectByValue("1980");
		Thread.sleep(5000);
		//select one item from both month and year listbox with selectByIndex
		month.selectByIndex(12);
		System.out.println(month.getFirstSelectedOption().getText());
		Thread.sleep(5000);
		year.selectByIndex(50);
		System.out.println(year.getFirstSelectedOption().getText());
		Thread.sleep(5000);
		driver.quit();
	}

}
