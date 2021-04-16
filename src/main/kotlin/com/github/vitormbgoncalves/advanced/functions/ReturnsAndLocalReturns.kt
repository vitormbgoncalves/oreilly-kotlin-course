package com.github.vitormbgoncalves.advanced.functions

/**
 * Returns and Local Returns in Kotlin
 *
 * @author Vitor Goncalves
 * @since 12.04.2021, seg, 17:37
 */

inline fun <T> Iterable<T>.myForEach(action: (T) -> Unit): Unit {
    for (element in this) action(element)
}

fun containingFunctions() {
    val numbers = 1..100

    numbers.forEach (fun(element) {
        if (element % 5 == 0) {
            return
        }
    })
    println("Hello")
}

fun main(args: Array<String>) {

    containingFunctions()
}