package pkg3;

public class ClassD {

	public static void main(String[] args)
	{int p1 = 88;
	 int p2 = 65;
	 int p3 = 54;
	  
	 if(p1>p2)
	 {
		if(p1>p3)
		{	System.out.println("p1 is oldest");
		}
		if(p2>p3) 
		{
			System.out.println("p3 is yongest"); 
        }  
		else{
			System.out.println("p2 is yongest");
		}
	   
	}
	 else{
		 System.out.println("p3 is oldest");
		 System.out.println(" p2 is yongest");
	      } 
	 
	 { 
	 
	  if(p2>p3) 
	 {
		 System.out.println("p2 is oldest");
		 
		if(p1>p3) 
		{
			System.out.println("p3 is youngest");
		}
		else 
		{
			System.out.println("p1 is youngest");
		}
		
	 }
	 else
	 {
		 System.out.println("p3 is oldest");
		 System.out.println("p1 is youngest");
	 }
	 }
	
	}
}
	