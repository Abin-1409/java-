class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;
    private static int accountCount = 1000;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountNumber = ++accountCount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public Transaction transferTo(BankAccount target, double amount) {
        if (withdraw(amount)) {
            target.deposit(amount);
            return new Transaction(this.accountNumber, target.accountNumber, amount, "Success");
        } else {
            return new Transaction(this.accountNumber, target.accountNumber, amount, "Failed");
        }
    }

    public void displayAccount() {
        System.out.println("Account: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + balance);
    }
}

class Transaction {
    private int fromAccount;
    private int toAccount;
    private double amount;
    private String status;

    public Transaction(int fromAccount, int toAccount, double amount, String status) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.status = status;
    }

    public void displayTransaction() {
        System.out.println("From: " + fromAccount + ", To: " + toAccount + ", Amount: " + amount + ", Status: " + status);
    }
}

public class BankApp {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Alice", 5000);
        BankAccount a2 = new BankAccount("Bob", 2000);

        Transaction t1 = a1.transferTo(a2, 1000);
        Transaction t2 = a1.transferTo(a2, 6000);

        a1.displayAccount();
        a2.displayAccount();

        t1.displayTransaction();
        t2.displayTransaction();
    }
}
