@file:JvmName("UtilityClass")
package com.github.vitormbgoncalves.introduction.interop

/**
 * Top-level Functions and Properties in Kotlin
 *
 * @author Vitor Goncalves
 * @since 08.04.2021, qui, 19:43
 */

fun prefix(prefix: String, value: String): String {
    return "$prefix-$value"
}

const val CopyrightYear = 2016