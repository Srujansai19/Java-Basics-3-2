import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AccountTest {

    @Test
    void testAccountCreation() {
        Account acc = new Account(1000);
        assertEquals(1000, acc.getBalance());
    }

    @Test
    void testDeposit() {
        Account acc = new Account(500);
        assertEquals(800, acc.deposit(300));
    }

    @Test
    void testWithdraw() {
        Account acc = new Account(1000);
        assertEquals(600, acc.withdraw(400));
    }

    @Test
    void testInterestCalculation() {
        Account acc = new Account(2000);
        assertEquals(200, acc.calculateInterest(10));
    }

    @Test
    void testWithdrawInsufficientBalance() {
        Account acc = new Account(500);
        assertEquals(500, acc.withdraw(1000)); 
    }

    @Test
    void testWithdrawSuccess() {
        Account acc = new Account(500);
        assertEquals(300, acc.withdraw(200));
    }
}
