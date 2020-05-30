package may20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class OrangeHRM {
WebDriver driver;
ExtentReports report;
ExtentTest test;
Workbook wb;
Sheet ws;
Row row;
File screen;
FileInputStream fi;
FileOutputStream fo;
@BeforeTest
public void setUp()
{
	report=new ExtentReports("./ExtenReports/Report.html");
	driver=new ChromeDriver();
	
}
@Test
public void verifyLogin()throws Throwable
{
	fi=new FileInputStream("g://Logindata.xlsx");
	wb=WorkbookFactory.create(fi);
	ws=wb.getSheet("Login");
	row=ws.getRow(0);
	int rc=ws.getLastRowNum();
	int cc=row.getLastCellNum();
	Reporter.log("no of rows are::"+rc+"   "+"No of columns are::"+cc,true);
	for(int i=1;i<=rc;i++)
	{
		test=report.startTest("Validate Login Test");
		test.assignAuthor("Ranga");
		test.assignCategory("Data Driven");
		driver.get("http://orangehrm.qedgetech.com/");
		driver.manage().window().maximize();
	String username=ws.getRow(i).getCell(0).getStringCellValue();	
	String password=ws.getRow(i).getCell(1).getStringCellValue();
	driver.findElement(By.name("txtUsername")).sendKeys(username);
	driver.findElement(By.name("txtPassword")).sendKeys(password);
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(4000);
	if(driver.getCurrentUrl().contains("dash"))
	{
		Reporter.log("Login Success",true);
		ws.getRow(i).createCell(2).setCellValue("Login Success");
		ws.getRow(i).createCell(3).setCellValue("Pass");
		test.log(LogStatus.PASS, "Login Success");
	}
	else
	{
		String message=driver.findElement(By.id("spanMessage")).getText();
		Reporter.log(message,true);
		ws.getRow(i).createCell(2).setCellValue(message);
		ws.getRow(i).createCell(3).setCellValue("Fail");
		test.log(LogStatus.FAIL, message);
	screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screen, new File("G://Screens//Login//iteration"+i+"loginpage.png"));
	}
	report.endTest(test);
	report.flush();
	}
	fi.close();
	fo=new FileOutputStream("G://LoginResults.xlsx");
	wb.write(fo);
	fo.close();
	wb.close();
}
@AfterTest
public void tearDown()
{
	driver.close();
}
}












