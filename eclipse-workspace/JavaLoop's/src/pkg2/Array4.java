package pkg2;

import java.util.Arrays;

public class Array4{
	  
	public static void main (String[] args)
	{
		// Reverse the given array 
		
		int []a = {12,78,36,96,112,45};
		 System.out.println(Arrays.toString(a));
		 
		 for( int i=0; i<(a.length/2); i++)
          {
        	  int k = a[(a.length-1) -i];
        	  
        	  a[(a.length-1)-i] = a[i];
        	  
        	  a[i]=k;
         	}
		 System.out.println(Arrays.toString(a));
	}
}