package test_java;

public class ThrowException 
{
	public  ThrowException(int age)
	{
		
			if(age < 18)
			{
				
				throw new ArithmeticException("Inside if you can't vote ");	
		    }
			
		
		
			else
		   {
				System.out.println("you can vote");
					
	      }
		}
		
	
			public static void main(String[] args)
	{
		
		ThrowException v = new ThrowException(19);
		ThrowException v1 = new ThrowException(10);
		
		
	}

}
