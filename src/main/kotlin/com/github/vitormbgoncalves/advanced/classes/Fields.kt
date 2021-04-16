package com.github.vitormbgoncalves.advanced.classes

/**
 * Fields in Kotlin
 *
 * @author Vitor Goncalves
 * @since 13.04.2021, ter, 15:30
 */

class Customer() {
    var lastPurchasedAmount: Double = 0.0
        set(value) {
            if (value > 100) {
                field = value
            }
        }
}

fun main(args: Array<String>) {
    val customer = Customer()

    println(customer.lastPurchasedAmount)
    customer.lastPurchasedAmount = 200.0
    println(customer.lastPurchasedAmount)
    customer.lastPurchasedAmount = 50.0
    println(customer.lastPurchasedAmount)
}