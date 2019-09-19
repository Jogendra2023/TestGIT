package test_java;

import java.util.HashSet;

public class StringIntern {

	public static void main(String[] args) 
	{
		String s1 = new String("XYZ");
		String s2 = s1.intern();
		
		String s3 = "ABC";
		String s4 = s3.intern();
		
		
		
		//System.out.println(s1==s2);
		//System.out.println(s3==s4);
		
		//System.out.println(s1.equals(s2));
		HashSet<String> set = new HashSet<String>();
		set.add(new String("a"));
		set.add(new String("b"));
		set.add(new String("c"));
		 
		for(String a: set) {
			
			System.out.println(a);
		}

	}

}
