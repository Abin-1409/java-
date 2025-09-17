class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public final String getAccountType() {
        return "Savings";
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(double balance) {
        super(balance);
    }
}

public class BankTest {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1000);
        sa.deposit(500);
        sa.withdraw(500);

        System.out.println("Account Type: " + sa.getAccountType());
        System.out.println("Balance after withdrawal: " + sa.balance);
    }
}