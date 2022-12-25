package pkg1;

public class SBI implements RBI{

	@Override
	public void creditScore() {
		System.out.println("Cibil score maust be : 750");
		
	}

	@Override
	public void interestRate() {
		System.out.println("providing intrest rate : 5.5%");
		
	}

	@Override
	public void homeLoanInterestRate() 
	{
		System.out.println("Home loan interest rate is: 12%");
		
	}
	public void WithdrawlLimit() 
	{
		System.out.println("Withdrawl Limit is : 75000");
	}
}
