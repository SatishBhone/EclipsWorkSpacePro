package pkg2;
public class User
{
	private String userName;
	private String passWord;
	private String mobileNumber;
	private String emailId;
	private String Place;


public void setuserName(String userName)
{
    userName = "Mr."+ userName; 
	this.userName = userName;	
	}

public String getuserName()
{
	return userName;
}

public void setpassWord(String passWord)
{
	passWord = "Mr."+ passWord; 
	this.passWord = passWord;	
	}

public String getpassWord()
{
	return passWord;
}

public void setemailId(String emailId) 
{
    this.emailId = emailId;
}

public String getemailId() 
{
    return emailId;	
}

public void setmobileNumber(String mobileNumber) 
{
	this.mobileNumber = mobileNumber;
}
public String getmobileNumber() 
{
 return mobileNumber;	
}

public void setplace(String Place) 
{
  this.Place = Place;	
}
 public String getPlace() 
 {
	 return Place;
 }

}