package com.github.vitormbgoncalves.advanced.classes

/**
 * Late Initialization in Kotlin
 *
 * @author Vitor Goncalves
 * @since 13.04.2021, ter, 15:51
 */

interface Repository {
    var cut: List<String>
    fun getAll(): List<String> {
        return cut
    }
}

class RepositoryImp : Repository {
    override var cut: List<String> = listOf("Kami", "Kaze")
}

class CustomerController {
    private lateinit var repository: Repository
    operator fun invoke(repositories: Repository): String {
        repository = repositories
        return repository.getAll().toString()
    }
}

fun main(args: Array<String>) {

    val customerController = CustomerController()

    // exemplo com lateinit com invoke operator
    println(customerController(RepositoryImp()))
}