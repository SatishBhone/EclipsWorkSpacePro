package pkg1;

import java.util.Scanner;

public class Armstrong1 {

	public static void main(String[] args) {
		// program whether the given number is Armstrong number or not by using while loop for 3 digit  input  
             Scanner sac= new Scanner(System.in);
             System.out.println("Enter three digit number:");
              int n = sac.nextInt(); 
              int temp = n;
              int r,sum=0;
              
              while(n>0)
              {
            	  r = n%10;
            	  n=n/10;
            	  sum = sum+r*r*r;
              }
           if(sum==temp)
           {
        	   System.out.println("it is Armstrong number");
           }
           else 
           {
        	   System.out.println("it is not an Armstrong number");
           }
    
	}
            	    
              
	}


