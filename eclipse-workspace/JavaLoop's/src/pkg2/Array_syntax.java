package pkg2;

public class Array_syntax {

	public static void main(String[] args) 
	{   //Given Array
       int a[] = {2,5,8,23,64};
       System.out.println(a.length); //Size of an array - Ans -->5
       
       // Last index = size - 1
       System.out.println(a[a.length -1]); // last index value - Ans 64 

       int k1 = a[0];  //Data at index 0
       System.out.println(k1);
       
       int k2 = a[1];  // Data at index 1
       System.out.println(k2); 
              
       int k3 = a[2]; // Data at index 2
       System.out.println(k3);
       
       // How to change the value of a data at any index Array program
       
       int r1 = a[2];  //data at index 2
       System.out.println("Old value:"+ r1);
       
       // Changing value of an index 2
       
       a[2] = 88;
       
       int r2 = a[2];  // Data at index 2
       System.out.println("After Changing:"+ r2);
       
       
	}

}
