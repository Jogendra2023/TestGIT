package test_java;

public class Q6InnerOuterclass 
{

	public void outer()
	{
		System.out.println("outer Class");
	}
	
	public static class inner
	{
		public static void main(String... args)
		{
			Q6InnerOuterclass  ot = new Q6InnerOuterclass();
			ot.outer();
			
		}
		public void inner()
		{
			System.out.println("Inner class");
		}
	}
}
