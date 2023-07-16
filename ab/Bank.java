package com.ab;
public class Bank
{
	private String bankName;
	private String branchName;
	private Account[] accounts;
	private int index=0;
	public Bank() {}
	public Bank(String bankName, String branchName) {
		this.bankName = bankName;
		this.branchName = branchName;
		this.accounts=new Account[10];
		this.index=0;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public boolean addAccount(Account account)
	{	
		if(index>=10)
		{
			throw new RuntimeException("Can't add more than 10 files");
		}
		if(account instanceof SavingsAccount | account instanceof CurrentAccount)
		{
			accounts[index]=account;
			index++;
			return true;
		}
		return false;				
	}	
	 public void showAccounts() {
		   System.out.println("Bank Name :"+"SBI");
           System.out.println("Branch Name :"+ "Hyderabad Main Branch");
           System.out.println("Accounts");
           System.out.println("-----------------------------");
		 for (int i = 0; i < index; i++) {
	            Account account = accounts[i];
	            System.out.println("Account Number: " + account.getAccountNo());
	            System.out.println("Opened Date: " + account.getOpenedDate());
	            System.out.println("Balance: " + account.getBalance());
	            System.out.println("----------------------");
	        }
	 
	    }

	    public boolean transaction(char ttype, int accountNo, double amount)
	    {
	        Account account = findAccount(accountNo);
	        if (account == null)
	        {
	            throw new RuntimeException("Account not found.");
	        }
	        if (ttype == 'd') 
	    	{
	            account.setBalance(account.getBalance() + amount);
	            return true;
	        }
	        else if (ttype == 'w') 
	        {
	            if (account instanceof SavingsAccount)
	            {
	                SavingsAccount savingsAccount = (SavingsAccount) account; 
	            
	                
	                	if (savingsAccount. validateDepositAmount(amount))
	                	{
	                		account.setBalance(account.getBalance() - amount);
	                		
	                		return true;
	                	}
	                	else 
	                	{
	                		throw new InsufficientBalanceException("Insufficient balance.");
	                	}
	                }
	            
	            }
	        	else if (account instanceof CurrentAccount)
	            {
	                CurrentAccount currentAccount = (CurrentAccount) account;
	                if (currentAccount.validateOverDraft(amount))
	                {
	                	account.setBalance(account.getBalance() - amount);
	                	return true;
	                }
	                else 
	                {
	                		throw new InsufficientBalanceException("Insufficient balance.");
	                }
	                    
	               }
	        return false;
	    }  
	    private Account findAccount(int accountNo) {
	        for (int i = 0; i < index; i++) {
	            if (accounts[i].getAccountNo() == accountNo) {
	                return accounts[i];
	            }
	        }
	        return null;
	    }
	}

	
	
	
	
	
	
	
	
