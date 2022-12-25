package pkg1;

public class ClassH {
	int a;
	String b;
 
	public ClassH(int a,String b) 
	{
		this.a = a;
		this.b = b;
		
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args)
	{
		new ClassH(100,"Satish");
		
		new ClassH(200, "Bhone");
	}
	
}

