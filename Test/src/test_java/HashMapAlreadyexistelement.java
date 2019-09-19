package test_java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapAlreadyexistelement {

	public static void main(String[] args) 
	{

		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Delhi");
		ar.add("Pune");
		ar.add("Mumbai");
		ar.add("Kolkata");
		ar.add("Lucknow");
		
		LinkedHashMap<String, String> hm = new LinkedHashMap<String, String>();
		
		for(String x: ar)
		{
			//System.out.println(x);
		}
		
		hm.put("D", "Delhi");
		hm.put("P", "Pune");
		hm.put("M", "Mumbai");
		hm.put("K", "Kolkata");
		hm.put("L", "Lucknow");
		
		
		
		Iterator itr = hm.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<String, String> entry = (Entry<String, String>) itr.next();
			
			String key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println("Key Is: "+key + "  ,  Valye"+value);
		}
		

	}

}
