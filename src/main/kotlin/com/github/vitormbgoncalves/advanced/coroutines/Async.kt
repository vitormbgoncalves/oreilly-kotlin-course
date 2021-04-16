package com.github.vitormbgoncalves.advanced.coroutines

import java.util.concurrent.CompletableFuture
import kotlinx.coroutines.async

/**
 * Async and Await in Kotlin
 *
 * @author Vitor Goncalves
 * @since 16.04.2021, sex, 16:46
 */

private fun startLongAsyncOperation(v: Int) =
    CompletableFuture.supplyAsync {
        Thread.sleep(1000)
        "Result: $v"
    }

fun main(args: Array<String>) {
    val future = async<String> {

        (1..5).map {
            await(startLongAsyncOperation(it))

        }.joinToString("\n")
    }
    println("This before")
    println(future.get())
    println("This after")
}
