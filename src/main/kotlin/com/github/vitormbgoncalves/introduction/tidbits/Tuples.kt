package com.github.vitormbgoncalves.introduction.tidbits

import com.github.vitormbgoncalves.introduction.classes.CustomerKotlin

/**
 * Pair and Triple in Kotlin
 *
 * @author Vitor Goncalves
 * @since 06.04.2021, ter, 18:05
 */

fun capitalAndPopulation(country: String): Pair<String, Long> {
    return when (country) {
        "Madrid" -> Pair("Madrid", 2300000)
        "Brasilia" -> Pair("Brasilia", 2700000)
        "Washington, D.C." -> Pair("Washington, D.C.", 692000)
        else -> Pair("No capital", 0)
    }
}

fun countyInformation(coutry: String): Triple<String, String, Long> {
    return Triple("Madrid", "Europe", 2300000)
}

fun main(args: Array<String>) {

    val result = capitalAndPopulation("Washington, D.C.")

    println(result.first)
    println(result.second)

    val countryInfo = countyInformation("Madrid")

    println()
    println(countryInfo.first)
    println(countryInfo.second)
    println(countryInfo.third)

    val (capital, continent, population) = countyInformation("Madrid")

    println()
    println(capital)
    println(continent)
    println(population)

    val (id, name, email) = CustomerKotlin(1, "Vitor", "vitor@gmail.com")

    println()
    println(id)
    println(name)
    println(email)
    println()

    val listCapitalsAndCountry = listOf(Pair("Madrid", "Spain"), "Paris" to "France")

    for ((capitals, country) in listCapitalsAndCountry) {
        println("$capitals - $country")
    }
}