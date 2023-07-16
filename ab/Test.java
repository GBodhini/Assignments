package com.ab;
public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank("SBI", "Hyderabad Main Branch");
        SavingsAccount s1 = new SavingsAccount(1, "2023-07-16", 10000.0,500.0, 2);
        SavingsAccount s2 = new SavingsAccount(2, "2023-07-17", 2500.0,1000.0, 4);
        SavingsAccount s3 = new SavingsAccount(3, "2023-07-18", 5000.0,1000.0, 5);
        SavingsAccount s4 = new SavingsAccount(4, "2023-07-19", 20000.0,1400.0, 6);
        SavingsAccount s5 = new SavingsAccount(5, "2023-07-12", 18000.0,1000.0, 7);
        SavingsAccount s6 =new SavingsAccount(10,"2023-07-16",10000.0,1500.0,5);
        bank.addAccount(s1);
        bank.addAccount(s2);
        bank.addAccount(s3);
        bank.addAccount(s4);
        bank.addAccount(s5);
        bank.addAccount(s6);
        

        CurrentAccount c1 = new CurrentAccount(6, "2023-07-01", 5000.0, 2000);
        CurrentAccount c2 = new CurrentAccount(7, "2023-07-02", 2500.0, 2000);
        CurrentAccount c3 = new CurrentAccount(8, "2023-07-03", 6000.0, 5000);
        CurrentAccount c4 = new CurrentAccount(9, "2023-07-04", 4000.0, 1000);
      //  CurrentAccount c5 = new CurrentAccount(11, "2023-07-04", 4000.0, 1000);
       
              
        bank.addAccount(c1);
        bank.addAccount(c2);
        bank.addAccount(c3);
        bank.addAccount(c4);
       // bank.addAccount(c5);

        
        
      bank.transaction('d',1,3000.0);
      bank.transaction('d',1,3000.0);
      bank.transaction('w', 8, 500);
    //  bank.transaction('w', 4, 19000);
   
        // Show all accounts
       bank.showAccounts();
    }
}
