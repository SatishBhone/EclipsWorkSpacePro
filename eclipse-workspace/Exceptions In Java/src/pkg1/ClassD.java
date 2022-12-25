package pkg1;

public class ClassD {

	public static void main(String[] args) {
	
			int a=100;
	        int[] k = {2,45,85,36};
			
			try 
			{
				System.out.println(k[4]);
			}
			catch(Exception e)
			{
				System.out.println(e);
				System.out.println("last index of array must be(size of array-1)");
			}
			finally 
			{
				System.out.println("finally Called");
			}
			System.out.println(a);
		}
	}


