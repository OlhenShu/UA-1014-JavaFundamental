package homework.homework04.task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    Dog dog1 = new Dog("Lucky", 0, Breed.CORGI);
    Dog dog2 = new Dog("Lucky", -5, Breed.RETRIEVER);
    Dog dog3 = new Dog("Pepper", 1, Breed.POODLE);
    @Test
    void testEqualsTest() {
        assertEquals(true, dog1.equals(dog2));
    }

    @Test
    void testEqualsTest2() {
        assertEquals(false, dog3.equals(dog2));
    }
}