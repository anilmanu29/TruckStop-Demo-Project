package UTILITY;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel 
{	
		  public  Object[][] getCellData(String path, String sheetName) throws InvalidFormatException, IOException
		  {
		  FileInputStream stream = new FileInputStream(path);
		  Workbook workbook = WorkbookFactory.create(stream);
		  Sheet s = workbook.getSheet(sheetName);
		  int rowcount = s.getLastRowNum();
		  int cellcount = s.getRow(0).getLastCellNum();
		  Object data[][] = new Object[rowcount][cellcount];
		  for (int i = 1; i <=rowcount; i++) 
		  {
		   Row r = s.getRow(i);
		   for (int j = 0; j<cellcount; j++) 
		   {
		   Cell c = r.getCell(j);
		try {
		        if(c!=null)
		        {
		            switch(c.getCellType())
		            {
		                case Cell.CELL_TYPE_BOOLEAN:
		                    
		                    data[i-1][j]=String.valueOf(c.getBooleanCellValue());
		                    break;
		                case Cell.CELL_TYPE_NUMERIC:
		                    
		                    data[i-1][j]=BigDecimal.valueOf(
			                        c.getNumericCellValue()).toPlainString();
		                    break;
		                case Cell.CELL_TYPE_STRING:
		                    data[i-1][j]=String.valueOf(c.getStringCellValue());
		               
		                    break;
		                case Cell.CELL_TYPE_FORMULA:
		                    data[i-1][j]=String.valueOf(c.getCellFormula());
	
		                    break;
		                case Cell.CELL_TYPE_BLANK:
		                    
		                    break;
		            }
		        }
		}
catch (Exception e)
{
e.printStackTrace();
}
		   }
		  }
		return data;
}
		  public  Object[][] InvalidCellData(String path, String sheetName) throws InvalidFormatException, IOException
		  {
		  FileInputStream stream = new FileInputStream(path);
		  Workbook workbook = WorkbookFactory.create(stream);
		  Sheet s = workbook.getSheet(sheetName);
		  int rowcount = s.getLastRowNum();
		  int cellcount = s.getRow(0).getLastCellNum();
		  Object data[][] = new Object[rowcount][cellcount];
		  for (int i = 1; i <=rowcount; i++) 
		  {
		   Row r = s.getRow(i);
		   for (int j = 0; j<cellcount; j++) 
		   {
		   Cell c = r.getCell(j);
		try {
		        if(c!=null)
		        {
		            switch(c.getCellType())
		            {
		                case Cell.CELL_TYPE_BOOLEAN:
		                    
		                    data[i-1][j]=String.valueOf(c.getBooleanCellValue());
		                    break;
		                case Cell.CELL_TYPE_NUMERIC:
		                    
		                    data[i-1][j]=BigDecimal.valueOf(
			                        c.getNumericCellValue()).toPlainString();
		                    break;
		                case Cell.CELL_TYPE_STRING:
		                    data[i-1][j]=String.valueOf(c.getStringCellValue());
		               
		                    break;
		                case Cell.CELL_TYPE_FORMULA:
		                    data[i-1][j]=String.valueOf(c.getCellFormula());
	
		                    break;
		                case Cell.CELL_TYPE_BLANK:
		                    
		                    break;
		            }
		        }
		}
catch (Exception e)
{
e.printStackTrace();
}
		   }
		  }
		return data;
}
}
		  
		           