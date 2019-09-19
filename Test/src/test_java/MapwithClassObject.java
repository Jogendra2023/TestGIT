package test_java;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapwithClassObject 
{
	int id,
	salary;
	String role, name;
	
	public  MapwithClassObject(int id, String role, String name, int salary) 
	{
		this.id = id;
		this.role = role;
		this.name = name;
		this.salary = salary;
	}
	
	public Map<Object, Object> puttomap()
	{
		Map<Object, Object> addtomap = new LinkedHashMap<Object, Object>();
		addtomap.put(1, id);
		addtomap.put(2, role);
		addtomap.put(3, name);
		addtomap.put(4, salary);
		
		return addtomap;
	}
	
	public static void main(String[] args) 
	{
		MapwithClassObject m1  =new MapwithClassObject(101,"Test1 Engineer","XYZ 1 SINGH", 11500);
		MapwithClassObject m2  =new MapwithClassObject(102,"Test2 Engineer","XYZ 2 SINGH", 12500);
		MapwithClassObject m3  =new MapwithClassObject(103,"Test3 Engineer","XYZ 3 SINGH", 13500);
		MapwithClassObject m4  =new MapwithClassObject(104,"Test4 Engineer","XYZ 4 SINGH", 14500);
		
		//ArrayList<Map<Object, Object>> addtolist = new ArrayList<Map<Object, Object>>();
		
		/*addtolist.add(m1.puttomap());
		addtolist.add(m2.puttomap());
		addtolist.add(m3.puttomap());
		addtolist.add(m4.puttomap());
		for(Map<Object, Object> m :addtolist ) 
		{
			System.out.println(m);
		}
		*/
	
		
		
	
		for(Map.Entry<Object, Object> entry :  (m1.puttomap().entrySet()))
		{
			System.out.println("Key:- " +entry.getKey()+ "  Value:- "+entry.getValue());
		}

	}

}
