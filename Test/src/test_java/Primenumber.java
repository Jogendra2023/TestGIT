package test_java;

public class Primenumber {
	
	static void   primes(int x)
	{
	     int count = 1;
	    for(int i= 2; i<x; i++)
	    {
	    	if (x % i == 0 )
	    	{
	    		count = count+1;
	    		break;
	    	}
	    	
	    }
	    if(count > 1)
	    {
	    	System.out.println("Not Prime");
	    }
	    else System.out.println("prime");	
}
	public static void main(String[] args)
	{
		primes(10);
	}
	
}