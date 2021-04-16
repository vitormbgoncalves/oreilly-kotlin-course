package com.github.vitormbgoncalves.introduction.functions

/**
 * Functions in Kotlin
 *
 * @author Vitor Goncalves
 * @since 05.04.2021, seg, 09:51
 */

fun hello() {
    println("Hello")
}

fun throwException(): Nothing {
    throw Exception("This function throw an exception")
}

fun returnsAFour(): Int {
    return 4
}

fun takingString(name: String) = println(name)

fun sum(x: Int, y: Int, z: Int = 0, w: Int = 0) = x + y + z + w

fun printDetails(name: String, email: String = "", phone: String) {
    println("name: $name - email: $email - phone: $phone")
}

fun printStrings(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}

fun printStrings2(vararg strings: String) {
    reallyPrintingStrings(strings)
}

private fun reallyPrintingStrings(strings: Array<out String>) {
    for (string in strings) {
        println(string)
    }
}

fun main(args: Array<String>) {

    hello()

    val value = returnsAFour()

    println(value)

    takingString("Some Value")

    sum(1, 2, 3)
    sum(1, 2)

    printDetails("Vitor", phone = "555 123")

    printStrings("1")
    printStrings("1", "2")
    printStrings("1", "2", "3")
    printStrings("1", "2", "3", "4")
}