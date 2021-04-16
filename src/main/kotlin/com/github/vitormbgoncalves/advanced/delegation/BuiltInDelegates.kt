package com.github.vitormbgoncalves.advanced.delegation

import kotlin.properties.Delegates

/**
 * Built-in Delegated Properties in Kotlin
 *
 * @author Vitor Goncalves
 * @since 15.04.2021, qui, 11:34
 */

class Veto {
    var value: String by Delegates.vetoable("String") { prop, old, new -> new.startsWith("S")}

}

fun main(args: Array<String>) {

    val veto = Veto()

    println(veto.value)
    veto.value = "London"
    println(veto.value)
    veto.value = "Spain"
    println(veto.value)
}