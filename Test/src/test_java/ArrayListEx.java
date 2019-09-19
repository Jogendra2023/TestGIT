package test_java;

import java.util.ArrayList;
import java.util.Iterator;




public class ArrayListEx 
{
	
	public static void main(String args[])
	{
		
		ArrayList<String> li = new ArrayList<String>();
		li.add("Jogendra");
		li.add("Partap");
		li.add("Singh");
		li.add("Testing");
				
		/*for(int i=0; i<=li.size()-1; i++) 
		{
			
			System.out.println(li.get(i));
			if(li.get(i).equalsIgnoreCase("Singh"))
			
			{
				System.out.println("Postion of Given string :"+i);
			}
		}*/
		
		Iterator itr = li.iterator();
		int pos = 0;
		while(itr.hasNext())
		{
			String Item = (String) itr.next();
			
			System.out.println(Item);
			
			if(Item.equalsIgnoreCase("SINGH"))
			{
				System.out.println("We got the searched element at" + pos+  "Position");
			}
			
			
			pos++;
		}
		
		
	}	

}
