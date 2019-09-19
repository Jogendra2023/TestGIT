package test_java;

public class Randomnumbermobile {

	public static void main(String[] args) {
		  String characters = "1234567890";

	      String result = "";

	      for (int i = 0; i < 10; i++) {

	          result += characters.charAt((int) (Math.random()*10));
	          
	     }
	      System.out.println(result);

	}

}
