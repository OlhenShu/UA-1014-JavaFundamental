package practical.practical05.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {

    @Test
    void isPrime() {
        assertEquals(true, PrimeNumber.isPrime(59));
    }
    @Test
    void isNotPrime(){
        assertEquals(false, PrimeNumber.isPrime(57));
    }
}