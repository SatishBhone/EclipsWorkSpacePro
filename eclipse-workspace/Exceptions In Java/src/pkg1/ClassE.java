package pkg1;

public class ClassE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try 
       {
    	   throw new VelocityException();
       }catch (VelocityException e) 
       {
    	   System.out.println(e);
       }
	}

}
