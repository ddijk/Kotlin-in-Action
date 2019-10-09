package geometry.shapes

import java.util.Random

class Rectangle(val height: Int, val width: Int) {
//    val isSquare: Boolean get() = height == width
    fun isSquare() = height==width
}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}

fun main(args: Array<String> ) {

    var a = createRandomRectangle();
    println(a.isSquare());
    a = Rectangle(2,2);
    println(a.isSquare());

    val b = A("Dick");
    println(b.name);

}

data class A (val name : String);
