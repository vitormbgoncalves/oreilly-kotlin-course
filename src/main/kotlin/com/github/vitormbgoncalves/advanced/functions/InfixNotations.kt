package com.github.vitormbgoncalves.advanced.functions

/**
 * Infix Notations in Kotlin
 *
 * @author Vitor Goncalves
 * @since 12.04.2021, seg, 15:26
 */
// this retorna o valor pasado no construtor
infix fun String.shouldBeEqualTo(value: String) = this == value

fun main(args: Array<String>) {

    "Hello".shouldBeEqualTo("Hello")

    // infix anotations
    val output = "Hello"

    output shouldBeEqualTo "Hello"
}