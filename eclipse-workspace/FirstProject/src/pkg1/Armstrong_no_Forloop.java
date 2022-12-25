package pkg1;

import java.util.Scanner;

public class Armstrong_no_Forloop {

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the three digits number =");
		int num1 = scn.nextInt();
		
		int num = num1;
		
		int r = num%10;
		num = num/10;
		 
		int j = num%10;
		num = num/10;
		
		int q = num % 10; 
		num = num /10;
		
		int p = r*r*r + j*j*j + q*q*q;
		
		if(p==num1)
		{
			System.out.println(" it is Armstrong number");
		}		
		else 
		{
			System.out.println("it is not the Armstrong number");
		}
		scn.close();
	}

}
