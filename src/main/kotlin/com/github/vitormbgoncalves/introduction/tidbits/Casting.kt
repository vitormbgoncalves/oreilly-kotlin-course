package com.github.vitormbgoncalves.introduction.tidbits

/**
 * Type Casting in Kotlin
 *
 * @author Vitor Goncalves
 * @since 06.04.2021, ter, 17:31
 */

open class Person

class Employee : Person() {
    fun vacationDays(days: Int) {
        if (days < 60) {
            println("You need more vacation")
        }
    }
}

class Contractor : Person()

fun hasVacation(obj: Person) {
    if (obj is Employee) {
        obj.vacationDays(20)
    }
}

var input: Any = 10

fun main(args: Array<String>) {

    val str = input as? String

    println(str?.length)
}