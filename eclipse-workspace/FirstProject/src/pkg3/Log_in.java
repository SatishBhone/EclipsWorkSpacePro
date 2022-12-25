package pkg3;

import java.util.Scanner;


public class Log_in{

	public static void main(String[] args) {
		String email="satishbhone@gmail.com";
		String password= "Sat123";
     
		Scanner scn =new Scanner(System.in);
	
	    System.out.println("Enter valid email address");
	    String user_email=scn.next();
	    System.out.println("Enter valid password"); 
	    String user_password=scn.next();
	 
	    
	if (user_email.equals(user_password)== user_password.equals(user_email))
		
	 {
		 System.out.println("You have successfully login");
	 }else
	 {
		System.out.println("youhave enter rong password or email address");
	 }

	scn.close();
	
	}
	 

}
