package pkg2;

import java.util.Arrays;

// Sort a given array in ascending order
public class Array5 {

	public static void main(String[] args)
	{   
		// Given array
		int a[] = {2,91,8,23,64};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++) 
			{
				if(a[j] > a[i])
				{
					int h = a[i];
					a[i] = a[j];
					a[j] = h;
				}
			}
		}
    	System.out.println(Arrays.toString(a));
    	
    
	}

}
