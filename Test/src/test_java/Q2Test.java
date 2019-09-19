package test_java;

public class Q2Test {

	enum session 
	{
		WINTER,SPRING,SUMMER, FALL
		
	}
	public static void main(String... args)
	{
		System.out.println(session.SPRING.ordinal());
	}

}
