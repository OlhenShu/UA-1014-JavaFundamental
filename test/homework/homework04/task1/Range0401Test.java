package homework.homework04.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Range0401Test {

    @Test
    void checkRangeTest() {
        assertEquals(true, Range0401.checkRange(-1));
    }
    @Test
    void checkRangeTest2() {
        assertEquals(false, Range0401.checkRange(-10));
    }
}