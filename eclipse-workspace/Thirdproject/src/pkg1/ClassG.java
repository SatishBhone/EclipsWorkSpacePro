package pkg1;

public class ClassG {
     int a;
	String  b;
	
	public  ClassG(String h)
	{
	a=30;
	b = h;	
   }
	public static void main(String[] args) {

  System.out.println("xyz");
		
		ClassG k = new ClassG("velocity");
		ClassG k1 = new ClassG("Classes");
		System.out.println(k.b);
		System.out.println(k1.b);
		k.m1(); 
	}
	public void m1() 
	{
		System.out.println(a);
	   System.out.println("satish");
	}
  
}
