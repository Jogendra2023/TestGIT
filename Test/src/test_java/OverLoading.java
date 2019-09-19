package test_java;

public class OverLoading
{
	public static void main(String [] args) 
	{
		OverLoading o = new OverLoading();
		o.m1();
		o.m1("XXX");
	}
	
	public void m1()
	{
		System.out.println("Inside m1");
	}
	
	private String m1(String x) 
	{
		String value = x ;
		System.out.println("Inside me ");
		System.out.println(value);
		return value;
	}
}
