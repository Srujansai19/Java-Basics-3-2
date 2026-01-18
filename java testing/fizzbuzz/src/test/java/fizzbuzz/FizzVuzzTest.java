package fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class FizzVuzzTest {

    @Test
    void testFizz() {
        assertEquals("fizz", FizzBuzz.getResult(3));
    }

    @Test
    void testBuzz() {
        assertEquals("buzz", FizzBuzz.getResult(5));
    }

    @Test
    void testFizzBuzz() {
        assertEquals("fizzbuzz", FizzBuzz.getResult(15));
    }

    @Test
    void testNormalNumber() {
        assertEquals("7", FizzBuzz.getResult(7));
    }
}
