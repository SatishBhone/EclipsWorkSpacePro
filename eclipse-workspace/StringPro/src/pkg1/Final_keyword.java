package pkg1;

public class Final_keyword {

	public static void main(String[] args) {
		// Identify the output of the java program 
	  //and state the reason.
		final int i;
		i = 20;
		int j=i+20;
		int h= j+30;
		System.out.println(i+" "+j);
		
//The above code will generate a compile-time error
 //at Line 11 saying - [error: variable i might already 
//have been initialized]. 
//It is because variable ‘i’ is the final variable.
//And final variables are allowed to be initialized 
//only once, and that was already done on line no 9.

	}

}
