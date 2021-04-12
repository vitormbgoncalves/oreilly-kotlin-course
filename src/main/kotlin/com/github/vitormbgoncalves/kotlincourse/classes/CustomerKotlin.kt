package com.github.vitormbgoncalves.kotlincourse.classes

import java.io.IOException

/**
 *  Kotlin Data Class
 *
 * @author Vitor Goncalves
 * @since 05.04.2021, seg, 18:52
 */

data class CustomerKotlin(var id: Int, var name: String, var email: String) {
    @JvmField val someProperty = "Value"
    override fun toString(): String {
        return "{\"id\": $id, \"name\": $name}"
    }

    @JvmOverloads fun changeStatus(status: Status = Status.Current) {

    }

    @JvmName("preferential") fun makePreferred() {

    }

    @Throws(IOException::class)fun loadStatistics(filename: String) {
        if (filename == "") {
            throw IOException("Filename cannot be blank")
        }
    }
}

fun CustomerKotlin.extension() {
    
}

enum class Status {
    Current,
    Paste
}

fun main(args: Array<String>) {
    val customer1 = CustomerKotlin(1, "Vitor", "vitor@gmail.com")
    val customer2 = CustomerKotlin(1, "Vitor", "vitor@gmail.com")

    val customer3 = customer1

    if (customer1 == customer2) {
        println("They are the same")
    }
    val customer4 = customer1.copy(email = "vitor4@gmail.com")
    println(customer4.id)
    println(customer4.name)
    println(customer4.email)
    println(customer4)
}
