package com.github.vitormbgoncalves.advanced.delegation

/**
 * Delegating Member Functions in Kotlin
 *
 * @author Vitor Goncalves
 * @since 15.04.2021, qui, 09:44
 */

interface Repository {
    fun getById(id: Int): Int
}

interface Logger {
    fun LogAll()
}

class Controller(repository: Repository, logger: Logger) : Repository by repository, Logger by logger {
    fun index() {
    }
}