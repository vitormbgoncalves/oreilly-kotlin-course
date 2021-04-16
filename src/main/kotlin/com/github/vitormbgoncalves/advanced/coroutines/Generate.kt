package com.github.vitormbgoncalves.advanced.coroutines

import kotlinx.coroutines.generate
import kotlinx.coroutines.yield

/**
 * Yields in Kotlin
 *
 * @author Vitor Goncalves
 * @since 16.04.2021, sex, 18:23
 */

fun main(args: Array<String>) {
    val sequence = produce<Int> {
        for (i in 1..5) {
            yield(i)
        }
    }
    println(sequence.joinToString(" "))
}
