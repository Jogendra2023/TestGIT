package test_java;

public class overrideparentclass2 extends overrideparentclass 
{
	@Override
	public void m1()
	{
		System.out.println("child class method");
	}

	public static void main(String[] args) 
	{
		overrideparentclass o1 = new overrideparentclass2();
		
		o1.m1();
	}

}
