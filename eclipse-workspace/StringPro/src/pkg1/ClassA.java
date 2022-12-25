package pkg1;

import java.util.Arrays;

public class ClassA {

	public static void main(String[] args) {
		
		//logic to reverse the string 
		
		String a = "Satish";
		String b = "";
		
		for(int i = a.length()-1; i>=0; i--) 
		{
			b = b + a.charAt(i);
		}
            System.out.println(b);
            
      char[] chr = a.toCharArray();
      
      System.out.println(Arrays.toString(chr));
      
          int p=a.length();
         String e=""; 
      for(int i=p-1; i>=0; i--) 
      {
    	 e = e+a.charAt(i) ;
      }
      System.out.println(e);
	}

}

