package com.github.vitormbgoncalves.kotlincourse.classes

/**
 * Objects in Kotlin
 *
 * @author Vitor Goncalves
 * @since 05.04.2021, seg, 19:46
 */

object Global {
    val PI = 3.14
}

fun main(args: Array<String>) {

    val localObject = object {
        val PI = 3.14159
    }

    println(localObject.PI)
    println(Global.PI)
}
