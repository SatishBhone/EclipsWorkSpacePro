package pkg3;

public class ImplementationClass implements Interface1,Interface2 {
	
        public static void main(String [] args) 
   {
        	
	ImplementationClass k = new ImplementationClass();
     
	     k.m1();
	     k.m2();
	     k.m4();
	     k.m6();
	    
	     
}
	public void m4() 
	{
		System.out.println("Competating body of m4 method");
	}
	
	public void m1() 
	{
		System.out.println("m1 methdo is avilavble in both interface but in implementation only one method is created"); 
	}
	
	public void m2() 
	{
		System.out.println("Competing body of m2 method");
	}
	
	public void m6() 
	{
		Interface1.super.m6();
		Interface2.super.m6();
	}
      // m6() is in both interface1 and interface and intreface2 so, we call particular m6 with the help of super keyword.   

}
