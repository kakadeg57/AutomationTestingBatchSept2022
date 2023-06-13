package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws IOException {
      		FileInputStream file = new FileInputStream("C:\\Users\\Nucleus Computer\\eclipse-workspace\\MavenAutomationTesting\\TestData\\CompanyTestData.xlsx");		
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet("data");
		    int row = sheet.getLastRowNum();	
		    int column =  sheet.getRow(1).getLastCellNum();
		    System.out.println(row);
		    System.out.println(column);
		    
		    
		    for(int i=0; i<=row; i++) {
		    	
		    	for(int j=0;j<column; j++) {
		    		
		    	String data = 	sheet.getRow(i).getCell(j).toString();
			    	System.out.println(data +  "   ");
			    }
		    	System.out.println();
	}

}
}
	
