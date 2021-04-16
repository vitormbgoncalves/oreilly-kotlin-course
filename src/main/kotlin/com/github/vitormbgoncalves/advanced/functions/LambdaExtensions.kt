package com.github.vitormbgoncalves.advanced.functions

/**
 * Lambda Extensions in Kotlin
 *
 * @author Vitor Goncalves
 * @since 13.04.2021, ter, 10:45
 */

class Request(val method: String, val query: String, val contentType: String)
class Response(var contents: String, var status: Int) {
    operator fun invoke(status: Status.() -> Unit) {
        //
    }
}
class Status(var code: Int, var description: String)

class RouterHandler(val request: Request, val reponse: Response) {
    var executeNext = false
    fun next() {
        executeNext = true
    }
}
fun reponse(reponse: Response.() -> Unit) {}

fun routeHandler(path: String, f: RouterHandler.() -> Unit): RouterHandler.() -> Unit = f

fun main(args: Array<String>) {
    routeHandler("/index.html") {
        if (request.query != "") {
            // process
        }
        reponse {
                code = 404
                description = "Not found"
        }
    }

    // invoking functions
    val manager = Manager()
    manager("Do Something!")
}
 class Manager {
    operator fun invoke(str: String) {
        //
    }
 }