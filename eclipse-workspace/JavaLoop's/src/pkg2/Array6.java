package pkg2;

public class Array6 {

	public static void main(String[] args) 
	{
		// Smallest Number from given array 
		// Given array
		int a[] = {1,7,91,8,2,64,0};
		int SmallNumber = a[0];
		for(int i=0; i<a.length; i++)
		{
           if (SmallNumber>a[i]) 
           {
        	   SmallNumber = a[i];
           }			
		}
		System.out.println("Small Number :"+ SmallNumber);
	}

}
