public class Account {
    // variable-declarations
    // instance-variables
    private double balance;

    // constructor-declarations
    public Account(double initialBalance) {
        balance = initialBalance;
    }

    public Account() {
        balance = 0.0;
    }

    // method-declaration
    // instance-methods
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void close() {
        balance = 0.0;
    }

    public static void main(String[] args) {
        Account acc = new Account(1000.0);      // create account with $1000 balance
        System.out.println(acc.getBalance());
    }
}
