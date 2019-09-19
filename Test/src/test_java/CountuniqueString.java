package test_java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CountuniqueString 
{
	public static void main(String [] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("RAM");
		list.add("SITA");
		list.add("RAM");
		list.add("LAXMAN");
		list.add("RAM");
		list.add("SITA");
		list.add("BHARAT");
		list.add("RAM");
		
		Set<String> x = new HashSet<String>(list);
		
		System.out.println("******************************************");
		System.out.println("INSIDE SET");
		for(String j :x)
		{
			System.out.println(j);
		}
	
	}
	
	static
	{
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("RAM");
		list.add("SITA");
		list.add("RAM");
		list.add("LAXMAN");
		list.add("RAM");
		list.add("SITA");
		list.add("BHARAT");
		list.add("RAM");
		
		System.out.println("Size of list is :" +list.size());
		
		ArrayList<String> newlist = new ArrayList<String>();
		System.out.println("Size of new list is :" +newlist.size());
		for(int i=0; i<list.size() ; i++)
		{
			if(!newlist.contains(list.get(i)))
			{
				newlist.add(list.get(i));
				System.out.println("Item added to List is:" +list.get(i));
			}
			else
			{
				System.out.println("Already Exist");
			}
						
		}
		System.out.println("************New List Created***************");
		for(String v : newlist)
		{
			
			System.out.println(v);
		}
	}

}
