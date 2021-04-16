package com.github.vitormbgoncalves.advanced.classes

import kotlin.properties.Delegates

/**
 * Type Aliases in Kotlin
 *
 * @author Vitor Goncalves
 * @since 14.04.2021, qua, 22:43
 */

typealias Name = String
typealias EmailData = String

data class Employee(val name: Name, val email: EmailData) {

    var department: String by Delegates.observable("", { property, oldValue, newValue ->
        println("Property ${property.name} has changed fron $oldValue to $newValue")
    })

    fun printName(String: String) {
        //
    }
}

fun main(args: Array<String>) {

    val employee = Employee("Hadi", "vitor@gmail.com")

    employee.printName("A String")

    employee.department = "IT"
}