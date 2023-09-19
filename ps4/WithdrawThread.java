package bank;
import bank.Account;


public class WithdrawThread extends Thread {
    Account acc;
    int amount;
    
    WithdrawThread(Account acc, int amount) {
        this.acc = acc;
        this.amount = amount;
    }

    public void run() {
        acc.withdraw(amount);               //override the run method of threads to withdraw amount
    }
}
