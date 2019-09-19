package test_java;

public class Armstrongnumber {

	public static void main(String... args)
	{
		int num =153;
		int a,c=0, temp;
		temp=num;
		
		while(num>0)
		{
			a=num%10;
			num=num/10;
			c=c+(a*a*a);
		}
		if(temp==c)
			System.out.println("Armstrong");
		else 
			System.out.println("Not Armstrong");

		int b=0, d=0;
		/*for (int i= 1; i<1000; i++)
		{
			int ctemp=i;
			while(ctemp >0)
			{
			b=ctemp%10;
			ctemp=ctemp/10;
			d=d+(b*b*b);
			}
			if(i == d)System.out.println(i);
			d=0;
		}*/
	
	}
		
}
