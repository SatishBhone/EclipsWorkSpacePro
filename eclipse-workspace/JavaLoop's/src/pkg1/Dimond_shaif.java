package pkg1;

public class Dimond_shaif {

	public static final void main(String[] args)
	
	{
	

Dimond_shaif k = new Dimond_shaif();

		k.method1();
	} 

	public void method1() 
	{
		for(int i=1; i<=5; i++) 
		{
			for(int j=4;j>=i; j--) 
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1; i<=5; i++) 
		{
			for(int j=1; j<=i; j++) 
			{
				System.out.print(" ");
			}
			for(int j=4;j>=i; j--) 
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
	
}
