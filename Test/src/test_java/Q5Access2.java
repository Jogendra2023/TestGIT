package test_java;

public class Q5Access2 {

	public static void main(String[] args) {
	
		Q5Access obj1 = new Q5Access();
		Q5Access obj2 = new Q5Access();
		obj1.x = 0;
		obj1.increment();
		obj2.increment();
		System.out.println(obj1.x+ " " + obj2.x);
		
	}

}
