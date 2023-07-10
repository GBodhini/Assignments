class Test4 
{
	public static void main(String[] args)
	{
		Savings s= new Savings(1234,5000,"9/3/2002",500,1.0);
		Current c= new Current(5678,10000.0,"15/06/1999",100);
		System.out.println("Savings Account" );
		System.out.println("AccountNumber: "+ s. getAccountNumber() );
		System.out.println("BalanceAmount: "+ s. getBalanceAmount() );
		System.out.println("Opening Date: "+ s. getOpeningDate() );
		System.out.println("MinBalance: "+ s. getMinBalance()  );
		System.out.println("MinBalance: "+ s. getInterest() );
		System.out.println("Current Account" );
		System.out.println("AccountNumber: "+ c. getAccountNumber() );
		System.out.println("BalanceAmount: "+ c. getBalanceAmount() );
		System.out.println("Opening Date: "+ c. getOpeningDate() );
		System.out.println("overdraft: "+ c.getOverdraft()  );
		
	}
}
