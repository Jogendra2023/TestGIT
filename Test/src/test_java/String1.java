package test_java;

public class String1 
{

	public static void main(String args[])
	{
		String sentence = "Hello World Test";
		String[] splitsen = sentence.split(" ");
		for(int i=splitsen.length-1; i>=0; i--)
		{
			char x[] = splitsen[i].toCharArray();
				for(int j = x.length-1; j>=0; j--)
				{
					System.out.print(x[j]);
				}
			System.out.print(" ");
		}
		
		
		
	}
}
