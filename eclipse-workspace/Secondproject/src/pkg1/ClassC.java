package pkg1;

public class ClassC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1) for this category no decimal number 
		
		byte a = 100;
		short b = 3299;
		int c = 500; 
		long d = 200254288784L;    //if number is greater than integer capacity than we have to use L
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		//2) We can write decimal/fractional number using this 
		
		float e = 12.56f;                   // small f is needed 
		double  f= 45.23568784d;           // small d is needed
		
		System.out.println(e);
		System.out.println(f);
		//3) a. write character always in single quote 
		//   b. boolean  have only two values 1. true 2. false 
		
		char g = '#';
		boolean j= false;
		System.out.println(j);
		System.out.println(g);
		//==========================
		
		int pp = 12;
		System.out.println(pp);  // print--> 12
		float ppp=12;
		System.out.println(ppp);  // print --->12.0
		
		
	}

}
