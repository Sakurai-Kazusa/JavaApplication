import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {

    @Test
    void isPrimeTest() {
        assertTrue(PrimeNumber.isPrime(5));
        assertFalse(PrimeNumber.isPrime(10));
        assertThrows(IllegalArgumentException.class, () -> {
            PrimeNumber.isPrime(-5);
        });
    }

    @Test
    void getPrimeTest() {
        assertEquals(7, PrimeNumber.getPrime(4));
        assertEquals(11, PrimeNumber.getPrime(5));
        assertEquals(17, PrimeNumber.getPrime(7));
    }

    @Test
    void getGeneratePrimeTest() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(5);
        list1.add(7);
        assertEquals(list1, PrimeNumber.generatePrimes(4));
    }
}
