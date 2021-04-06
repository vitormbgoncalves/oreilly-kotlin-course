package com.github.vitormbgoncalves.kotlincourse.inheritance

/**
 * Interfaces in Kotlin
 *
 * @author Vitor Goncalves
 * @since 06.04.2021, ter, 10:08
 */

interface CustomerRepository {
    val isEmpty: Boolean
        get() = true

    fun store(obj: Customer) {
        // implement code to store
    }

    fun getById(id: String): Customer
}

class SQLCustomerRepository : CustomerRepository {
    override fun getById(id: String): Customer {
        TODO("Not yet implemented")
    }

    override val isEmpty: Boolean
        get() = false
}

interface Interface1 {
    fun funA() {
        println("Fun A from Interfaces 1")
    }
}

interface Interface2 {
    fun funA() {
        println("Fun A from Interfaces 2")
    }
}

class Class1And2 : Interface1, Interface2 {
    override fun funA() {
        super<Interface2>.funA()
    }
}

fun main(args: Array<String>) {
    val c = Class1And2()
    c.funA()
}
