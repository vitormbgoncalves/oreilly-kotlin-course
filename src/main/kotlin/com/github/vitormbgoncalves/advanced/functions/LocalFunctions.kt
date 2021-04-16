package com.github.vitormbgoncalves.advanced.functions

/**
 * Local Functions in Kotlin
 *
 * @author Vitor Goncalves
 * @since 12.04.2021, seg, 14:38
 */

fun foo(fooParam: String) {

    val outerFunction = "Value"
    fun bar(barParam: String) {

        println(barParam)
        println(fooParam)
        println(outerFunction)
    }
    return bar("Embedded Functions")
}

fun main(args: Array<String>) {

    foo("Some value")
}