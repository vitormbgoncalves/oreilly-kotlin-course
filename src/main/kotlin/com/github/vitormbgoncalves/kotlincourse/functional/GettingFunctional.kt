package com.github.vitormbgoncalves.kotlincourse.functional

/**
 * Higher-Order Functions in Kotlin
 *
 * @author Vitor Goncalves
 * @since 07.04.2021, qua, 10:59
 */

fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

/*fun operation2(x: Int, op: (Int) -> Unit) {

}

fun route(path: String, vararg action: (String, String) -> String) {

}*/

fun sum(x: Int, y: Int) = x + y

fun unaryOperatoration(x: Int, op: (Int) -> Int): Int {
    return op(x)
}

fun unaryOperatoration2(x: Int, op: (Int) -> Boolean): Boolean {
    return op(x)
}

fun transaction(db: Database, code: () -> Unit) {
    try {
        code()
    } finally {
        db.commit()
    }
}

class Database {
    fun commit() {}
}

fun main(args: Array<String>) {

    // Com funcao de ordem superior
    println(operation(1, 2, ::sum))

    // com lambda
    println(operation(1, 3) { x, y -> x + y })

    val sumLambda: (Int, Int) -> Int = { x, y -> x + y }

    // com lambda 2
    println(sumLambda(1, 4))

    // com lambda 3
    println(operation(1, 5, sumLambda))

    // com funcao anonima
    println(operation(1, 6, fun(x: Int, y: Int) = x + y))

    // quando a lambda tiver apenas um parametro usamos "it"
    println(unaryOperatoration(7) { it * 2 })

    println(unaryOperatoration2(8) { it >= 8 })

    // com funcao anonima
    println(unaryOperatoration(9, fun(x: Int): Int { return x * 2 }))

    val db = Database()

    transaction(db) {

    }


}

