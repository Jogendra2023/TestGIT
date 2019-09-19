package test_java;

public class Simpleaddprogram {

	public static void main(String[] args)
	{

		int num = 100;
		int n1 = 0 ; int n2 = 1; int n3;
		int count =0; int sum = 0;
		
		for(int i =1 ; i<num;i++)
		{
				
			
			n3 = n2+n1;
			//System.out.print(n3);
			//System.out.print(" ");
			n1 = n2;
			n2 = n3;
			if(n3%2 == 0)
			{
				System.out.println(n3);
				System.out.println(" ");
				sum = sum+n3;
				count++;
				if(count == 10)
				{
					System.out.println("SUM : "+ sum);
					break;}
				
			}
			
			}
		}

	}

