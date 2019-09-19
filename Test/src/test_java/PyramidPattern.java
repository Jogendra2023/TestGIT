package test_java;

public class PyramidPattern {

	public static void main(String[] args) 
	{
		int n =5;
		pyramidpattern(n);
		

	}
	public static void pyramidpattern(int n)
	{
		int i,j,k;
		 for ( i=1; i<=n; i++) 
	        { 
	            // Print space in decreasing order 
	            for ( j=n; j>i; j--)
	            {
	                System.out.print(" ");
	            }
	            // Print star in increasing order
	            for ( k=1; k<=(i * 2) -1; k++)
	            {
	                System.out.print("*");
	            }
	            System.out.println();
		
	        }
	        }

}
