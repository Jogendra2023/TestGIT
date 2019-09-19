package test_java;

import java.util.ArrayList;
import java.util.HashSet;

public class HashMap {

	public static void main(String[] args) 
	{
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Saurabh");
		ar.add("Yagya");
		ar.add("Vivekanand");
		ar.add("Nitin");
		ar.add("Ratish");
		ar.add("Saurabh");
		ar.add("Jogendra");
		ar.add("Yagya");
		ar.add("Vivekanand");
		
		HashSet<String> hs = new HashSet<String>();
		
		for(String x: ar)
		{
			//System.out.println(x);
			//hs.add(x);
		}
		System.out.println(" ");
		System.out.println("HashSet");
		for(String x : ar)
		{
			if(hs.add(x)== false)
			{
				System.out.println(x);
			}
			else
				hs.add(x);
		}
	}

}
