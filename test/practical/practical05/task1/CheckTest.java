package practical.practical05.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckTest {

    @Test
    void checkTrue() {
        assertEquals(true, Check.check(8));
    }
    @Test
    void checkFalse() {
        assertEquals( false, Check.check(12));
    }
}