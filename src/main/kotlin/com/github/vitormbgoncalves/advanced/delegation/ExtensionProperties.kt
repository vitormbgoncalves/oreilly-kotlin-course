package com.github.vitormbgoncalves.advanced.delegation

/**
 * Extension Properties in Kotlin
 *
 * @author Vitor Goncalves
 * @since 15.04.2021, qui, 11:52
 */

val String.hasAmpersand: Boolean
    get() = this.contains("&")

fun main(args: Array<String>) {

    println("Hello".hasAmpersand)
    println("Hello & Bye".hasAmpersand)
}
