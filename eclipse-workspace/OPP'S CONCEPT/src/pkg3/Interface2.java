package pkg3;

public  interface  Interface2 {

	    String a = "Classes";
	    int d = 200;
	    
	    void m4();
	    
	    default void m6()
	    {
	    	System.out.println("Default method from interface 2");
	    }
}
