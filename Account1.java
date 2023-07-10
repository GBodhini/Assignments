import java.time.LocalDate;
class Account1
{
	private int accountNumber;
	private double balance;
	private String accountHolderName;
	private LocalDate openedDate;
	public Account1() {}
	public Account1(int accountNumber, double balance, String accountHolderName, LocalDate openedDate) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountHolderName = accountHolderName;
		this.openedDate = openedDate;
	}
	public boolean equals(Object obj)
	{
		if(obj instanceof Account1)
		{
			Account1 a1= (Account1)obj;
			return accountNumber == a1.accountNumber && balance==a1.balance && accountHolderName.equals(a1.accountHolderName) && openedDate.equals(a1.openedDate);
		}
		return false;
	}
	public String toString()
	{
		return "Account Number :"+ accountNumber +"\nBalance : " + balance+ "\nAccount Holder Name: "  + accountHolderName+ "\nOpened Date:   " + openedDate;
	}
	
}
