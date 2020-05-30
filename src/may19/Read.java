package may19;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {

	public static void main(String[] args)throws Throwable {
		//read path of excel
		FileInputStream fi=new FileInputStream("f://Dummy.xlsx");
		//get wb from file
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		//get sheet from wb
		XSSFSheet ws=wb.getSheet("Login");
		//get first row from sheet
		XSSFRow row=ws.getRow(0);
		//count no of rows in a sheet
		int rc=ws.getLastRowNum();
	//	Count no of columns in first row
		int cc=row.getLastCellNum();
		System.out.println("no of rows are::"+rc+"  "+"no of columns are::"+cc);
//print first column second row data from Login sheet
		String username=ws.getRow(1).getCell(0).getStringCellValue();
		//print second column second row data from Login sheet
		String password=ws.getRow(1).getCell(1).getStringCellValue();
		System.out.println(username+"    "+password);
fi.close();
wb.close();
	}

}
