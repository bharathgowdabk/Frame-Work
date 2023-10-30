package generic_script;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_Excel {
	public static String fetch_data(String sheet,int row,int cell)
	{
		String valu="";
		try
		{
			FileInputStream f=new FileInputStream("");
			Workbook book = WorkbookFactory.create(f);
			Sheet s=book.getSheet("");
			Row r=s.getRow(0);
			Cell c=r.getCell(2);
			 valu=c.toString();
			System.out.println(valu);
		}
		catch(Exception a)
		{
			System.out.println("Unable to open");
		}
		return valu;
		
		}
}

