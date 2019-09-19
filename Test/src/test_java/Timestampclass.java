package test_java;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.internal.TestResult;

public class Timestampclass {

	@Test(testName="XYZ")
	public static void main1() {

		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		
		String timestamp = new SimpleDateFormat("MMDDYYYHHMMSS").format(cal.getTime());
		
		System.out.println("Time Stamp:- " +timestamp);
		
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMDD_HHMMSS");
		String timestamp3 = sdf.format(calendar.getTime());
		
		
		ITestResult itr = new TestResult();
		String x = itr.getName();
		String y = itr.getTestName();
		System.out.println(x);
		
		
		
		
		
	

	}

}
