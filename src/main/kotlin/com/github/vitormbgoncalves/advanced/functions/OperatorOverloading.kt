package com.github.vitormbgoncalves.advanced.functions

import java.sql.Time

/**
 * Operator Overloading in Kotlin
 *
 * @author Vitor Goncalves
 * @since 13.04.2021, ter, 09:46
 */

/*
data class Time(val hours: Int, val mins: Int) {
    operator fun plus(time: Time): Time {
        val minutes = this.mins + time.mins
        val hoursInMinutes = minutes / 60
        val remainingMinutes = minutes % 60
        val hours = this.hours + time.hours + hoursInMinutes
        return Time(hours, remainingMinutes)
    }
}

operator fun StringBuilder.plus(stringBuilder: StringBuilder) {
    stringBuilder.forEach { this.append(it) }
}
fun main(args: Array<String>) {

    val newTime = Time(10, 40) + Time(3, 20)

    println(newTime)

    val sb = StringBuilder()
    for (str in sb) {
        str + "Value"
    }
}*/