package bank;

class Account {
    String name;
    public int balance;

    Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("current balance is " + balance);
        } else {
            System.out.println("not enough balance");
        }
    }
}
