package test_java;

public class Local_variable 
{

	static String name = "Priyanshu"; // Static variable 
	
	int id = 3; //Instance Variable 
	
	public static void main(String[] args) 
	{
		
		Local_variable l = new Local_variable();
		l.display();
		
	}
	public void display() 
		{
		System.out.println(id);
		System.out.println(name);
		}

}
