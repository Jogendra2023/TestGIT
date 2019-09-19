package test_java;

public class SingletonConstructor
	{
		 static int count;
		
		private SingletonConstructor( int count)
		{
			System.out.println("Singleton Constructor");
			this.count = 1;
			count = count++;
			System.out.println(count);
		}
		
		public static void main(String [] args) 
		{
			SingletonConstructor a1 = new SingletonConstructor(1);
			SingletonConstructor a2 = new SingletonConstructor(1);
			SingletonConstructor a3 = new SingletonConstructor(1);
			SingletonConstructor a4 = new SingletonConstructor(1);
			SingletonConstructor a5 = new SingletonConstructor(1);
		}
	}
