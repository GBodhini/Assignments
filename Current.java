class Current extends Account
{
	private int overdraft;
	public Current() {}
	public Current(int accountNumber, double balanceAmount, String openingDate,int overdraft) {
		super(accountNumber,balanceAmount,openingDate);
		this.overdraft = overdraft;
	}
	public int getOverdraft() {
		return overdraft;
	}
	public void setOverdraft(int overdraft) {
		this.overdraft = overdraft;
	}
	
}
