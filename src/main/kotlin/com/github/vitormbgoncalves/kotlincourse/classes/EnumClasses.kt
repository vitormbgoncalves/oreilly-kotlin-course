package com.github.vitormbgoncalves.kotlincourse.classes

/**
 * Enum Classes in Kotlin
 *
 * @author Vitor Goncalves
 * @since 05.04.2021, seg, 19:03
 */

enum class Priority(val value: Int) {
    MINOR(-1) {
        override fun text(): String {
            return "Minor Priority"
        }

        override fun toString(): String {
            return "Minor Priority"
        }
    },
    NORMAL(0) {
        override fun text(): String {
            TODO("Not yet implemented")
        }
    },
    MAJOR(1) {
        override fun text(): String {
            TODO("Not yet implemented")
        }
    },
    CRITICAL(10) {
        override fun text(): String {
            TODO("Not yet implemented")
        }
    };

    abstract fun text(): String
}

fun main(args: Array<String>) {
    val priority = Priority.NORMAL

    println(priority)
    println(priority.value)
    println(priority.ordinal)
    println(Priority.CRITICAL.ordinal)
    println(Priority.CRITICAL.value)

    for (priorityInList in Priority.values()) {
        println(priorityInList)
    }

    println(Priority.valueOf("MAJOR").value)
    println(Priority.valueOf("MAJOR").ordinal)
    println(Priority.MINOR)
    println(Priority.MINOR.text())
}
