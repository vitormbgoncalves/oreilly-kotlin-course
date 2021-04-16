package com.github.vitormbgoncalves.advanced.classes

/**
 * Sealed Classes in Kotlin
 *
 * @author Vitor Goncalves
 * @since 14.04.2021, qua, 16:30
 */

sealed class PageResult {
}

class Success(val content: String) : PageResult()
class Error(val code: Int, val message: String) : PageResult()

fun getURLPage(url: String): PageResult {

    val wasValidCall = false

    if (wasValidCall) {
        return Success("The content")
    } else {
        return Error(404, "Not found")
    }
}

fun main() {

    val pageResult = getURLPage("/")
    when (pageResult) {
        is Success -> println(pageResult.content)
        is Error -> println(pageResult.code)
    }
}