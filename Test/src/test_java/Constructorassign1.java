package test_java;

public class Constructorassign1 
{
	public  Constructorassign1()
	{
		System.out.println("Inside the Constructorassign1 Constructor");
	}
	public static void m1()
	{
		System.out.println("Class Constructorassign1 Simple method");
	}

	public static void main(String [] args)
	{
		Constructorassign1 c = new Constructorassign1();
		System.out.println("Main Method");
	}
	static
	{
		System.out.println("Constructorassign1 static block");
	}
}
