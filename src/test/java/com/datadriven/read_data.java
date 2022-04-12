package com.datadriven;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class read_data {
	
	/*public static void particularcell() throws IOException 
	{
		File f = new File("C:\\Users\\HP\\Desktop\\Test Case Report\\Demo Excel For DD.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(1);
		Row r = s.getRow(2);
		Cell c = r.getCell(1);
		CellType type = c.getCellType();
		
			
		
			if (type.equals(CellType.STRING)) {
				String cellValue = c.getStringCellValue(); 
					System.out.println(cellValue);
			}
				else if (type.equals(CellType.NUMERIC)) {
					double cellValue = c.getNumericCellValue();
						int value = (int) cellValue;
							System.out.println(value);	
				}		wb.close();
								
	}*/
	public static void all_data() throws IOException {
		
		File f = new File("C:\\Users\\HP\\Desktop\\Test Case Report\\Demo Excel For DD.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(1);
		
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
				for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
					Cell c = r.getCell(j);
						CellType type = c.getCellType();
							if (type.equals(CellType.STRING)) {
								String value = c.getStringCellValue();
									System.out.println(value);								
							}
							else if (type.equals(CellType.NUMERIC)) {
								double numericCellValue = c.getNumericCellValue();
									String value = Double.toString(numericCellValue);
										System.out.println(value);
							}
					
				}
		}
	wb.close();	
		
	}
				
				public static void main(String[ ] args) throws IOException {
					all_data();
		
	}
}