package may15;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Demo {
ExtentReports report;
ExtentTest test;
@BeforeTest
public void generatereport()
{
	//specify path of html report
report=new ExtentReports("./ExtenReports/Report.html",true);
}
@Test
public void passTest()
{
	test=report.startTest("Passed Test");
	test.assignAuthor("Ranga Senior Manager");
	test.assignCategory("Functional");
	test.log(LogStatus.PASS, "Teswt case pass");
}
@Test(timeOut=4000)
public void FailTest()throws Throwable
{
test=report.startTest("Failed Test");
test.assignAuthor("Ranga Senior Manager");
test.assignCategory("Functional");
test.log(LogStatus.FAIL, "Fail Test");
Thread.sleep(5000);
}
@Test
public void skipTest()
{
	test=report.startTest("Skipped Test");
	test.assignAuthor("Ranga Senior Manager");
	test.assignCategory("Functional");
	test.log(LogStatus.SKIP, "Test Case Skipping");
	throw new SkipException("Test Case Skip");
	
}
@AfterMethod
public void tearDown()
{
	report.endTest(test);
	report.flush();
		
}
}
