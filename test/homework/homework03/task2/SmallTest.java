package homework.homework03.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallTest {

    @Test
    void getSmallTest() {
        assertEquals(-150, Small.getSmall(14,0,-150));
    }
}