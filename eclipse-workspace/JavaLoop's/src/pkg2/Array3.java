package pkg2;


import java.util.Arrays;
import java.util.Scanner;

public class Array3 {                        // a[] ={ 34,66,77,68,34,66,77,68}

	public static void main(String[] args)
	{
        //print duplicate value from array
         Scanner sac=new Scanner(System.in);
         System.out.println("Enter size of Array");
         int size=sac.nextInt();
         int a[]= new int [size];
         
         for(int i=0; i<size; i++) 
         {
        	 System.out.println("Enter your number "+(i+1)+":");
        	 a[i]=sac.nextInt();
         }
       System.out.println(Arrays.toString(a));  
       
       for(int i=0; i<size-1; i++) 
       {  
    	   int count=1;
       
    	   for(int j=i+1; j<size; j++) 
    	   {
    		  if(a[i]==a[j]) 
    		   {
    			   count=count+1; 
    		   }
    	   }
    	   System.out.println(a[i]+"Repeated"+count);
       }
       System.out.println(Arrays.toString(a));
	}   
}

