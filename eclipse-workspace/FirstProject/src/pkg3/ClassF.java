package pkg3;

import java.util.Scanner;

public class ClassF {

	public static void main(String[] args) {
		
		 Scanner scn = new Scanner(System.in);
		 String a = "username";
         System.out.println(" Enter user name");
         String username =scn.next();
         String b = "password";
         System.out.println("Enter password");
         String password = scn.next();
        
if(a.equals(b) == b.equals(a)) 
{ 
	System.out.println("login is successful");
	
}
else 
{
	System.out.println("username and password is incorrect");
	}

    scn.close();
 
    	}

}
