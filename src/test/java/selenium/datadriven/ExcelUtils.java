package selenium.datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils() throws IOException {
		FileInputStream file = new FileInputStream("E:/rashedkarim/workspace-eclipse/sqa1/data/Users.xlsx");
		workbook = new XSSFWorkbook(file);
		sheet = workbook.getSheet("users");
	}
	
	public int getRowCount() {
		return sheet.getLastRowNum();
	}
	
	public int getColumnCount() {
		return sheet.getRow(0).getLastCellNum();
	}

}
