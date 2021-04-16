package com.github.vitormbgoncalves.advanced.functions

/**
 * Inline Functions in Kotlin
 *
 * @author Vitor Goncalves
 * @since 12.04.2021, seg, 16:39
 */

inline fun nonOp(x: Int) {

}

inline fun operation(op: () -> Unit) {
    println("Before calling op()")
    op()
    println("After calling op()")
}

fun anotherFunction() {
    operation { println("This is the actual op function") }
}

fun main(args: Array<String>) {
    operation { println("This is the actual op function") }
}