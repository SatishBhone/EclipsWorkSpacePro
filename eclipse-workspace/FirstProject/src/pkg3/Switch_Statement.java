package pkg3;

import java.util.Scanner;

public class Switch_Statement {

	public static void main(String[] args)  // Switch Statement Program
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Marks");
		int mark = scn.nextInt();
		
		switch(mark ) 
		{
		case 95:
			System.out.println("First Class Grade: A+");
			break;
		case 85:
			System.out.println("First Class Grade:A");
			break;
		case 75:
			System.out.println("First Class Grade: B+");
			break;
		case 60:
			System.out.println("First Class Grade: B"); 
			break; 
		case 55:
			System.out.println("Second Class Grade: c+");
			break;
		case 45:
			System.out.println("Second Class Grade: c");
			break;
		case 35:
			System.out.println("Third Class Grade: D ");
			default:
				System.out.println("Fail");
	         			
		}

	}

}
