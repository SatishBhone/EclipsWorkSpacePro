package pkg1;

import java.util.ArrayList;

public class ClassB {

	public static void main(String[] args) {
	//Program for sum all the integers
		ArrayList<Object> list = new  ArrayList<>();
	list.add("10");
	list.add("Velocity");
	list.add("%");
	list.add(50);
	list.add("Classes");
	list.add("60");
	list.add('#');
	list.add(80);
	
	int sum = 0;
	 for(Object k:list) 
	 {
		 try {
			 sum = sum + Integer.parseInt(k.toString());
		 }catch(Exception ee)
		 {
			 System.out.println(ee);
		 }
	 }
       System.out.println(sum);
	}

}
