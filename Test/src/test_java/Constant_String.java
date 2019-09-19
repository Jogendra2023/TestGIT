package test_java;

public class Constant_String
{

	public static void main( String [] args)
	{
		String line = "My name is Jogendra2323";
		line = line.toLowerCase();
		int len = line.length();
		int constant = 0;
		
		for( int i =0; i< len; i++)
		{
			char ch = line.charAt(i);
			if(ch >= 'a' && ch<='z')
				constant++;
		}
		
		System.out.println("Constant in :" +constant);
	}
}
