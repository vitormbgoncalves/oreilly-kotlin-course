package com.github.vitormbgoncalves.introduction.tidbits

/**
 * Contants in Kotlin
 *
 * @author Vitor Goncalves
 * @since 06.04.2021, ter, 21:10
 */

object Copyright {
    val author = "Vitor Goncalves"
}

val CopyrightAuthor = Copyright.author

fun main(args: Array<String>) {
    println(Copyright.author)
    println(Copyright)
}