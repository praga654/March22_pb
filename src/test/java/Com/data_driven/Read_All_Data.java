package Com.data_driven;

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

public class Read_All_Data {
	public static void all_data() throws IOException {
		File f = new File("C:\\Users\\Hassan\\eclipse-workspace\\March22_PB\\automationtest_case\\practice data driven.xlsx");
		FileInputStream fis = new FileInputStream (f);
		Workbook wb     = new XSSFWorkbook(fis);         
       Sheet s=wb.getSheetAt(0);
       int r=s.getPhysicalNumberOfRows();
       System.out.println("All data");
       for(int i=1;i<r; i++) {
    	   Row r1 = s.getRow(i);
    	   int c=r1.getPhysicalNumberOfCells();
    	   for(int j=0;j<c;j++)
    	   {
    		   Cell c1 = r1.getCell(j);
    		   CellType type = c1.getCellType();
    		   if (type.equals(CellType.STRING)) {
    	    	   String stringCellValue = c1.getStringCellValue();
    	    	   System.out.println(stringCellValue);
    			
    		} else if(type.equals(CellType.NUMERIC)) {
    			double d=c1.getNumericCellValue();
    			int n= (int)d;
    			String value = String.valueOf(n);
    			System.out.println(value);
    		}

    		   
    	   }
    			   
       }
       wb.close();
	}
	public static void particular_row_Data() throws IOException {
		File f = new File("C:\\Users\\Hassan\\eclipse-workspace\\March22_PB\\automationtest_case\\practice data driven.xlsx");
		FileInputStream fis = new FileInputStream (f);
		Workbook wb     = new XSSFWorkbook(fis);         
       Sheet s=wb.getSheetAt(0);
       Row r1 = s.getRow(4);
       int c=r1.getPhysicalNumberOfCells();
       System.out.println("Particular row data");
	   for(int j=0;j<c;j++)
	   {
		   Cell c1 = r1.getCell(j);
		   CellType type = c1.getCellType();
		   if (type.equals(CellType.STRING)) {
	    	   String stringCellValue = c1.getStringCellValue();
	    	   System.out.println(stringCellValue);
			
		} else if(type.equals(CellType.NUMERIC)) {
			double d=c1.getNumericCellValue();
			int n= (int)d;
			String value = String.valueOf(n);
			System.out.println(value);
		}
	   }
	   wb.close();
	}
	public static void particular_column() throws IOException  {
		File f = new File("C:\\Users\\Hassan\\eclipse-workspace\\March22_PB\\automationtest_case\\practice data driven.xlsx");
		FileInputStream fis = new FileInputStream (f);
		Workbook wb     = new XSSFWorkbook(fis);         
       Sheet s=wb.getSheetAt(0);
       int r=s.getPhysicalNumberOfRows();
       System.out.println("*****Particular column data**********");
       for(int i=0;i<r; i++) 
       {
    	   Row r1 = s.getRow(i);
    	   Cell c1 = r1.getCell(0);
		   CellType type = c1.getCellType();
		   if (type.equals(CellType.STRING)) {
	    	   String stringCellValue = c1.getStringCellValue();
	    	   System.out.println(stringCellValue);
			
		} else if(type.equals(CellType.NUMERIC)) {
			double d=c1.getNumericCellValue();
			int n= (int)d;
			String value = String.valueOf(n);
			System.out.println(value);
		}

		   
	   }
       wb.close();
	}
	public static void main(String[] args) throws IOException  {
		all_data();
		particular_row_Data();
		particular_column();
	}


	}
	
    	   
    	   
		
	

		   
       

	   
   
		   

      
        
		
		
	


	
	




 