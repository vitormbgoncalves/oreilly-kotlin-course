package com.github.vitormbgoncalves.advanced.metaprogramming

/**
 * Type Erasure on the JVM
 *
 * @author Vitor Goncalves
 * @since 16.04.2021, sex, 11:31
 */

fun <T> printList(list: List<T>) {
    if (list is List<*>) {
        println("This is a list")
    }
}

fun <T> printList(obj: T) {
    when (obj) {
        is Int -> println("This is an int")
        is String -> println("This is an String")
    }
}

inline fun <reified T> erased(input: List<Any>) {
    if (input is T) {
        //
    }
}

inline fun <reified T> typeInfo() {
    println()
}

fun main(args: Array<String>) {

    val listString = listOf("one", "Two", "Three")
    val listNumbers = listOf(1, 2, 3)
}