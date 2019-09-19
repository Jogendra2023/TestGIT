package test_java;

public class FindMissingElement {
	static int getMissingNo(int[] a, int n) 
    { 
        int i, total; 
        total = (n + 1) * (n + 2) / 2; 
        for (i = 0; i < n; i++) 
        {
            total = total- a[i]; 
        }
        return total; 
    } 

	public static void main(String[] args) 
	{
		 int[] a = { 6, 3, 2, 5, 1 }; 
	        int miss = getMissingNo(a, a.length); 
	        System.out.println(miss); 

	}

}
