package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataSheet {

	
	//Step 4 - retain static keyword
	public static String[][] readExcel() throws IOException {
		//step 1 set path of the workbook
				XSSFWorkbook wb=new XSSFWorkbook("./excelSheet/EditLead.xlsx");
				XSSFSheet sheetValue = wb.getSheetAt(0);
		
				int rowcount = sheetValue.getLastRowNum();
	
				short cellcount = sheetValue.getRow(1).getLastCellNum();
				//Step 1
				String[][] data=new String[rowcount][cellcount];
				
				for (int i = 1; i <=rowcount; i++) {
					
					//cell value start from 0
					for (int j = 0; j < cellcount; j++) {
						String stringCellValue2 = sheetValue.getRow(i).getCell(j).getStringCellValue();
						
			    //Step 2	
						data[i-1][j]=stringCellValue2;
						
						
						
					}
				}
				
				
				//Step 3
				wb.close();
				return data;

	}

}
