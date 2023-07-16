package com.ab;
public class SavingsAccount extends Account
{
	private double minimumDepositAmount;
	private int noOfTransactionsPerDay;
	public SavingsAccount() {}
	public SavingsAccount(int accountNo, String openedDate, double balance,double minimumDepositAmount, int noOfTransactionsPerDay) {
		super(accountNo,openedDate,balance);
		this.minimumDepositAmount = minimumDepositAmount;
		this.noOfTransactionsPerDay = noOfTransactionsPerDay;
	}
	public double getMinimumDepositAmount() {
		return minimumDepositAmount;
	}
	public void setMinimumDepositAmount(int minimumDepositAmount) {
		this.minimumDepositAmount = minimumDepositAmount;
	}
	public int getNoOfTransactionsPerDay() {
		return noOfTransactionsPerDay;
	}
	public void setNoOfTransactionsPerDay(int noOfTransactionsPerDay) {
		this.noOfTransactionsPerDay = noOfTransactionsPerDay;
	}
		
	 public boolean validateDepositAmount(double amount) 
	 {
	        return (getBalance()-amount) >= minimumDepositAmount;
	 }

	 public boolean validateNoOfTransactions(int count)
	 {
	        return count <= noOfTransactionsPerDay;
	 }
}
