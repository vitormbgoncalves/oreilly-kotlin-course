package com.github.vitormbgoncalves.advanced.delegation

import kotlin.reflect.KProperty

/**
 * Delegating Properties in Kotlin
 *
 * @author Vitor Goncalves
 * @since 15.04.2021, qui, 10:25
 */

class Service {
    var someProperty: String by ExternalFunctionality()
}

class ExternalFunctionality {
    var backingField = "Default"
    operator fun getValue(service: Service, property: KProperty<*>): String {
        println("getValue called with params: \n" +
            "service: $service\n" +
            "property: ${property.name}"
        )
        return backingField
    }

    operator fun setValue(service: Service, property: KProperty<*>, s: String) {
        backingField = s
    }
}

fun main(args: Array<String>) {

    val service = Service()

    println(service.someProperty)
    service.someProperty = "New Value"
    println(service.someProperty)
}

