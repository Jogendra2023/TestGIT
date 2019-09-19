package test_java;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListnofrequency {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		
		number.add(1);
		number.add(1);
		number.add(4);
		number.add(1);
		number.add(4);
		number.add(1);
		number.add(7);
		
		System.out.println("Frequency:" +Collections.frequency(number, 1));
		
	
	}

}
