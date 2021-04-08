package com.github.vitormbgoncalves.kotlincourse.functional

/**
 * Extension Functions in Kotlin
 *
 * @author Vitor Goncalves
 * @since 07.04.2021, qua, 17:52
 */

fun String.hello() {
    println("It`s me!")
}

fun String.toTitleCase(): String{
    return this.split(" ").joinToString(" ") { it.capitalize() }
}
fun String.toTitleCase2(prefix: String): String{
    return this.split(" ").joinToString(" ") {"$prefix ${it.capitalize()}"}
}

fun main(args: Array<String>) {

    "Hello".hello()

    println("this is a sample string to title case it".toTitleCase())
    println("this is a sample string to title case it".toTitleCase2("Again -"))

    val customer = Customer()
    customer.makePreferred("My new version")

    val instance: BaseClass = InheritedClass()
    instance.extension()
}

class Customer {
    fun makePreferred() {
        println("Customer version")
    }
}

fun Customer.makePreferred(message: String) {
    println(message)
}

open class BaseClass
class InheritedClass: BaseClass()

fun BaseClass.extension() {
    println("Base extension")
}

fun InheritedClass.extension() {
    println("Inherited extension")
}
