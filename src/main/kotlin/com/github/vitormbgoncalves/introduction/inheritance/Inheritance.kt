package com.github.vitormbgoncalves.introduction.inheritance

/**
 * Inheritance in Kotlin
 *
 * @author Vitor Goncalves
 * @since 05.04.2021, seg, 19:55
 */

open class Person {
    open fun validate() {
    }
}

open class Customer : Person {
    open override fun validate() {
    }

    constructor() : super()
}

class SpecialCustomer : Customer() {
    override fun validate() {
        super.validate()
    }
}

data class CustomerEntity(val name: String) : Person()

fun main(args: Array<String>) {
    val customer = Customer()

    customer.validate()
}