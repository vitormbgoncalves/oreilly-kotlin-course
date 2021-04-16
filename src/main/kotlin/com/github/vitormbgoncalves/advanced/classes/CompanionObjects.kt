package com.github.vitormbgoncalves.advanced.classes

/**
 * Companion Objects in Kotlin
 *
 * @author Vitor Goncalves
 * @since 14.04.2021, qua, 11:18
 */

class Log() {

    companion object Factory {
        fun createFileLog(filename: String): Log = Log(filename)
    }

    constructor(filename: String) : this()
}

fun main(args: Array<String>) {

    val log = Log.createFileLog("filename.txt")
}