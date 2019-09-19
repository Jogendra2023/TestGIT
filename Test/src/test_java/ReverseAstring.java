package test_java;

public class ReverseAstring {

	public static void main(String[] args)
	{
		String x = "THIS METHOD OF STRING";
		String[] y = x.split(" ");
		String reverse = "";
		for(int i = 0 ; i<= y.length-1; i++)
		{
			String words = y[i];
			for(int j = words.length()-1;j>=0; j--)
			{
				System.out.print(words.charAt(j));
			}
			
			System.out.print(" ");
		}
		
		
		
		
}
}