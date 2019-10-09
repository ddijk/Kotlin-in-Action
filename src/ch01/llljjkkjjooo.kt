package ch01

fun main(args: Array<String>) {
    println("Hello, world!"+ a())

    for (  a in args) {
        println(a)
    }
}
fun a() : Int {  return 1}