package com.github.vitormbgoncalves.advanced.functions

/**
 * Anonymous Functions in Kotlin
 *
 * @author Vitor Goncalves
 * @since 12.04.2021, seg, 16:00
 */

fun op(x: Int, op: (Int) -> Int): Int {
    return op(x)
}

fun main(args: Array<String>) {

    op(3) { it + it }

    // funcao anonima
    op(2, fun(x): Int {
        if (x > 10) {
            return 0
        } else {
            return x + x
        }
    })
}