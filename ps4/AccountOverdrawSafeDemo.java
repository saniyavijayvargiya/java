package bank;
import bank.WithdrawThread;
import bank.Account;


class SafeAccount extends Account {
   
    SafeAccount(String name, int balance) {
        super(name, balance);
    } 

    public synchronized void withdraw(int amount) {
        super.withdraw(amount);
    }
}


public class AccountOverdrawSafeDemo {
    public static void main(String args[]) {

        SafeAccount account = new SafeAccount("Alex", 1000);
        
        WithdrawThread holder1 = new WithdrawThread(account, 500);
        WithdrawThread holder2 = new WithdrawThread(account, 600);
        holder1.start();                        //this is always print current balance first and then only not enough amount
        holder2.start();                        //because threads are synchronised
    }
}
