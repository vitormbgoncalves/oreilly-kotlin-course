package com.github.vitormbgoncalves.introduction.inheritance

/**
 * Sample Generic Class
 *
 * @author Vitor Goncalves
 * @since 06.04.2021, ter, 11:47
 */

class GenericRepository<T> : Repository<T> {
    override fun getById(id: Int): T {
        TODO("Not yet implemented")
    }

    override fun getAll(): List<T> {
        TODO("Not yet implemented")
    }
}

fun main(args: Array<String>) {
    val customerRepo = GenericRepository<Customer>()

    val customer = customerRepo.getById(10)
    val customers = customerRepo.getAll()
}

interface Repo {
    fun <T> getById(id: Int): T
    fun <R> getAll(): List<R>
}

class MyRepo : Repo {
    override fun <T> getById(id: Int): T {
        TODO("Not yet implemented")
    }

    override fun <R> getAll(): List<R> {
        TODO("Not yet implemented")
    }
}