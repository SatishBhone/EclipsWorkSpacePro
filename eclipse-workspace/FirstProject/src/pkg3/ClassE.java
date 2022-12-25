package pkg3;

import java.util.Scanner;

public class ClassE {    //Grade marks program

	public static void main(String[] args)
	{ 
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Your Marks:");
		int mark = scn.nextInt();
		
		if (mark > 90) 
		{
			System.out.println("Grade: A+ (Distination)");
		}
		else if(mark>80 && mark<=90) 
		{
			System.out.println("Grade: A (Distination)");
		}else if(mark>70 && mark<=80) 
		{
			System.out.println("Grade: B (First Class)");
		} else if (mark>60 && mark<=70) 
		{
			System.out.println("Grade: C (First Class)");
		} else if (mark>50 && mark<=60) 
		{
			System.out.println("Grade: D (First Class)");
		} else if (mark<=50 && mark>=35) 
		{
			System.out.println("Grade: E (Second Class)");
		} else if (mark<35) 
		{
			System.out.println("Fail ");
		}
		
	  scn.close();
	
	}
}
