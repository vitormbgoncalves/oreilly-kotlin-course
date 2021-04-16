package com.github.vitormbgoncalves.advanced.metaprogramming

/**
 * Custom Annotations in Kotlin & Summary
 *
 * @author Vitor Goncalves
 * @since 16.04.2021, sex, 11:47
 */

@Target(AnnotationTarget.CLASS)
annotation class Table(val name: String)

@Target(AnnotationTarget.PROPERTY)
annotation class Field(val name: String)

@Table(name = "ContactTable")
data class Contact(val id: Int, @Field(name = "NAME") val name: String, val email: String)

fun main(args: Array<String>) {

    val annotation = Contact::class.annotations.find { it.annotationClass.simpleName == "Table" }

    println(annotation)
}
