package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapesTest {
    Shapes shape = new Shapes();

    @Test
    void testComputeSquareArea(){
        assertEquals(576, shape.computeSquareArea(24));
    }

    @Test
    void testComputeCircleArea(){
        assertEquals(12.56, shape.computeCircleArea(2), "Calculation of Area is Wrong");
    }
}
