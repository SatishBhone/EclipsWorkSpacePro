package pkg1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ClassA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     demo();
	}
	
	public static void demo() throws InterruptedException 
	{
		int a = 100;
		for(int i=0; i<10; i++) 
		{
		   Thread.sleep(2000); // compile time exception
		   System.out.println(a);
		}
	}
       public static void getData() throws FileNotFoundException 
       {
    	   FileInputStream file = new FileInputStream("");
       }
}
