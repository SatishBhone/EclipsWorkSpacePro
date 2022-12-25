package pkg2;

public class ConcreteClass1 extends Abst {
public static void main(String[] args) 
{
	ConcreteClass1 k = new ConcreteClass1();
	      k.m1();
	      k.m2();
	      k.m3();
	     k.m5();
	}

public void m1() 
{
	
	System.out.println("Completed m1 method in concrete Class");
}
public void m2() 
{
	super.m3();
System.out.println("Completed m2 mthod in concrete class");
}
public void m3() 
{
	System.out.println("changing method body");	
}
public void m5()  // Can not change the body of final Method
{
	System.out.println(" hi");
	
	}
}
