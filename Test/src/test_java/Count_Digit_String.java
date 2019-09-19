package test_java;

public class Count_Digit_String
{
	public static void main(String [] args)
	{
		String line = "M0y N8me i3s 3  Jog9898nd09ra";
		
		line = line.toLowerCase();
		int len = line.length();
		int digits = 0;
		
		for( int i=0; i<len; i++)
		{
		  char ch = line.charAt(i);
		  if(ch>='0' && ch<='9')
		  {
			  digits++;
		  }
		}
		System.out.println("Digits in String:" +digits);
	}
	
	 
	
}
