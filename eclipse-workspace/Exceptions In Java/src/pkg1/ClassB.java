package pkg1;

public class ClassB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int a = 100;
		try 
		{
			int k = a/0;
		}catch(Exception e) 
		{
			System.out.println(e);
			
			System.out.println("you can not divide number by zero");
		}
		
		System.out.println(a);
	}

}
