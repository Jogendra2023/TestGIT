package test_java;

public class ReverseStirngwithoutinbuiltfunction {

	public static void main(String[] args) 
	{
		String str1 = "MY NAME IS JOGENDRA";
		String reverse = "";
		
		
		
		int length = str1.length();
		System.out.println(length);
		int end = length;
		int start=0;
		for (int i =length-1; i>=0; i--)
		{
			if(str1.charAt(i) == ' ' || i ==0)
			{
				
				if(!(i== 0)) start = i+1;
				else start =0;
				
				for(int j = start; j<end;j++) {
					
					reverse += str1.charAt(j);
				}
				end = i;
				if(!(i== 0))
					reverse += " ";
			}
		}
		System.out.println(reverse);
		System.out.println(reverse.length());

	}

}
