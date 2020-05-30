package may19;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWrite {

	public static void main(String[] args)throws Throwable {
		//access path of excel file
	FileInputStream fi=new FileInputStream("g://Dummy.xls");
	//get wb from file
	XSSFWorkbook wb=new XSSFWorkbook(fi);
	//get sheet from wb
	XSSFSheet ws=wb.getSheet("Login");
	//count no of columns
	int rc=ws.getLastRowNum();
	System.out.println("No of rows are::"+rc);
for(int i=1;i<=rc;i++)
{
	//get username cell data from login sheet
	String username=ws.getRow(i).getCell(0).getStringCellValue();
	//get password cell data from login sheet
	String password=ws.getRow(i).getCell(1).getStringCellValue();
	System.out.println(username+"    "+password);
	//write as pass into results column
	ws.getRow(i).createCell(2).setCellValue("Pass");
	
}
fi.close();
FileOutputStream fo=new FileOutputStream("F://mrngresults.xlsx");
wb.write(fo);
fo.close();
wb.close();
	}

}






