public class Account {

    private double balance;

    public Account(double initialBalance) {
        if (initialBalance < 0) {
            System.out.println("Initial balance cannot be negative");
            this.balance = 0;
        } else {
            this.balance = initialBalance;
        }
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive");
            return balance;
        }
        balance += amount;
        return balance;
    }

    public double withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw amount must be positive");
            return balance;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance");
            return balance;
        }
        balance -= amount;
        return balance;
    }

    public double calculateInterest(double rate) {
        if (rate < 0) {
            System.out.println("Interest rate cannot be negative");
            return 0;
        }
        return balance * rate / 100;
    }
}
