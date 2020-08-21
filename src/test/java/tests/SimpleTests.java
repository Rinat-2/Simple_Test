package tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTests {
    @Test
    void simpleTest() {
        int a = 2;
        int b = 1;

        assertEquals(a + b, 3);
    }
}
