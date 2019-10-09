package ch02

import geometry.shapes.Rectangle
import geometry.shapes.createRandomRectangle
import org.junit.Test

import org.junit.Assert.*

class RectangleTest {

    @Test
    fun isSquare() {
        val a = Rectangle(2, 2);
        assertTrue(a.isSquare());
    }

    @Test
    fun isSquare2() {
        val a = createRandomRectangle();
        assertTrue(a.isSquare());
    }
}