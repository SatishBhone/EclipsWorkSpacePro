package pkg1;

public class Classjio {

	 static int datapack1 = 499;  // this is static global  variable 
	static int datapack2 = 599;

	static int voicepack1 = 200;
	static int voicepack2 = 300;

	public static void combopack1()    // this is static method 1
	{
	int combo1= datapack1 + voicepack1; 
	System.out.println("Reacharge with:"+combo1);

	}

	public static void combopack2() // this is static method 2
	{
	 
	int combo2= datapack2 + voicepack2;
	
	System.out.println("Reacharge with:"+combo2);
	

	}
}
