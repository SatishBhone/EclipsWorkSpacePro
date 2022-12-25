package pkg1;

public class ClassJ {
// global static variables
	static int a= 100;
	static String b="Velocity";
	static char c='@';
	static boolean d=true;
	// to call non-static global variable we need to create object
	public static void main(System[] args) {
		
		int a=50;
		
          m1();   
		m2();
		m3();
	}
	private static void m1() 
	
	{
		System.out.println(b);
	}
	private static void m2() 
	
	{
		System.out.println(c);
	}
	
	private static void m3()
	
	{
		System.out.println(d);
	
	}
		}

