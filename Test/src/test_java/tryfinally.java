package test_java;

public class tryfinally {

	private static String OS = System.getProperty("os.name").toLowerCase();
	public static void main(String[] args) {
		System.out.println(OS);
		if(isWindows())
		{
			System.out.println("This is windows Plateform");
		}
	}
		public static boolean isWindows() {

			return (OS.indexOf("win")>=0);

		}

	}


