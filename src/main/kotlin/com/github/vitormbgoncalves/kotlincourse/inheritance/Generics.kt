package com.github.vitormbgoncalves.kotlincourse.inheritance

/**
 * Generics in Kotlin
 *
 * @author Vitor Goncalves
 * @since 06.04.2021, ter, 10:59
 */

interface Repository<T> {
    fun getById(id: Int): T
    fun getAll(): List<T>
}
