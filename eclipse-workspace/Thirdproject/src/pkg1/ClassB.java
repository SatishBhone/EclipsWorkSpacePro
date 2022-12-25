package pkg1;

public class ClassB {
//globail static variable 
	int a = 100;
	int o = 100;
	String b="Veocity";
	static char c='@';
	static boolean d=true;
	
	public ClassB() 
	{
		
	}
	public ClassB(int a)
	{
		o = a;   //500
	}
	//to call non-static global variable we need to create object 
	public static void main(String[] args)
	{
		
		ClassB kk = new ClassB();
		ClassB kkk = new ClassB();
		System.out.println(kk.a);
		System.out.println(kkk.o);

		System.out.println(c);
		
		kk.m1();
		m3();

	}
	public void m1()
	{
		System.out.println(a);
		System.out.println(b);
	}
        public void m2()
        {
            System.out.println(c);        	
        }
        public static void m3() 
        {
        	ClassB kk= new ClassB();
        	System.out.println(kk.a);
        	System.out.println( d );
        }
}
