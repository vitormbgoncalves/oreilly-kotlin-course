package com.github.vitormbgoncalves.advanced.generics

/**
 * Sample Generics Class
 *
 * @author Vitor Goncalves
 * @since 15.04.2021, qui, 18:08
 */

class ReadOnlyRepoImpl<out T> : ReadOnlyRepo<T> {
    override fun getId(id: Int): T {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAll(): List<T> {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}