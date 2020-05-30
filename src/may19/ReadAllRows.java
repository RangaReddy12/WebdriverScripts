package may19;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAllRows {

	public static void main(String[] args)throws Throwable {
		//read path of excel
		FileInputStream fi=new FileInputStream("f://Dummy.xlsx");
		//get workbook from file
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		//get sheet from wb
		XSSFSheet ws=wb.getSheetAt(0);
		//count no of rows
		int rc=ws.getLastRowNum();
		System.out.println("No of rows are::"+rc);
		for(int i=1;i<=rc;i++)
		{
			//read username cell data
			String username=ws.getRow(i).getCell(0).getStringCellValue();
			//read password cell data
			String password=ws.getRow(i).getCell(1).getStringCellValue();
			System.out.println(username+"   "+password);
		}
fi.close();
wb.close();
	}

}
