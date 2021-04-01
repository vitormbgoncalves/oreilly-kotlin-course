package com.github.vitormbgoncalves.kotlincourse.basics

/**
 *  Conditional execution with if and when in Kotlin
 *
 * @author Vitor Goncalves
 * @since 31.03.2021, qua, 18:51
 */

fun main(args: Array<String>) {

    var myString = "Not Empty"

    if (myString != "") {
        println("Not empty")
    } else {
        println("Is Empty")
    }

    val result = if (myString != "") {
        "Not empty"
    } else {
        "Is Empty"
    }
    println(result)

    when (result) {
        is String -> println("Excellent")
    }

    val result2 = "Value"

    when (result2) {
        "Value" -> println("It`s a value")
    }

    val whenValue = when (result2) {
        "Value" -> {
            println("It`s a value")
            println("Second statement")
            "Returning from first when case"
        }
        is String -> println("Excelent")
        else -> println("It came to this?")
    }
    println(whenValue)
}