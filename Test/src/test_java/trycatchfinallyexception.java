package test_java;

public class trycatchfinallyexception {

	public static int methodreturn()
	{
	try
	{
		int x =5;
		System.out.println("Inside Try block");
		return 6;
	}
	catch (Exception e)
	{
		System.out.println("Inside catch Exception");
		return 7;
	}
	catch(Throwable e)
	{
		System.out.println("Inside Airthmetic Exception");
		return 8;
	}
	finally
	{
		System.out.println("inside finally block");
		return 9;
	}

	}
	public static void main(String [] args)
	{
		System.out.println(methodreturn());
	}

}
