package ch01

fun main(args: Array<String>) {
    println("Hello, world!"+ a())

    for (  a in args) {
        println(a)
        println(b("$a"))
    }

    val array = Array(7) { Math.pow(0.0+it,2.0) }

    for ( a in array)
    println(a)
}
fun a() : Int {  return 1}

fun b(naam : String ) : String {
    return "hallo $naam";
}