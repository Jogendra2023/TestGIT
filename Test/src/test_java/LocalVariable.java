package test_java;

public class LocalVariable
{

	public static int y;
	public int z;
	
	public static void main(String[] args)
	{
		 int x=9;
		 System.out.println(x);
		 System.out.println(y);
		 
		 LocalVariable l = new LocalVariable();
		 System.out.println(l.z);
		

	}

}
