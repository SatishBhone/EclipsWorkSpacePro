package stringMethods;

import java.util.Arrays;

public class ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //.equals
		String s1 = "Velocity";
		if(s1.equals("velocity"))
		{
			System.out.println("True");
		}
		else 
		{
			System.out.println("False");
		}
		
		//.length()
		System.out.println(s1.length());
		
		// .toUpperCase()
		System.out.println(s1.toUpperCase());
		
		//.toLowerCase()
		System.out.println(s1.toLowerCase());
		
		//.indexOf()
		System.out.println(s1.indexOf('o'));
		
		//.replace()
		String s2 = s1.replace('o','a');
		System.out.println(s2);
		
		//.endsWith()
		String s3= "Velocity is in katraj";
        
		if(s3.endsWith("raj")) 
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		} 
		//.concat("")
		System.out.println(s3.concat("(Pune)"));
	
		String p = "Search the latest phone with you";
		System.out.println(p.concat("(Pune4)"));
		
		//.split("a")
		String[] k = p.split(" ");
		System.out.println(Arrays.toString(k));
		String [] k1 = s1.split("");
		System.out.println(Arrays.toString(k1));
	
		//.contains("")
		if(p.contains("Search")) 
		{
			System.out.println("True");
		}
		else 
		{
			System.out.println("False");
		}
		System.out.println("=======================");
		
		// .intern()
		String s = new String("Mumbai");
		String ss = "Munbai";
		String b = s.intern();
		
		if(b==ss) 
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");	
		}
	}
}
