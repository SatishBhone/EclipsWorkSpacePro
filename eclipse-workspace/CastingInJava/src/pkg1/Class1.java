package pkg1;

public class Class1 {
	//Implicit casting example 

	public static void main(String[] args) {
		
		int a = 10; 

		float c= a; // int to float
        float b=20.56f;
        
        float sum = c + b;
        System.out.println(sum);
        int sum1 = (int) sum; // float to int 
        System.out.println(sum1);
        
	// Explicit casting example
        
        int d =300;
        byte e = (byte)d;
        System.out.println(e);
        
        
	}

}
