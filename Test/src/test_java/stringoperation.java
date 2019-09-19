package test_java;

public class stringoperation 
{
	public static void main(String[] args)
	{
		StringBuilder x = new StringBuilder("Chetu");
		
		StringBuilder xy = new StringBuilder("India");
		x.append(xy);
		
		System.out.println(x);
		
		String g = "Hello";
		String y = "India";
		
		String c = g.concat(y);
		System.out.println(c);
		
		
	}

}
