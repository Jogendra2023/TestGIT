package test_java;

public class ReverseAstatement {

	public static void main(String[] args) 
	{
		String x = "MY NAME IS JOGENDRA";
		String[] n = x.split(" ");
		for(int i=0; i<n.length; i++)
		{
			String word = n[i];	
			for (int j=word.length()-1;j>=0;j--)
			{
				System.out.print(word.charAt(j));
			}
			System.out.print(" ");
		}

	}

}
