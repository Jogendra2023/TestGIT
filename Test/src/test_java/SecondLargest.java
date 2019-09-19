package test_java;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		
		int [] b ={44,66,99,77,33,88, 22,55};  
		
		Arrays.sort(b);
		System.out.println(b[b.length-2]);
		for(int t: b)
		{
			System.out.println(" Element in asending order:- " +t);
		}
		

	}

}
