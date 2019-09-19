package test_java;



public class trycatchfinally {

	public static void main(String[] args) throws Throwable
	{
		int i =4; 
		String s = null;
		String x = "ABC";

		try
		{
			System.out.println("Inside Try block");
			System.out.println(s.length());
			
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch (NumberFormatException e)
		{
			System.out.println(e);
		}
		catch (NullPointerException e)
		{
			System.out.println(e);
					
		}
		catch (OutOfMemoryError e)
		{
			System.out.println("out of memmory");
		}
		finally
		{
			System.out.println("Inside finally block");
		}


	}

}
