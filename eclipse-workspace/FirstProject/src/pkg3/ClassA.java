package pkg3;

public class ClassA {

	public static void main(String[] args) 
	{

      int p1 = 55;
      int p2 = 65; 
      int p3 = 54;
      if ((p1 > p2) && ( p1 > p3)) 
      
      {
System.out.println("p1 is old");

      } 
      else if((p2>p1&&p2>p3)) 
      {
    	  System.out.println("p2 is oldest");
    	 
      }  
      else   if((p3>p1&&p3>p2)) 
      {
    	  System.out.println("p3 is oldest");
      }
      else {
    	  System.out.println(" all are same ");
      }
      if(p1<p2&&p1<p3)
      {
    	 System.out.println("p3 is  yongest");
    	 
      }else if(p2<p1 && p2<p3)
      {
    	  System.out.println("p2 is  yongest");
    	  
      }else if (p3<p2 && p3 < p1)
      {
    	  System.out.println("p3 is yongest");
      }
      
      
	}

}
