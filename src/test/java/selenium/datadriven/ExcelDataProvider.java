package selenium.datadriven;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.testng.annotations.DataProvider;

public class ExcelDataProvider {

	@DataProvider(name = "excel-user-data")
	Object[][] excelDataSet() throws IOException {

		ExcelUtils excel = new ExcelUtils();

		int rowCount = excel.getRowCount();
		int colCount = excel.getColumnCount();

		Object[][] data = new Object[rowCount][colCount];

		for (int row = 1; row <= rowCount; row++) {
			XSSFRow currentRow = ExcelUtils.sheet.getRow(row);
			for (int col = 0; col < colCount; col++) {
				String celData = currentRow.getCell(col).toString();
				data[row - 1][col] = celData;
			}
		}
		return data;
	}
}
