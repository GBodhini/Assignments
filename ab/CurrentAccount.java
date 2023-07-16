package com.ab;
public class CurrentAccount extends Account
{
	private int overDraftLimit;
	public CurrentAccount() {}
	public CurrentAccount(int accountNo, String openedDate, double balance,int overDraftLimit) {
		super(accountNo,openedDate,balance);
		this.overDraftLimit = overDraftLimit;
	}
	public int getOverDraftLimit()
	{
		return overDraftLimit;
	}
	public void setOverDraftLimit(int overDraftLimit) 
	{
		this.overDraftLimit = overDraftLimit;
	}
	public boolean validateOverDraft(double amount)
	{
        return (getBalance() - amount) >= overDraftLimit;
    }
	
}
