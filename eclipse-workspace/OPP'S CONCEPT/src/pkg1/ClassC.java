package pkg1;

public class ClassC extends ClassB {

	public  static void main(String[] args) {
		// TODO Auto-generated method stub
          ClassC u = new ClassC();
           
           u.m1();
		  u.m3();
		  u.m4();
		  System.out.println(u.a);
		  System.out.println(u.c);
	}

	public static void m4()
	{
		System.out.println("method m4 from ClassC");
	}
}
