package pkg2;

public class HomePage {

public static void main(String [] args) 
{
	User k = new User();
	k.setuserName("Satish\n");
	k.setpassWord("Satish@123\n");
	k.setmobileNumber("7030357457\n");
	k.setemailId("Satishbhone@gmail.com\n");
	k.setplace("Pusad\n");
	System.out.println(k.getuserName()+k.getpassWord()+k.getmobileNumber()+k.getemailId()+k.getPlace());
}	

	}


