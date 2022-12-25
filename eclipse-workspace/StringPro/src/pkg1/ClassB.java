package pkg1;

import java.util.Arrays;


public class ClassB {

	public static void main(String[] args) {
		
		String a = "suraj is going to school ";
		String [] b = a.split(" ");
		System.out.println("Previous Array of String is:"+Arrays.toString(b));
		
	      String R = "";
		for(int i=0; i<b.length; i++)  
		{
			String c = b [i];
			String Rc = "";
		for(int j= c.length()-1; j>=0; j--) // jarus 
		{
			Rc= Rc+c.charAt(j);
			
		}
		R= R + Rc+" ";
		}
          System.out.println("Reverse string is :"+ R);
	}

}
