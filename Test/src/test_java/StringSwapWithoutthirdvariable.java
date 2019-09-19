package test_java;

public class StringSwapWithoutthirdvariable {

	public static void main(String[] args) 
	{
		String a = "Jogendra";
		String b = "Singh";
		System.out.println( a = a+b);
		b=a.substring(0, a.length()-b.length());
		a = a.substring(b.length());
		
		System.out.println("a is :- "+a+ "b is :- "+b);

	}

}
