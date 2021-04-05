package com.github.vitormbgoncalves.kotlincourse.classes

import java.util.Calendar

/**
 * Classes in Kotlin
 *
 * @author Vitor Goncalves
 * @since 05.04.2021, seg, 15:42
 */

class Customer(val id: Int, var name: String = "", val yearOfBirth: Int) {
    init {
        name = name.toUpperCase()
    }

    val age: Int
        get() {
            return Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth
        }

    var socialSecurityNumber: String = ""
        set(value) {
            if (!value.startsWith("SN")) {
                throw IllegalArgumentException("Social security should start with SN")
            }
            field = value
        }
}

fun main(args: Array<String>) {
    val customer = Customer(10, "Vitor", 1991)
    val customer2 = Customer(10, yearOfBirth = 1991)

    customer.socialSecurityNumber = "SN1234"

    println(customer.name)
    println(customer.age)
    println(customer.socialSecurityNumber)
}
