package bank;
import bank.Account;
import bank.WithdrawThread;


public class AccountOverdrawDemo {
    public static void main(String[] args) {
        
        Account account = new Account("Alex", 1000);
        
        WithdrawThread holder1 = new WithdrawThread(account, 500);    
        WithdrawThread holder2 = new WithdrawThread(account, 600);
        holder1.start();                                //may print not enough balance first, and then some amount as current balance
        holder2.start();                                //because withdraw method is not synchronized
    }
}
