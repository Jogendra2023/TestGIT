package test_java;

public class Factorialrecrusion {

	static int factorial(int n){      
       
	
		 if (n < 1) 
			 return 1;
		 else
		 {
			 System.out.println(n);
			 int value = n*factorial(n-1);
			// System.out.println(n);
			 return value;
		 }
		 
		     
	}
	public static void main(String[] args)
	{
		System.out.println("Factorial of 5 is: "+factorial(5)); 

	}

}
