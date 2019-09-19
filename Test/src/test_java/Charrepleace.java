package test_java;

public class Charrepleace 
{

	public static void main(String[] args) 
	{
		String x = "MUNANDER";
		
		
		String n = x.replace("N", "A");
		System.out.println(n);
	}
	
	static 
	{
		System.out.println("IN Static Block");
		
		String x= "MUNANDER";
		
		char[] P = x.toCharArray();
		
			
		char Source = 'N';
		char target = 'A';
		
		for(int i = 0; i< P.length; i++)
		{

			System.out.println(P[i]);
			if( P[i] == Source )
			{
				P[i] = target;
			}
		}
		
		String fs = String.valueOf(P);
		System.out.println(fs);
	}

}
