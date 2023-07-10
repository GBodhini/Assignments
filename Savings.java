class Savings extends Account
{
	private int minBalance;
	private double Interest;
	public Savings() {}
	public Savings(int accountNumber, double balanceAmount,String openingDate,int minBalance, double interest) {
		super(accountNumber,balanceAmount,openingDate);
		this.minBalance = minBalance;
		Interest = interest;
	}
	public int getMinBalance() {
		return minBalance;
	}
	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
	}
	public double getInterest() {
		return Interest;
	}
	public void setInterest(double interest) {
		Interest = interest;
	}
	
	
}