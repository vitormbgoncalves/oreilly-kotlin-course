package com.github.vitormbgoncalves.advanced.metaprogramming

import kotlin.reflect.KClass

/**
 * Reflection in Kotlin
 *
 * @author Vitor Goncalves
 * @since 15.04.2021, qui, 19:35
 */

fun getKotlinType(obj: KClass<*>) {
    println(obj.qualifiedName)
}

fun main() {

    /*val classInfo = Transaction::class

    classInfo.members.forEach {
        println("Properties ${it.name} of type ${it.returnType}")
    }

    classInfo.constructors.forEach {
        println("Constructor ${it.name} - ${it.parameters}")
    }

    getKotlinType(Transaction::class)*/

    val constructor = ::Transaction

    println(constructor)

    val trans = Transaction(1, 20.0, "New Value")

    println(trans.description)
}