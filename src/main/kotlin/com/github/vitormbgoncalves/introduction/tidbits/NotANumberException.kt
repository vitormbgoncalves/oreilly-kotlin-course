package com.github.vitormbgoncalves.introduction.tidbits

import java.io.BufferedReader
import java.io.FileReader

/**
 * Working with Exceptions in Kotlin
 *
 * @author Vitor Goncalves
 * @since 06.04.2021, ter, 20:22
 */

class NotANumberException(message: String) : Throwable(message)

fun checkIsNumber(obj: Any) {
    when (obj) {
        !is Int, Long, Float, Double -> throw NotANumberException("This is not a number")
    }
}

fun main(args: Array<String>) {

    /*try {
        checkIsNumber("A")
    } catch (e: IllegalArgumentException) {
        println("${e.message}")
    } catch (e: NotANumberException) {
        println("${e.message}")
    }*/

    val buffer = BufferedReader(FileReader("input.txt"))
    val result = try {
        val chars = CharArray(30)
        buffer.read(chars, 0, 40)
    } catch (e: IndexOutOfBoundsException) {
        println("Exception handler")
    } finally {
        println("Clossing")
        buffer.close()
    }
    println(result)
}