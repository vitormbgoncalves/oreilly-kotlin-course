package com.github.vitormbgoncalves.introduction.nulls

/**
 * Null Safety in Kotlin
 *
 * @author Vitor Goncalves
 * @since 06.04.2021, ter, 16:30
 */

class Service {
    fun evaluate() {}
}
class ServiceProvider {
    fun createServices(): Service = Service()
}

fun main(args: Array<String>) {
    val message: String = "Message"

    var nullMessage: String? = null
    val inferredNull = null

    // opcao 1
    println(nullMessage?.length)

    // opcao 2
    if (nullMessage != null) {
        println(nullMessage.length)
    }

    // opcao 3
    println(nullMessage?.length)

    val sp = createsServiceProvider()

    sp.createServices()?.evaluate()
}

private fun createsServiceProvider(): ServiceProvider = ServiceProvider()