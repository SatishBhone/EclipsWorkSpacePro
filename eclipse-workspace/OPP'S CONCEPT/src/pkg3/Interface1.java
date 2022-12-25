package pkg3;

public interface Interface1{
	
          String a ="Satish";
          int b=100;

          void m1();
 
          void m2();   //by defaulat public and abstract methods
 
     public static void m5()
 {
	 System.out.println("statica method.....");
 }
 
     default void m6() // Default method in later version of jdk
 {
	 System.out.println("default method from Interface 1"); 
 }
 
      public default  void m7() //public non-static method
 {
	 System.out.println("Can not create public non-static method");
 }
}
