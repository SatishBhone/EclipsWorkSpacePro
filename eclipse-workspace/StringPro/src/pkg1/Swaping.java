package pkg1;

public class Swaping {

	public static void main(String[] args) {
		// Swaping two numbers with out using third variable
	
		int x = 25;
		int y = 23;
		System.out.println("Before swaping x:"+x);
		System.out.println("Before swaping y:"+y);
	                            //x = x + y;     25+23=48
	   	                        //y = x - y;     48-23=25
		                        //x = x - y;     48-25=23
		System.out.println("================");
		x = x+y;
		y= x-y;
		x=x-y;
		System.out.println("After swaping x:"+x);
		System.out.println("After swaping y:"+y);

	}

}
