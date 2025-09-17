// Abstract class
abstract class BankAccount {
    private double balance;

    public BankAccount(double balance) { this.balance = balance; }

    // Encapsulation
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    // Abstract methods
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}

// SavingsAccount subclass
class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) { super(balance); }

    @Override
    public void deposit(double amount) { setBalance(getBalance() + amount); }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) setBalance(getBalance() - amount);
        else System.out.println("Insufficient balance");
    }
}

// CurrentAccount subclass
class CurrentAccount extends BankAccount {
    public CurrentAccount(double balance) { super(balance); }

    @Override
    public void deposit(double amount) { setBalance(getBalance() + amount); }

    @Override
    public void withdraw(double amount) { setBalance(getBalance() - amount); }
}

// Test class
public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(5000);
        CurrentAccount ca = new CurrentAccount(2000);

        sa.deposit(1000);
        sa.withdraw(2000);
        System.out.println("Savings Balance: " + sa.getBalance());

        ca.withdraw(3000);
        System.out.println("Current Balance: " + ca.getBalance());
    }
}
