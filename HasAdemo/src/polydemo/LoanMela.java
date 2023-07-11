package polydemo;
public class LoanMela
{
	public static Loan ProduceLoan()
	{
		switch(new java.util.Random().nextInt()%3)
		{
		case 0:
			return new HomeLoan(3,5.0,100000);
		case 1:
			return new VehicleLoan(2,5.0,900000.0);
		default:
			return new PersonalLoan(4,4.0,300000.0);
	}
}
}