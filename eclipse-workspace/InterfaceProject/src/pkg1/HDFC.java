package pkg1;

public class HDFC implements RBI
{

	@Override
	public void creditScore() {
		System.out.println("Cibil score maust be : 730");
		
		
	}

	@Override
	public void interestRate() {
		System.out.println("Interest rate is: 6.5%");
	}

	@Override
	public void homeLoanInterestRate() {
		System.out.println("HomeLone Interest Rate is :7.5% ");
	}
	
	public void WithdrawlLimit() 
	{
		System.out.println("Withdrawl Limit is : 50000");
	}

}
