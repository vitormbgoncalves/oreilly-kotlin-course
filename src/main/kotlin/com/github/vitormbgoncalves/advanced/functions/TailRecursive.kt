package com.github.vitormbgoncalves.advanced.functions

/**
 * Tail recursive functions
 *
 * @author Vitor Goncalves
 * @since 12.04.2021, seg, 19:57
 */

// nao e possivel recursao de cauda, a chamada recursiva nao e a ultima do metodo
fun factorial(number: Int): Int {
    when (number) {
        0, 1 -> return 1
        else -> return number * factorial(number - 1)
    }
}

// recursao de cauda, a chamada recursiva e a ultima chamada do metodo
tailrec fun factorialTR(number: Int, accumulator: Int = 1): Int {
    when (number) {
        0 -> return accumulator
        else -> return factorialTR(number - 1, accumulator * number)
    }
}

fun main(args: Array<String>) {
    println(factorial(5))
    println(factorialTR(5))
}