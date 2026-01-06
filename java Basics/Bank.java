import java.util.*;

public class Bank {
    String acc_no;
    int amount;
    int balance = 50000;

    public Bank(String acc_no, int amount) {
        this.acc_no = acc_no;
        this.amount = amount;
    }

    void display() {
        if (acc_no == null || acc_no.length() != 12) {
            System.out.println("Account number is invalid");
        } else {
            System.out.println("Account number is valid");

            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal successful");
                System.out.println("Remaining balance: " + balance);
            } else {
                System.out.println("Amount is insufficient");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Account number: ");
        String acc_no = sc.next();

        System.out.print("Enter the Amount: ");
        int amount = sc.nextInt();

        Bank b = new Bank(acc_no, amount);
        b.display();
    }
}
