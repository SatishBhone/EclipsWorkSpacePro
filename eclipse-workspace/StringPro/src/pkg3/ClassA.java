package pkg3;

import java.util.ListIterator;
import java.util.Vector;

public class ClassA {

	public static void main(String[] args) {

	Vector vList = new Vector();
	
	vList.add('@');
	vList.add('3');
	vList.add('%');
	vList.add('$');
	vList.add('7');
	vList.add('*');
	
	ListIterator lItr = vList.listIterator();

	while (lItr.hasNext())
	{
		System.out.println(lItr.next());
	}
	
	System.out.println("=================");
	
	
	while (lItr.hasPrevious()) 
	{
		System.out.println(lItr.previous());
	}
	}

}
