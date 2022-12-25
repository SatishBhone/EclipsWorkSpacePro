package pkg1;

import java.util.Scanner;

public class ClassA {

	public static void main(String[] args) 
	{
	   Scanner scn = new Scanner(System.in);
	   
	   System.out.println("Enter the number=");
	   int num1 = scn.nextInt();
	   
	   int num = num1;
	    
	   int p = 0;
	   
	   while(num>0) 
	   {
		   int r =num % 10;
		   p=(r*r*r)+ p; 
		   num = num/10;
	   }
	   
	   if(p==num1) 
	   {
		   System.out.println(" It is Armstrong number");
		   
	   } 
	   else 
	   {
		   System.out.println("It is not Armstrong number");
	   }
	}
	 

}
