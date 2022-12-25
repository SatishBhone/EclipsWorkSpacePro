package pkg1;

import java.util.Scanner;

public class ClassEEratmatic_operator {

	public static void main(String[] args) {
		Scanner sac = new Scanner(System.in);
		System.out.println("Enter the value ");
		int k= sac.nextInt();
		
		
	int a = 100;
	int  b = 200;
	int c = 300;
	int d = k-b-c;
	int sum = 20; 
	int sum1= sum - 20;
	int sum2= sum1 +50;
	int sum3= sum2  - sum1;
	System.out.println(sum);
	System.out.println(sum1);
	System.out.println(sum2);
	System.out.println(sum3);
	System.out.println(d);
	
	for (int i=1; i<=5; i++)
	{
		for (int j=1; j<=5; j++)
		System.out.print(i );
		System.out.println();
	}	

	}

}
