package org.actitime.generics;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author Somu Generic Class
 */
public class FileLib {
	FileInputStream fis;
	/**
	 * 
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return customer details
	 * @throws IOException
	 */
	public String getExcelValue(String sheet, int row, int cell) throws IOException {
		fis = new FileInputStream("./data/TestScript.xlsx");
		Workbook w = WorkbookFactory.create(fis);
		String value = w.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
	
	/**
	 * 
	 * @return browserName
	 * @throws IOException
	 */
	public String browser() throws IOException 
	{
		fis=new FileInputStream("./data/Commondata.property");
		Properties p = new Properties();
		p.load(fis);
		String browserName = p.getProperty("browser");
		return browserName;
	}
	/**
	 * 
	 * @param data
	 * @return url,username,password
	 * @throws IOException
	 */
	public String getProperty(String data) throws IOException 
	{
		FileInputStream fis = new FileInputStream("./data/Commondata.property");
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(data);
		return value;
	}
}
