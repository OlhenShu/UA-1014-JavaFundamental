package practical.practical05.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageTest {

    @Test
    void getAverage() {
        int[] arr = {50, 90, 10, 100, 0};
        assertEquals(50,Average.getAverage(arr));
    }
}