package com.github.vitormbgoncalves.introduction.functional

/**
 * Closures in Kotlin
 *
 * @author Vitor Goncalves
 * @since 07.04.2021, qua, 17:24
 */

fun outsideFunction() {

    for (number in 1..5) {
        unaryOperatoration(20) { x ->
            println(number)
            x * number }
    }
}

fun main(args: Array<String>) {

    outsideFunction()
}