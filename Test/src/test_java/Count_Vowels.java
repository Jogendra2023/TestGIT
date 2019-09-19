package test_java;

public class Count_Vowels {

	public static void main(String[] args) 
	{
		String line = "AEIOU";
		int vowels = 0;
		line = line.toLowerCase();
		int len = line.length();
		for(int i=0; i<len; ++i)
		{
			char ch = line.charAt(i);
			if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u')
			{
				vowels++;
			}
		}

		System.out.println("Vowels:" +vowels);
	}

}
