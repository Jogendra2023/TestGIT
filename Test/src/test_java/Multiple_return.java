package test_java;

public class Multiple_return {
	// Function code
	public static int[] something()
	{
	    int number1 = 1;
	    int number2 = 2;
	    return new int[] {number1, number2};
	    
	}

	// Main class code
	public static void main(String[] args) {
	  int result[] = something();
	  System.out.println(result[0]+" " +result[1]);
	}

}
