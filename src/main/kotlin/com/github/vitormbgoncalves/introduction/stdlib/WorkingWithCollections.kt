package com.github.vitormbgoncalves.introduction.stdlib

/**
 * Collections Kotlin Standart Library
 *
 * @author Vitor Goncalves
 * @since 09.04.2021, sex, 22:03
 */

fun main(args: Array<String>) {

    // lista de strings vazia imutavel
    val lis = listOf(String)

    // lista de strings imutavel
    val cities = listOf("Sao Paulo", "Brasilia", "Rio de Janeiro")

    // lista de numeros imutavel
    val numbers = 1..3

    // lista de strings imutavel
    val mutableCities = mutableListOf("Madrid")
    mutableCities.add("London")
    mutableCities.remove("Madrid")
    println(mutableCities)

    // hashMap (listas key-value)
    val hashMap = hashMapOf(Pair("Madrid", "Spain"), Pair("Paris", "France"))

    // arrays
    val booleans = booleanArrayOf(true, false, true)
    val characters = charArrayOf('A', 'B', 'C')
}