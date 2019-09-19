package test_java;

public class Outer {
	
	public void sameoutermethod()
	{
		new inner();
	}
	public static class inner
	{
		public inner()
		{
			System.out.println("Inner class");
		}
	}

	public static void main(String[] args)
	{
		Outer ot =new Outer();
		ot.sameoutermethod();
		
		
	}

}
