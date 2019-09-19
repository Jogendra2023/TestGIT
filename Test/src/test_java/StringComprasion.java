package test_java;

public class StringComprasion 
{
	public static void main(String[] args)
	{
		String x = new String("ABC");
		String y = new String("ABC");
		
		System.out.println(x.equalsIgnoreCase(y));
		System.out.println(x == y);
		
		String a = "ABC";
		String b = "ABC";
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a == b);
		
		String abc = new String("Jogendra");
		System.out.println(abc == "Jogendra");
	}

}
