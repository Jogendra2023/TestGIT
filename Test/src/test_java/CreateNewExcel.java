package test_java;


import java.io.File;
import java.io.FileOutputStream;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class CreateNewExcel {

	public static void main(String[] args) throws Exception
	{		
		
		// Get a Calendar and set it to the current time.
        Calendar cal = Calendar.getInstance();
        cal.setTime(Date.from(Instant.now()));
        // Create a filename from a format string.
        // ... Apply date formatting codes.
        String result = String.format("Wallmonkey_Test_%1$tY_%1$tm_%1$td_%1$tk_%1$tS_%1$tp", cal);

        // Display our result filename.
        System.out.println("Filename:");
        System.out.println(result);
        try
        {
        	
        	HSSFWorkbook wb = new HSSFWorkbook();
             FileOutputStream fos = new FileOutputStream(new File(""));
             HSSFSheet sh= wb.createSheet("WallMonkey_TestData");
             wb.write(fos);
             fos.close();
             
        }
        catch(Exception e)
        {
        	System.out.println("Could not create Excel:" +e);
        }
       
        System.out.println("Excel file created");
        
       
    }
	
	
}
