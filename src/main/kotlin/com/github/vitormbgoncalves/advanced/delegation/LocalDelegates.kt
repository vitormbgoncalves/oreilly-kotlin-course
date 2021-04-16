package com.github.vitormbgoncalves.advanced.delegation

/**
 * Local Delegates in Kotlin


 *
 * @author Vitor Goncalves
 * @since 15.04.2021, qui, 11:47
 */

fun localDelegateProperties(){
    val lazy by lazy { initLate() }
}

fun initLate(): String {
    throw UnsupportedOperationException("not implemented")
}