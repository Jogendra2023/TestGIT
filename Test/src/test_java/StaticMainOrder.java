package test_java;

public class StaticMainOrder extends Constructorassign1
{

	public static void main(String[] args) 
	{

		
		StaticMainOrder s = new StaticMainOrder();
		
		
	}
	
	static
	{
		System.out.println("Inside Static MainOrder Static block");
	}
	public void m2()
	{
		System.out.println("Inside StaticMainOrder simple method");
	}

	public StaticMainOrder()
	{
		System.out.println("Inside StaticMainOrder constructor");
	}
}