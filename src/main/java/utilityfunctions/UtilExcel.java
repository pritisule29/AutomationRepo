package utilityfunctions;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public  class UtilExcel {
	static XSSFWorkbook workbook = null;
	static XSSFSheet sheet1 = null;
		
	public static void getMySheet() throws IOException {
		workbook = new XSSFWorkbook("C:\\src_automationRepo\\AutomationRepo\\TestData\\Credentials.xlsx");
		 sheet1 = workbook.getSheet("sheet1");
			
	}
	public static int getRowCount() throws IOException {
		getMySheet();
		int rowcount = sheet1.getPhysicalNumberOfRows();
		return rowcount;
		
	}
	public static int ColCount() throws IOException {
		getMySheet();
		int colcount = sheet1.getRow(1).getPhysicalNumberOfCells();
		return colcount;
				
	}
	public static String getCellData(int rowNo,int colNo) throws IOException {
		getMySheet();
		String data = sheet1.getRow(rowNo).getCell(colNo).getStringCellValue();
		return data;
		
	}
		
}
