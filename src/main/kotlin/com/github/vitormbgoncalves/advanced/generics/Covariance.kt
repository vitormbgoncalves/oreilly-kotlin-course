package com.github.vitormbgoncalves.advanced.generics

/**
 * Covariance in Kotlin
 *
 * @author Vitor Goncalves
 * @since 15.04.2021, qui, 17:59
 */

open class Person
class Employee : Person()

fun operate(person: List<Person>) {
}

interface ReadOnlyRepo<out T> {
    fun getId(id: Int): T
    fun getAll(): List<T>
}

interface WriteRepo<in T> {
    fun save(obj: T)
    fun saveAll(list: List<T>)
}

fun main() {

    operate(listOf<Employee>())
    operate(listOf<Person>())

    val ro = ReadOnlyRepoImpl<Employee>()

    ro.getAll()
}
