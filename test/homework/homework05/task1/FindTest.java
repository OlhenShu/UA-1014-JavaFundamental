package homework.homework05.task1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void positionPositive() {
        int[] arr = {5, -1, -1, 3, 8};
        assertEquals(3, Find.positionPositive(arr));
    }
    @Test
    void positionPositiveNone() {
        int[] arr = {5, -1, -1, -3, -8};
        assertEquals(0, Find.positionPositive(arr));
    }

    /*@Test
    void minValue() {
        int[] arr = {5, -1, -1, 3, 8};
        int[] result = {-1, 1};
        assertEquals(new int[]{-1, 1}, Find.minValue(arr));
    }*/

    @Test
    void productValue() {
        int[] arr = {5, -1, 0, 6, 9};
        assertEquals(-270, Find.productValue(arr));
    }
}