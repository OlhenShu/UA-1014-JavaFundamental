package homework.homework03.task1;

import homework.homework05.task1.Find;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaTest {

    @Test
    void getAreaTest() {
        assertEquals(32.61901286060018, Area.getArea(5,15,18));
    }
}