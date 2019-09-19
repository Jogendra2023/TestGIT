package test_java;

import java.io.IOException;
import java.nio.channels.spi.AbstractInterruptibleChannel;

public class ExceptionThrow2  extends ExceptionThrow1
{
	
	
	 public static void main (String [] args)
	 {
		
		 ExceptionThrow2 e1 = new ExceptionThrow2();
		 try
		 {
			 e1.throw1();
			
		 }
		 catch(Exception e)
		
		 {
		 System.out.println(e);
		 }
	
	 }
}
