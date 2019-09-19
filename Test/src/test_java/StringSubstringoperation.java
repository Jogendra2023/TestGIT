package test_java;

public class StringSubstringoperation 
{
	public static void main(String[] args)
	{
		String str1 = "My Name is JOGENDRA";
		String str2 = str1.substring(5);
		System.out.println(str2);
		
		String str3 = str1.substring(5, 9);
		System.out.println(str3);
	
		String str4 = str1.toUpperCase();
		System.out.println(str4);
		
		String str9 = "My Name is XYZ";
		System.out.println(str1.length());
		String reverse= "";
		
		String[] str5 = str1.split(" ");
		
		
		for(int i = str5.length-1; i>=0; i--)
		{
			char[] ch = str5[i].toCharArray();
			for(int j =str5[i].length()-1; j>=0;j--)
			{
				reverse+= ch[j];
				/*System.out.print(ch[j]);*/
			}
			if(!(i == 0))
			reverse+= " ";
			/*System.out.print(" ");*/
		}
		System.out.println(reverse);
		System.out.println(reverse.length());
		
	}
	
}
