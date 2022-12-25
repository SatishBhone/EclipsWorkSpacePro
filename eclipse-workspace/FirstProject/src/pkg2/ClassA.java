package pkg2;

 import pkg1.ClassAirtel;
import pkg1.Classjio;
 
public class ClassA extends ClassAirtel {

	public static void main(String[] args) {
	
		ClassAirtel k = new ClassAirtel();
	
        ClassA p = new  ClassA();     // for non static variable we can create  object 
      p.combopack1();
      p.combopack2(); 

      System.out.println(datapack1);
      System.out.println(datapack2);
      
     

           Classjio.combopack1();   //to call static variable we can call direct to method, variable,or class 
           Classjio.combopack2();
           
	}

}
