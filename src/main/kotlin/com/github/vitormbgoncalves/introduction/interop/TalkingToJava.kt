package com.github.vitormbgoncalves.introduction.interop

import com.github.vitormbgoncalves.introduction.classes.CustomerJava

/**
 * Calling Java from Kotlin
 *
 * @author Vitor Goncalves
 * @since 08.04.2021, qui, 16:48
 */

fun main(args: Array<String>) {

    val customer = CustomerJava()

    customer.email = "vitor@gmail.com"

    customer.prettyPrint()

    val runnable = Runnable { println("Invoking runnable") }

    val kr = KotlinCustomerRepository()

    val customerJava = kr.getById(10)

    customerJava.id

    customer.neverNull()
}

class CustomerPersonKotlin : PersonJava()

class RunnableKotlin : Runnable {
    override fun run() {
        TODO("Not yet implemented")
    }
}

class KotlinCustomerRepository : CustomerRepository {
    override fun getById(id: Int): CustomerJava {
        TODO("Not yet implemented")
    }

    override fun getAll(): MutableList<CustomerJava> {
        TODO("Not yet implemented")
    }
}