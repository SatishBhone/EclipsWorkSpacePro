package pkg1;

public class NormalClass {
public static void main(String[]args) 
{
	System.out.println("SBI");
	 SBI sbi = new SBI();
	 sbi.creditScore();
	 sbi.homeLoanInterestRate();
	 sbi.interestRate();
	 sbi.WithdrawlLimit();
	 
	 System.out.println("================\n");
	 
	 System.out.println("HDFC");
	 HDFC hdfc = new HDFC();
	 hdfc.creditScore();
	 hdfc.homeLoanInterestRate();
	 hdfc.interestRate();
	 hdfc.WithdrawlLimit();
	 
	 System.out.println("==================\n");
	 
	 System.out.println("Kotak");
	 KOTAK kotak = new KOTAK();
	 kotak.creditScore();
	 kotak.homeLoanInterestRate();
	 kotak.interestRate();
	 }
}
