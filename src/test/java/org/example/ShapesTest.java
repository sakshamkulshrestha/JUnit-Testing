package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapesTest {
    @Test
    void testComputeSquareArea() {
        Shapes shape = new Shapes();
        assertEquals(576, shape.computeSquareArea(24));
    }
}
