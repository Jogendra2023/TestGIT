package test_java;

public class IncrementDecrement
{
 
	public static void main(String [] args)
	{
		int x=4;
		int y=0;
		
		y=x++;
		System.out.println("Final Value of Y:" +y+   "Final value of X:" +x);
		
		y=x--;
		System.out.println("Final Value of Y:" +y+   "Final value of X:" +x);
		
		y=++x;
		System.out.println("Final Value of Y:" +y+   "Final value of X:" +x);
		
		
		y = --x;
		System.out.println("Final Value of Y:" +y+   "Final value of X:" +x);
		
	}
}
