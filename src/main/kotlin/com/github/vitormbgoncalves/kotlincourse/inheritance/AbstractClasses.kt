package com.github.vitormbgoncalves.kotlincourse.inheritance

/**
 * Abstract Classes in Kotlin
 *
 * @author Vitor Goncalves
 * @since 06.04.2021, ter, 09:46
 */

abstract class StoredEntity {
    val isActive = true
    abstract fun store()
    fun status(): String {
        return isActive.toString()
    }
}

class Employee : StoredEntity() {
    override fun store() {
        TODO("Not yet implemented")
    }
}

fun main(args: Array<String>) {
    val se = Employee()
    se.isActive
}
