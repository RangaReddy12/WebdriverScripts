package may19;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UsingInterface {
//valueOf is string function which converts integer type into string type
	public static void main(String[] args) throws Throwable{
		FileInputStream fi=new FileInputStream("g://Dummy.xlsx");
		Workbook wb=WorkbookFactory.create(fi);
		Sheet ws=wb.getSheet("Login");
		int rc=ws.getLastRowNum();
		System.out.println("no of rows are::"+rc);
		for(int i=1;i<=rc;i++)
		{
			String username=ws.getRow(i).getCell(0).getStringCellValue();
if(wb.getSheet("Login").getRow(i).getCell(1).getCellType()==Cell.CELL_TYPE_NUMERIC)
{
	//get cell which contains integer type data
	int celldata=(int)wb.getSheet("Login").getRow(i).getCell(1).getNumericCellValue();
	//convert intger type celldata cell into string type
	String password=String.valueOf(celldata);
	System.out.println(username+"     "+password);
	
}
//write as fail into results cell
ws.getRow(i).createCell(2).setCellValue("Fail");
		}
fi.close();
FileOutputStream fo=new FileOutputStream("F://results.xlsx");
wb.write(fo);
fo.close();
wb.close();
	}

}
