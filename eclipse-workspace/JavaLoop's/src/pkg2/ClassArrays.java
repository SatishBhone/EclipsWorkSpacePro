package pkg2;

import java.util.Arrays;
// 
public class ClassArrays { 

	public static void main(String[] args)
	{
		int[]b = new int[5];
		b[0] = 10;
		b[1] = 20;
		b[2] = 30;
		b[3] = 40;
		b[4] = 50;
		
		System.out.println(b[3]);
		System.out.println(b.length);
		System.out.println("=====================");
		
		String[] c = {"Velocity","is","in","Katraj"};
		
		System.out.println(c[3]); 
		System.out.println(c.length);
		System.out.println("=======================");
		
		for (int i=0; i<c.length; i++)
		{
			System.out.print(c[i]+" ");
		}
		System.out.println();
		System.out.println("==========================");
		
		System.out.println(Arrays.toString(b));
	}

}
