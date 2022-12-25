package pkg1;

public class ClassB extends ClassA {
     String c = "python";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ClassC k = new ClassC();
       System.out.println(k.a);
       System.out.println(k.c);
       
       k.m1();
       k.m3();
       k.m4();
	}
	public void m3() 
	{
		System.out.println("Method m3 from ClassB");
	}

}
