package pkg1;

public class For_Loop {

 static	public  void main(String[] args)   
	
	// Print velocity 5 times
	{
	 
	for(int i=1; i<=5;  i++ )
	{
		System.out.println("Velocity");  
	}
	
    // Print 0 to 10 
	 
	for(int i=0; i<=10; i++ )
	{
	  System.out.println(i);
	}
	
	//Addition of first 10 Numbers
	int count = 0;    
	for(int i=1; i<=10; i++) 
	{
		count=count+i;
		
	}
	System.out.println(count);
	
	// Only Add Odd number up to 10     // 1,3,5,7,9,
	int sum = 0;                                     
	for(int i=1; i<=10; i++) 
	{
		sum=sum+i;
		  i=i+1;
	}
	System.out.println(sum);
	
	// Addition of Even number  // 2,4,6,8,10
	int s = 0;                                     
	for(int i=0; i<=10; i++) 
	{
		s=s+i;
		  i=i+1;
	}
	System.out.println(s);
	}

} 