package homework.homework01.task2;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void main() {
        String input = "John\nNew York";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    }
}